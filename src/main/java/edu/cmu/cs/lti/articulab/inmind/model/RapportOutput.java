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
 * Created by fpecune on 4/15/2017.
 */
public class RapportOutput {
    private String userStrategy;
    private double rapportScore;

    public String getUserStrategy(){
        return userStrategy;
    }

    public void setUserStrategy(String strategy){
        this.userStrategy = strategy;
    }

    public double getRapportScore(){
        return rapportScore;
    }

    public void setRapportScore(double rapport){
        this.rapportScore = rapport;
    }

    public String toString(){
        return "Component: " + this.getClass().toString() + " User Strategy: " + userStrategy + " rapport: " + rapportScore;
    }


}
