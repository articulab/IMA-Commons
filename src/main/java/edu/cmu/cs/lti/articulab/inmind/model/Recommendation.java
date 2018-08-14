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

import java.util.List;
import java.util.ArrayList;
import edu.cmu.cs.lti.articulab.inmind.model.MovieObject;

/**
 * Created by Vivian Tsai (vtsai4@gmail.com), August 2018.
 */

public class Recommendation{

    List<MovieObject> movies;

    /** Constructor. */
    public Recommendation() {
        movies = new ArrayList<MovieObject>();
    }

    public void add(MovieObject mo) {
        movies.add(mo);
    }

    /** Temporary: always returns first movie
     * (as we only receive one movie per recommendation)
     */
    public MovieObject getMovie() {
        return movies.get(0);
    }

    public String getTitle() {
        return movies.get(movies.size()-1).title;
    }
}