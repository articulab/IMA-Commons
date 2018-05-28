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

/**
 * Created by yoichimatsuyama on 4/11/17.
 */
public class DMOutput {
    String action;
    protected Recommendation recommendation;
    UserFrame frame;
    String utterance;

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public Recommendation getRecommendation() {
        return recommendation;
    }
    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    /**
     *  @return true if contains recommendation, else false
     */
    public boolean hasFullContent() {
        return recommendation != null &&  recommendation.rexplanations != null;
    }
    public boolean isRecommendation() {
        return action.equals("recommend");
    }


    public UserFrame getUserFrame() {
        return frame;
    }
    public void setFrame(UserFrame frame) {
        this.frame = frame;
    }

    public String getUtterance() {
        return utterance;
    }
    public void setUtterance(String utterance) {
        this.utterance = utterance;
    }

    public String toString(){
        return "Component: " + this.getClass().toString() + " System Action: " + action;
    }
}
