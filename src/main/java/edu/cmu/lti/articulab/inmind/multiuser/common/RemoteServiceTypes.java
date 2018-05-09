/*
    Copyright (C) Carnegie Mellon University - All Rights Reserved
    Unauthorized copying of this file, via any medium is strictly prohibited
    This is proprietary and confidential.
    Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */
package edu.cmu.lti.articulab.inmind.multiuser.common;

/**
 * Constants defining the different types of remote services able to be handled.
 *
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-08
 */
public final class RemoteServiceTypes {

    public static final String NLU_DM_SERVICE = "NLU_DM_SERVICE";
    public static final String NLG_SERVICE = "NLG_SERVICE";
    public static final String DM_SERVICE = "DM_SERVICE";
    public static final String SR_SERVICE = "SR_SERVICE";
    public static final String RPT_SERVICE = "RPT_SERVICE";

    private RemoteServiceTypes() {
        // no instantiation
    }


}