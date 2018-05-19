/*
 * Copyright (C) Carnegie Mellon University - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * This is proprietary and confidential.
 * Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */

package edu.cmu.lti.articulab.inmind.multiuser.common.net;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Creates an ordered {@link List} of {@link InetAddress} instances found for
 * all system {@link NetworkInterface adapters} which are
 * {@link NetworkInterface#isUp() running} and neither
 * {@link NetworkInterface#isVirtual() virtual} nor
 * {@link NetworkInterface#isLoopback() loopback} interfaces. For ordering,
 * Ethernet (i.e.&nbsp;not wireless) adapters are ordered first and wireless
 * adapters last. If an address' {@link NetworkInterface adapter} can be
 * identified as neither Ethernet nor wireless, addresses are sorted by their
 * respective adapter's {@link NetworkInterface#getMTU() MTU} in descending
 * order.
 *
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-15
 */
public final class PreferredInetAddressFinder {

	/**
	 * A {@link Comparable comparable} pair of {@link InetAddress} instance
	 * {@link Entry#getKey() keys} mapping to associated
	 * {@link NetworkInterface} {@link Entry#getValue() values}.
	 *
	 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
	 * @since 2018-05-15
	 *
	 */
	public final class InetAddressNetworkInterface implements Entry<InetAddress, NetworkInterface>,
			Comparable<Entry<? extends InetAddress, ? extends NetworkInterface>> {

		private final InetAddress addr;

		private NetworkInterface netInt;

		private InetAddressNetworkInterface(final InetAddress addr, final NetworkInterface netInt) {
			this.addr = addr;
			this.netInt = netInt;
		}

		@Override
		public int compareTo(final Entry<? extends InetAddress, ? extends NetworkInterface> other) {
			int result = PreferredInetAddressFinder.compare(getValue(), other.getValue());
			if (result == 0) {
				result = compare(getKey(), other.getKey());
			}
			return result;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(final Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof InetAddressNetworkInterface)) {
				return false;
			}
			final InetAddressNetworkInterface other = (InetAddressNetworkInterface) obj;
			if (!getOuterType().equals(other.getOuterType())) {
				return false;
			}
			if (addr == null) {
				if (other.addr != null) {
					return false;
				}
			} else if (!addr.equals(other.addr)) {
				return false;
			}
			if (netInt == null) {
				if (other.netInt != null) {
					return false;
				}
			} else if (!netInt.equals(other.netInt)) {
				return false;
			}
			return true;
		}

		@Override
		public InetAddress getKey() {
			return addr;
		}

		@Override
		public NetworkInterface getValue() {
			return netInt;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + (addr == null ? 0 : addr.hashCode());
			result = prime * result + (netInt == null ? 0 : netInt.hashCode());
			return result;
		}

		@Override
		public NetworkInterface setValue(final NetworkInterface value) {
			final NetworkInterface result = netInt;
			netInt = value;
			return result;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			final StringBuilder builder = new StringBuilder(256);
			builder.append("NetworkInterfaceInetAddress [netInt=");
			builder.append(netInt);
			builder.append(", addr=");
			builder.append(addr);
			builder.append("]");
			return builder.toString();
		}

		private PreferredInetAddressFinder getOuterType() {
			return PreferredInetAddressFinder.this;
		}

	}

	/**
	 * A {@link Pattern} matching network interface device names for LAN adapters;
	 * See <a href=
	 * "https://www.freedesktop.org/wiki/Software/systemd/PredictableNetworkInterfaceNames/">the
	 * <code>systemd</code> documentation</a>. Also see <a href=
	 * "https://github.com/systemd/systemd/blob/master/src/udev/udev-builtin-net_id.c#L20">the
	 * source code</a>. <strong>NOTE:</strong> Even though this only explicitly
	 * covers <code>systemd</code> conventions, Windows systems generally use
	 * older-style <code>systemd</code> names like <em>eth0</em> and <em>wlan0</em>.
	 */
	private static final Pattern LAN_ADAPTER_NAME_PATTERN = Pattern.compile("^e(?:(?:th)|(?:n)).*$",
			Pattern.CASE_INSENSITIVE);

	private static final Comparator<NetworkInterface> LAN_NAME_COMPARATOR = new Comparator<NetworkInterface>() {
		@Override
		public int compare(final NetworkInterface o1, final NetworkInterface o2) {
			final boolean b1 = isLANAdapter(o1);
			final boolean b2 = isLANAdapter(o2);

			final int result;
			if (b1) {
				if (b2) {
					result = 0;
				} else {
					result = -1;
				}
			} else if (b2) {
				result = 1;
			} else {
				result = 0;
			}
			return result;
		}
	};

	private static final Logger LOGGER = Logger.getLogger(PreferredInetAddressFinder.class.getName());

	/**
	 * A {@link Pattern} matching network interface device names for wireless
	 * LAN/WAN adapters; See <a href=
	 * "https://www.freedesktop.org/wiki/Software/systemd/PredictableNetworkInterfaceNames/">the
	 * <code>systemd</code> documentation</a>. Also see <a href=
	 * "https://github.com/systemd/systemd/blob/master/src/udev/udev-builtin-net_id.c#L20">the
	 * source code</a>. <strong>NOTE:</strong> Even though this only explicitly
	 * covers <code>systemd</code> conventions, Windows systems generally use
	 * older-style <code>systemd</code> names like <em>eth0</em> and <em>wlan0</em>.
	 */
	private static final Pattern WIFI_ADAPTER_NAME_PATTERN = Pattern.compile("^w[lw](?:an)?.*$",
			Pattern.CASE_INSENSITIVE);

	private static final Collection<String> WIFI_KEYWORDS = Arrays.asList("wi-fi", "wifi", "wireless", "wlan", "wwan");

	private static final Comparator<NetworkInterface> WIFI_NAME_COMPARATOR = new Comparator<NetworkInterface>() {
		@Override
		public int compare(final NetworkInterface o1, final NetworkInterface o2) {
			final boolean b1 = isWifiAdapter(o1);
			final boolean b2 = isWifiAdapter(o2);

			final int result;
			if (b1) {
				if (b2) {
					result = 0;
				} else {
					result = -1;
				}
			} else if (b2) {
				result = 1;
			} else {
				result = 0;
			}
			return result;
		}
	};

	private static int compare(final NetworkInterface ni1, final NetworkInterface ni2) {
		int result = LAN_NAME_COMPARATOR.compare(ni1, ni2);
		if (result == 0) {
			// Swap arguments so that wifi adapters come last
			result = WIFI_NAME_COMPARATOR.compare(ni2, ni1);
			if (result == 0) {
				// Swap arguments so that greatest MTU comes first
				result = compareMTUUnchecked(ni2, ni1);
			}
		}
		return result;
	}

	private static int compareMTUUnchecked(final NetworkInterface ni1, final NetworkInterface ni2) {
		try {
			final int mtu1 = ni1.getMTU();
			final int mtu2 = ni2.getMTU();
			return Integer.compare(mtu1, mtu2);
		} catch (final SocketException e) {
			throw new RuntimeException(e);
		}
	}

	private static boolean hasWifiKeywords(final String str) {
		boolean result = false;
		for (final String keyword : WIFI_KEYWORDS) {
			if (str.contains(keyword)) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Checks if a {@link NetworkInterface} is definitely an Ethernet (i.e.&nbsp;not
	 * wireless) LAN adapter; This may return {@code false} also in cases where it
	 * cannot be determined to either be an Ethernet adapter or to definitely not be
	 * one.
	 *
	 * @param netInt
	 *            the {@code NetworkInterface} to check.
	 * @return <code>true</code> if the object definitely represents an Ethernet LAN
	 *         adapter.
	 */
	private static boolean isLANAdapter(final NetworkInterface netInt) {
		final boolean result;

		// Try looking at the unique adapter name
		final String id = netInt.getName();
		final Matcher m = LAN_ADAPTER_NAME_PATTERN.matcher(id);
		if (m.matches()) {
			result = true;
		} else {
			final String normalizedDispName = normalizeDispName(netInt.getDisplayName());
			// First check for wi-fi keywords because some names look like e.g. "Wireless
			// Ethernet adapter"
			if (hasWifiKeywords(normalizedDispName)) {
				result = false;
			} else {
				final String substr = "ethernet";
				result = normalizedDispName.contains(substr);
			}
		}

		return result;
	}

	private static boolean isValid(final InetAddress addr) {
		return addr instanceof Inet4Address && !addr.isLoopbackAddress();
	}

	private static boolean isValid(final NetworkInterface netInt) throws SocketException {
		return netInt.isUp() && !netInt.isLoopback() && !netInt.isVirtual();
	}

	/**
	 * Checks if a {@link NetworkInterface} is definitely a wireless (i.e.&nbsp;not
	 * Ethernet) LAN/WAN adapter; This may return {@code false} also in cases where
	 * it cannot be determined to either be an wireless adapter or to definitely not
	 * be one.
	 *
	 * @param netInt
	 *            the {@code NetworkInterface} to check.
	 * @return <code>true</code> if the object definitely represents a wireless
	 *         LAN/WAN adapter.
	 */
	private static boolean isWifiAdapter(final NetworkInterface netInt) {
		final boolean result;

		// Try looking at the unique adapter name
		final String id = netInt.getName();
		final Matcher m = WIFI_ADAPTER_NAME_PATTERN.matcher(id);
		if (m.matches()) {
			result = true;
		} else {
			final String normalizedDispName = normalizeDispName(netInt.getDisplayName());
			result = hasWifiKeywords(normalizedDispName);
		}

		return result;
	}

	private static String normalizeDispName(final String name) {
		return name.toLowerCase();
	}

	private final int socketTimeout;

	public PreferredInetAddressFinder() {
		this(3000);
	}

	public PreferredInetAddressFinder(final int socketTimeout) {
		this.socketTimeout = socketTimeout;
	}

	/**
	 * Creates an ordered {@link List} of preferred {@link InetAddress} instances
	 * found for the system.
	 *
	 * @return A new {@link List} of {@link Entry} instances sorted by
	 *         preference.
	 * @throws SocketException
	 *             if an error occurs while querying system network interfaces.
	 */
	public List<InetAddressNetworkInterface> get() throws SocketException {
		// https://docs.oracle.com/javase/tutorial/networking/nifs/listing.html
		final List<InetAddressNetworkInterface> result = createValidAddressList(
				NetworkInterface.getNetworkInterfaces());
		Collections.sort(result);
		return result;
	}

	private long calculateRoundTripDelay(final InetAddress addr) {
		long result = Long.MAX_VALUE;
		final long startTime = System.nanoTime();
		try {
			if (addr.isReachable(socketTimeout)) {
				final long endTime = System.nanoTime();
				result = endTime - startTime;
			}
		} catch (final IOException e) {
			LOGGER.warning(String.format("A(n) %s occurred while checking if IP address \"%s\" is reachable: %s",
					e.getClass().getSimpleName(), addr.getHostAddress(), e.getLocalizedMessage()));
		}
		return result;
	}

	private int compare(final InetAddress addr1, final InetAddress addr2) {
		final long delay1 = calculateRoundTripDelay(addr1);
		final long delay2 = calculateRoundTripDelay(addr2);
		return Long.compare(delay1, delay2);
	}

	private List<InetAddressNetworkInterface> createValidAddressList(final Enumeration<NetworkInterface> netInts)
			throws SocketException {
		final List<InetAddressNetworkInterface> result = new ArrayList<>();
		while (netInts.hasMoreElements()) {
			final NetworkInterface netInt = netInts.nextElement();
			if (isValid(netInt)) {
				final Enumeration<InetAddress> addrs = netInt.getInetAddresses();
				while (addrs.hasMoreElements()) {
					final InetAddress addr = addrs.nextElement();
					if (isValid(addr)) {
						result.add(new InetAddressNetworkInterface(addr, netInt));
					}
				}
			}
		}
		return result;
	}

}
