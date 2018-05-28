/*
 * Copyright 2018 Carnegie Mellon University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
	 * A message type representing that the session user interaction is now
	 * available, i.e.&nbsp;it is now possible to initiate.
	 */
	public static final String MSG_INTERACTION_AVAILABLE = "MSG_INTERACTION_AVAILABLE";

	/**
	 * A message type representing the end of the session user interaction.
	 */
	public static final String MSG_INTERACTION_ENDED = "MSG_INTERACTION_ENDED";

	/**
	 * A message type representing the start of the session user interaction.
	 */
	public static final String MSG_INTERACTION_STARTED = "MSG_INTERACTION_STARTED";

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
	 * A message type representing a request to start the user interaction.
	 */
	public static final String MSG_START_INTERACTION = "MSG_START_INTERACTION";

	/**
	 * A message type representing a request from a client to start a user session,
	 * i.e.&nbsp;<em>not</em> yet the user {@link #MSG_INTERACTION_STARTED
	 * interaction}. Note that this is not the same as the actual server-client
	 * session.
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
