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
 * Created by yoichimatsuyama on 4/16/17.
 */
public class Recommendation {
    List<Rexplanation> rexplanations;

    public List<Rexplanation> getRexplanations() {
        return rexplanations;
    }

    public void setRexplanations(List<Rexplanation> rexplanations) {
        this.rexplanations = rexplanations;
    }

    public String getTitle() {
        assert rexplanations.size() > 0;
        assert rexplanations.get(0).getRecommendation() != null;
        return rexplanations.get(0).getRecommendation();
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "rexplanations=" + rexplanations +
                '}';
    }
}
