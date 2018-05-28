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
 * Created by fpecune on 4/15/2017.
 */
public class CSCOutput {
    private List<Strategy> userStrategies;

    public String toString(){
        StringBuilder message = new StringBuilder();
        for(Strategy s : userStrategies) {
            message.append(s.getName()).append(" ").append(s.getScore()).append(" ");
        }
        return "Component: " + this.getClass().toString() + message;
    }

    public Strategy getBest(){

        Strategy best = null;
        double score = -1.0;
        for(Strategy s : userStrategies){
            if (s.getScore() > score) {
                best = s;
                score = s.getScore();
            }
        }

        return best;
    }

    public void setUserStrategies(List<Strategy> strategies){
        this.userStrategies = strategies;
    }

    public List<Strategy> getUserStrategies(){
        return this.userStrategies;
    }

}
