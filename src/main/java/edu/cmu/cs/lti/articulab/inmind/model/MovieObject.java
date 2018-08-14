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
import java.lang.String;

/**
 * Created by Vivian Tsai (vtsai4@gmail.com), August 2018.
 */

public class MovieObject {
    String title;
    List<Object> explanations;
    String plot, runtime;
    String [] genres, actors;

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }
    public void setExplanations(List<Object> explanations) { this.explanations = explanations; }
    public List<Object> getExplanations() { return explanations; }
    public void setPlot(String plot) { this.plot = plot; }
    public String getPlot() { return plot; }
    public void setGenres(String s) { this.genres = s.split(","); }
    public String getGenres(int num) { return num == 1 ? genres[0] : choose(genres, num); }
    public void setActors(String s) { this.actors = s.split(","); }
    public String getActors(int num) { return num == 1 ? actors[0] : choose(actors, num); }
    public void setRuntime(String runtime) { this.runtime = runtime; }
    public String getRuntime() { return runtime; }

    private String choose(String [] s, int num) {
        String output = "";
        for (int i = 0; i < num && i < s.length; i++) {
            output += s[i] + ", ";
        }
        return output;
    }
}
