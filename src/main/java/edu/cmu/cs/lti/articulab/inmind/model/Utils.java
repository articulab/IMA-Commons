/*
    Copyright (C) Carnegie Mellon University - All Rights Reserved
    Unauthorized copying of this file, via any medium is strictly prohibited
    This is proprietary and confidential.
    Written by members of the ArticuLab, directed by Justine Cassell, 2018.
 */
package edu.cmu.cs.lti.articulab.inmind.model;

import java.util.Arrays;

/**
 * Created by fpecune on 9/7/2017.
 */
final class Utils {

    static void checkContents(String variable, String... values) throws IllegalArgumentException {
        if (!Arrays.asList(values).contains(variable))
            throw new IllegalArgumentException(variable);
    }

    private Utils() {
        // no instantiation
    }

}