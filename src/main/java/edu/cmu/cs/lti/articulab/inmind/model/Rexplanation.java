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

/**
 * Created by yoichimatsuyama on 4/13/17.
 */
public class Rexplanation {
    String recommendation;
    List<String> explanations;

    public Rexplanation() {}
    public Rexplanation(String recommendation, List<String> explanations) {
        this.recommendation = recommendation;
        this.explanations = explanations;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public List<String> getExplanations() {
        return explanations;
    }

    public void setExplanations(List<String> explanations) {
        this.explanations = explanations;
    }

    @Override
    public String toString() {
        return "Rexplanation{" +
                "recommendation='" + recommendation + '\'' +
                ", explanations=" + explanations +
                '}';
    }
}
