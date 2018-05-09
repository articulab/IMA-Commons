/*
    Copyright (C) Carnegie Mellon University - All Rights Reserved
    Unauthorized copying of this file, via any medium is strictly prohibited
    This is proprietary and confidential.
    Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */
package edu.cmu.lti.articulab.inmind.multiuser.common;

/**
 * Constants defining the different types of components able to be handled.
 * These are string constants rather than e.g.&nbsp;enums so that they can be
 * used as compile-time constants for e.g.&nbsp;class annotations.
 *
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-08
 */
public final class ComponentTypes {

	public static final String ID_ASYNC = "ID_ASYNC";
	/**
	 * <p>
	 * A component that does conversational strategy classification.
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
	 */
	public static final String ID_CSC = "ID_CSC";
	/**
	 * A component that does
	 * <a href="https://en.wikipedia.org/wiki/Dialog_manager">dialog management</a>.
	 */
	public static final String ID_DM = "ID_DM";
	public static final String ID_GUAVA_SERVICE = "ID_GUAVA_SERVICE";
	public static final String ID_LOG_COMPONENT = "ID_LOG_COMPONENT";
	/**
	 * A component that does NLG.
	 */
	public static final String ID_NLG = "ID_NLG";
	/**
	 * A component that does NLU.
	 */
	public static final String ID_NLU = "ID_NLU";
	public static final String ID_NVB = "ID_NVB";
	public static final String ID_OF = "ID_OF";
	public static final String ID_POOL = "ID_POOL";
	public static final String ID_R5 = "ID_R5";
	public static final String ID_REMOTE_COMPONENT = "ID_REMOTE_COMPONENT";
	/**
	 * <p>
	 * A component that does rapport estimation.
	 * </p>
	 * See:
	 * <ul>
	 * <li>Tickle-Degnen, Linda &amp; Robert Rosenthal. 1990. &ldquo;The nature of
	 * rapport and its nonverbal correlates&rdquo;. <em>Psychological inquiry</em>,
	 * 1(4):285&ndash;293</li>
	 * </ul>
	 */
	public static final String ID_RPT = "ID_RPT";
	public static final String ID_SR = "ID_SR";
	public static final String ID_UM = "ID_UM";

	private ComponentTypes() {
		// no instantiation
	}

}
