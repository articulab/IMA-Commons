/*
    Copyright (C) Carnegie Mellon University - All Rights Reserved
    Unauthorized copying of this file, via any medium is strictly prohibited
    This is proprietary and confidential.
    Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */
package edu.cmu.lti.articulab.inmind.multiuser.common;

/**
 * Constants defining the different types of messages able to be handled
 * controlling media streams, e.g.&nbsp;using
 * <a href="http://red5.org/">Red5</a>. These are string constants rather than
 * e.g.&nbsp;enums so that they can be used as compile-time constants for
 * e.g.&nbsp;class annotations.
 *
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-08
 */
public final class MediaStreamMessageTypes {

	public static final String R5STREAM_CLOSE = "R5STREAM_CLOSE";
	/**
	 * A message type denoting that a media stream has been successfully connected.
	 */
	public static final String R5STREAM_CONNECTED = "R5STREAM_CONNECTED";
	public static final String R5STREAM_DISCONNECTED = "R5STREAM_DISCONNECTED";
	public static final String R5STREAM_ERROR = "R5STREAM_ERROR";
	public static final String R5STREAM_STARTED = "R5STREAM_STARTED";
	public static final String R5STREAM_TIMEOUT = "R5STREAM_TIMEOUT";

	private MediaStreamMessageTypes() {
		// no instantiation
	}

}
