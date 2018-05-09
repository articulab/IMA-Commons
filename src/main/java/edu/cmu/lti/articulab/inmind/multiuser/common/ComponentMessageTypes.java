/*
    Copyright (C) Carnegie Mellon University - All Rights Reserved
    Unauthorized copying of this file, via any medium is strictly prohibited
    This is proprietary and confidential.
    Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */
package edu.cmu.lti.articulab.inmind.multiuser.common;

/**
 * Constants defining the different types of component messages able to be sent
 * and received. These are string constants rather than e.g.&nbsp;enums so that
 * they can be used as compile-time constants for e.g.&nbsp;class annotations.
 *
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-08
 */
public final class ComponentMessageTypes {

	/**
	 * A message type representing ASR output.
	 */
	public static final String MSG_ASR = "MSG_ASR";
	public static final String MSG_ASR_CSC = "MSG_ASR_CSC";
	public static final String MSG_ASR_CSC_RESPONSE = "MSG_ASR_CSC_RESPONSE";
	public static final String MSG_ASR_DM = "MSG_ASR_DM";
	public static final String MSG_ASR_DM_RESPONSE = "MSG_ASR_DM_RESPONSE";
	/**
	 * <p>
	 * A message type representing conversational strategy classifier output.
	 * </p>
	 *
	 * See:
	 * <ul>
	 * <li>Tajfel, Henry &amp; John Turner. 1979. &ldquo;An integrative theory of
	 * intergroup conflict&rdquo;. In: Austin, William G. &amp; Stephen Worchel
	 * (eds.) <em>The social psychology of intergroup relations</em>,
	 * pp.&nbsp;33&ndash;47</li>
	 * <li>Spencer-Oatey, Helen. 2008. &ldquo;Face, (im)politeness and
	 * rapport&rdquo;. In: Spencer-Oatey, Helen (ed.) <em>Culturally Speaking</em>
	 * (2nd ed.), pp.&nbsp;11&ndash;47</li>
	 * </ul>
	 */
	public static final String MSG_CSC = "MSG_CSC";
	public static final String MSG_DIALOGUE_RESPONSE = "MSG_DIALOGUE_RESPONSE";
	/**
	 * A message type representing
	 * <a href="https://en.wikipedia.org/wiki/Dialog_manager">dialog manager</a>
	 * output.
	 */
	public static final String MSG_DM = "MSG_DM";
	public static final String MSG_GUAVA_SERVICE = "MSG_GUAVA_SERVICE";
	public static final String MSG_LOCAL = "MSG_LOCAL";
	public static final String MSG_LOG_COMPONENT = "MSG_LOG_COMPONENT";
	/**
	 * A message type representing NLG output.
	 */
	public static final String MSG_NLG = "MSG_NLG";
	/**
	 * A message type representing NLU output.
	 */
	public static final String MSG_NLU = "MSG_NLU";
	public static final String MSG_NVB = "MSG_NVB";
	public static final String MSG_QUERY = "MSG_QUERY";
	public static final String MSG_QUERY_RESPONSE = "MSG_QUERY_RESPONSE";
	/**
	 * <p>
	 * A message type representing rapport estimator output.
	 * </p>
	 * See:
	 * <ul>
	 * <li>Tickle-Degnen, Linda &amp; Robert Rosenthal. 1990. &ldquo;The nature of
	 * rapport and its nonverbal correlates&rdquo;. <em>Psychological inquiry</em>,
	 * 1(4):285&ndash;293</li>
	 * </ul>
	 */
	public static final String MSG_RPT = "MSG_RPT";
	public static final String MSG_SR = "MSG_SR";
	public static final String MSG_START_DM = "MSG_START_DM";
	public static final String MSG_START_SESSION = "MSG_START_SESSION";
	public static final String MSG_START_STREAMING = "MSG_START_STREAMING";
	public static final String MSG_StartOpenFace = "MSG_StartOpenFace";
	public static final String MSG_SYNC_SERVICE = "MSG_SYNC_SERVICE";
	public static final String MSG_UM = "MSG_UM";
	public static final String MSG_USER_FRAME = "MSG_USER_FRAME";

	private ComponentMessageTypes() {
		// no instantiation
	}

}
