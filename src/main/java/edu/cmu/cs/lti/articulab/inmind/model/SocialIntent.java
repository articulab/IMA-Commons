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
 * Created by oscarr on 3/3/17.
 */
public class SocialIntent {
    private double rapportScore;
    private String rapportLevel;
    private String userConvStrategy;

    public SocialIntent(double rapportScore, String rapportLevel, String userConvStrategy) {
        this.rapportScore = rapportScore;
        this.rapportLevel = rapportLevel;
        this.userConvStrategy = userConvStrategy;
    }

    public double getRapportScore() {
        return this.rapportScore;
    }

    public void setRapportScore(double rapportScore) {
        this.rapportScore = rapportScore;
    }

    public String getRapportLevel() {
        return this.rapportLevel;
    }

    public void setRapportLevel(String rapportLevel) {
        this.rapportLevel = rapportLevel;
    }

    public String getUserConvStrategy() {
        return this.userConvStrategy;
    }

    public void setUserConvStrategy(String userConvStrategy) {
        this.userConvStrategy = userConvStrategy;
    }

    @Override
    public String toString() {
        return "Component: " + this.getClass().toString() + " rapportScore: "+ rapportScore
                + " rapportLevel: " + rapportLevel + " userConvStrategy: "+ userConvStrategy;
    }
}
