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