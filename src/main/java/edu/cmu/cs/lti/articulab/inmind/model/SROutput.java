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
 * Created by yoichimatsuyama on 4/11/17.
 */
public class SROutput {

    final DMOutput dmOutput;
    /** one of the strategies, hopefully as defined in ConversationalStrategy */
    String strategy;
    /** real value between 1-7 or 0 for undefined */
    double rapport;
    /** list of BehaviorNetwork states */
    List<String> states;

    public SROutput(DMOutput dmOutput) { 
        this.dmOutput = dmOutput;
    }
    public DMOutput getDMOutput() { return dmOutput; }

    public String getStrategy() {
        return strategy;
    }
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public double getRapport() {
        return rapport;
    }
    public void setRapport(double rapport) {
        this.rapport = rapport;
    }

    public List<String> getStates() {
        return states;
    }
    public void setStates(final List<String> states) {
        this.states = states;
    }

    public String toString(){
        return "Component: " + this.getClass().toString() + " System Action: " + dmOutput.action + " Strategy:" + strategy;
    }
}
