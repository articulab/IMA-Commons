/*
    Copyright (C) Carnegie Mellon University - All Rights Reserved
    Unauthorized copying of this file, via any medium is strictly prohibited
    This is proprietary and confidential.
    Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */
package edu.cmu.lti.articulab.inmind.multiuser.common;

/**
 * Constants defining the different types of components able to be handled.
 * These are string constants rather than e.g.&nbsp;enums so that they can be used as compile-time constants for e.g.&nbsp;class annotations.
 *
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-08
 */
public final class ComponentTypes {

	public static final String ID_ASYNC = "ID_ASYNC";
	public static final String ID_CSC = "ID_CSC";
	public static final String ID_DM = "ID_DM";
	public static final String ID_GUAVA_SERVICE = "ID_GUAVA_SERVICE";
	public static final String ID_LOG_COMPONENT = "ID_LOG_COMPONENT";
	public static final String ID_NLG = "ID_NLG";
	public static final String ID_NLU = "ID_NLU";
	public static final String ID_NVB = "ID_NVB";
	public static final String ID_OF = "ID_OF";
	public static final String ID_POOL = "ID_POOL";
	public static final String ID_R5 = "ID_R5";
	public static final String ID_REMOTE_COMPONENT = "ID_REMOTE_COMPONENT";
	public static final String ID_RPT = "ID_RPT";
	public static final String ID_SR = "ID_SR";
	public static final String ID_UM = "ID_UM";

	private ComponentTypes() {
		// no instantiation
	}

}
