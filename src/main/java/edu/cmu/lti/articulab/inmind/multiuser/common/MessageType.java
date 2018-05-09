/*
    Copyright (C) Carnegie Mellon University - All Rights Reserved
    Unauthorized copying of this file, via any medium is strictly prohibited
    This is proprietary and confidential.
    Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */

package edu.cmu.lti.articulab.inmind.multiuser.common;

/**
 * An enumeration of the different types of messages able to be sent and received.
 *
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-08
 */
public enum MessageType {
	ASR,
	ASR_CSC,
	ASR_CSC_RESPONSE,
	ASR_DM,
	ASR_DM_RESPONSE,
	CSC,
	DIALOGUE_RESPONSE,
	DM,
	GUAVA_SERVICE,
	LOCAL,
	LOG_COMPONENT,
	NLG,
	NLU,
	NVB,
	QUERY,
	QUERY_RESPONSE,
	RESPONSE_START_PYTHON,
	RPT,
	SR,
	START_DM,
	START_DM_PYTHON,
	START_SESSION,
	START_STREAMING,
	StartOpenFace,
	SYNC_SERVICE,
	UM,
	USER_FRAME
}
