/*
    Copyright (C) Carnegie Mellon University - All Rights Reserved
    Unauthorized copying of this file, via any medium is strictly prohibited
    This is proprietary and confidential.
    Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */

package edu.cmu.lti.articulab.inmind.multiuser.common;

/**
 * An enumeration of the different types of messages able to be handled controlling media streams, e.g.&nbsp;using <a href="http://red5.org/">Red5</a>.
 *
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-08
 */
public enum MediaStreamMessageType {
	CLOSE,
	CONNECTED,
	DISCONNECTED,
	ERROR,
	STARTED,
	TIMEOUT
}
