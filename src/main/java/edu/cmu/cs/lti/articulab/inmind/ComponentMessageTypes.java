/*
    Copyright (C) Carnegie Mellon University - All Rights Reserved
    Unauthorized copying of this file, via any medium is strictly prohibited
    This is proprietary and confidential.
    Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */
package edu.cmu.cs.lti.articulab.inmind;

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

	/**
	 * A message type representing
	 * <a href="https://en.wikipedia.org/wiki/Dialog_manager">dialog manager</a>
	 * output.
	 */
	public static final String MSG_DM = "MSG_DM";

	/**
	 * A message type representing NLG output.
	 */
	public static final String MSG_NLG = "MSG_NLG";
	/**
	 * A message type representing NLU output.
	 */
	public static final String MSG_NLU = "MSG_NLU";
	/**
	 * A message type representing
	 * <a href="https://en.wikipedia.org/wiki/Nonverbal_communication">non-verbal
	 * behavior</a>.
	 */
	public static final String MSG_NVB = "MSG_NVB";

	/**
	 * <p>
	 * A message type representing rapport estimator output.
	 * </p>
	 * See:
	 * <ul>
	 * <li>Tickle-Degnen, Linda &amp; Robert Rosenthal. 1990.
	 * <a href="https://doi.org/10.1207/s15327965pli0104_1">&ldquo;The nature of
	 * rapport and its nonverbal correlates&rdquo;</a>. <em>Psychological
	 * inquiry</em>, 1(4):285&ndash;293</li>
	 * </ul>
	 */
	public static final String MSG_RPT = "MSG_RPT";

	/**
	 * <p>
	 * A message type representing social reasoner output.
	 * </p>
	 * See:
	 * <ul>
	 * <li>Romero, Oscar J., Ran Zhao &amp; Justine Cassell. 2017.
	 * <a href="https://doi.org/10.24963/ijcai.2017/532">&ldquo;Cognitive-Inspired
	 * Conversational-Strategy Reasoner for Socially-Aware Agents&rdquo;</a>.
	 * Proceedings of the Twenty-Sixth International Joint Conference on Artificial
	 * Intelligence, pp.&nbsp;3807&ndash;3813</li>
	 * </ul>
	 */
	public static final String MSG_SR = "MSG_SR";
	/**
	 * A message type representing a request to begin dialogue management,
	 * i.e.&nbsp;<em>not</em> yet the user <em>interaction</em>.
	 */
	public static final String MSG_START_DM = "MSG_START_DM";

	/**
	 * A message type representing a request from a client to start a server-client
	 * session, i.e.&nbsp;<em>not</em> yet the user <em>interaction</em>.
	 */
	public static final String MSG_START_SESSION = "MSG_START_SESSION";

	/**
	 * A message type representing the state of a given
	 * <a href="https://en.wikipedia.org/wiki/User_modeling">user model</a>.
	 */
	public static final String MSG_UM = "MSG_UM";

	private ComponentMessageTypes() {
		// no instantiation
	}

}
