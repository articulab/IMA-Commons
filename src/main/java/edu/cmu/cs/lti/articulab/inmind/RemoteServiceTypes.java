/*
    Copyright (C) Carnegie Mellon University - All Rights Reserved
    Unauthorized copying of this file, via any medium is strictly prohibited
    This is proprietary and confidential.
    Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */
package edu.cmu.cs.lti.articulab.inmind;

/**
 * Constants defining the different types of remote services able to be handled.
 * These are string constants rather than e.g.&nbsp;enums so that they can be
 * used as compile-time constants for e.g.&nbsp;class annotations.
 *
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-08
 */
public final class RemoteServiceTypes {

	public static final String NLU_DM_SERVICE = "NLU_DM_SERVICE";
	/**
	 * A remote service type for doing NLG.
	 */
	public static final String NLG_SERVICE = "NLG_SERVICE";
	/**
	 * A remote service type for doing
	 * <a href="https://en.wikipedia.org/wiki/Dialog_manager">dialog management</a>.
	 */
	public static final String DM_SERVICE = "DM_SERVICE";
	/**
	 * <p>
	 * A remote service type for doing social reasoning.
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
	public static final String SR_SERVICE = "SR_SERVICE";
	/**
	 * <p>
	 * A remote service type for doing rapport estimation.
	 * </p>
	 * See:
	 * <ul>
	 * <li>Tickle-Degnen, Linda &amp; Robert Rosenthal. 1990. <a href="https://doi.org/10.1207/s15327965pli0104_1">&ldquo;The nature of
	 * rapport and its nonverbal correlates&rdquo;</a>. <em>Psychological inquiry</em>,
	 * 1(4):285&ndash;293</li>
	 * </ul>
	 */
	public static final String RPT_SERVICE = "RPT_SERVICE";

	private RemoteServiceTypes() {
		// no instantiation
	}

}
