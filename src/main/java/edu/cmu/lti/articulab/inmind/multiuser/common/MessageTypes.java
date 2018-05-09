/*
    Copyright (C) Carnegie Mellon University - All Rights Reserved
    Unauthorized copying of this file, via any medium is strictly prohibited
    This is proprietary and confidential.
    Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */
package edu.cmu.lti.articulab.inmind.multiuser.common;

/**
 * Constants defining the different types of messages able to be sent and received.
 *
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-08
 */
public final class MessageTypes {

    public static final String MSG_ASR = "MSG_ASR";
    public static final String MSG_ASR_CSC = "MSG_ASR_CSC";
    public static final String MSG_ASR_CSC_RESPONSE = "MSG_ASR_CSC_RESPONSE";
    public static final String MSG_ASR_DM = "MSG_ASR_DM";
    public static final String MSG_ASR_DM_RESPONSE = "MSG_ASR_DM_RESPONSE";
    public static final String MSG_CSC = "MSG_CSC";
    public static final String MSG_DIALOGUE_RESPONSE = "MSG_DIALOGUE_RESPONSE";
    public static final String MSG_DM = "MSG_DM";
    public static final String MSG_GUAVA_SERVICE = "MSG_GUAVA_SERVICE";
    public static final String MSG_LOCAL = "MSG_LOCAL";
    public static final String MSG_LOG_COMPONENT = "MSG_LOG_COMPONENT";
    public static final String MSG_NLG = "MSG_NLG";
    public static final String MSG_NLU = "MSG_NLU";
    public static final String MSG_NVB = "MSG_NVB";
    public static final String MSG_QUERY = "MSG_QUERY";
    public static final String MSG_QUERY_RESPONSE = "MSG_QUERY_RESPONSE";
    public static final String MSG_RESPONSE_START_PYTHON = "MSG_RESPONSE_START_PYTHON";
    public static final String MSG_RPT = "MSG_RPT";
    public static final String MSG_SR = "MSG_SR";
    public static final String MSG_START_DM = "MSG_START_DM";
    public static final String MSG_START_DM_PYTHON = "MSG_START_DM_PYTHON";
    public static final String MSG_START_SESSION = "MSG_START_SESSION";
    public static final String MSG_START_STREAMING = "MSG_START_STREAMING";
    public static final String MSG_StartOpenFace = "MSG_StartOpenFace";
    public static final String MSG_SYNC_SERVICE = "MSG_SYNC_SERVICE";
    public static final String MSG_UM = "MSG_UM";
    public static final String MSG_USER_FRAME = "MSG_USER_FRAME";

    private MessageTypes() {
        // no instantiation
    }


}
