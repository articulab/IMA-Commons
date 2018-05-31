/*
 * Copyright (C) Carnegie Mellon University - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * This is proprietary and confidential.
 * Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */

package edu.cmu.cs.lti.articulab;

/**
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-31
 *
 */
public final class OneOffRunnable implements Runnable {

	private final Runnable decorated;

	private volatile boolean alreadyRun;

	public OneOffRunnable(final Runnable decorated) {
		this.decorated = decorated;
	}

	@Override
	public void run() {
		if (!alreadyRun) {
			synchronized (this) {
				// Double-checked locking
				if (!alreadyRun) {
					decorated.run();
					alreadyRun = true;
				}
			}
		}
	}

}
