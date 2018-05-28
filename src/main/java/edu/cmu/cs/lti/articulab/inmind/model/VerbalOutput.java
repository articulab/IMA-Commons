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
public class VerbalOutput {
    private String utterance;
    private String convStrategy;

    public VerbalOutput(String utterance) {
        this.utterance = utterance;
    }

    public VerbalOutput(String utterance, String convStrategy) {
        this.utterance = utterance;
        this.convStrategy = convStrategy;
    }

    public String getUtterance() {
        return this.utterance;
    }

    public void setUtterance(String utterance) {
        this.utterance = utterance;
    }

    public String getConvStrategy() {
        return this.convStrategy;
    }

    public void setConvStrategy(String convStrategy) {
        this.convStrategy = convStrategy;
    }

    @Override
    public String toString() {
        return "Component: " + this.getClass().toString() + " utterance: " + utterance
                + " convStrategy: " + convStrategy;
    }
}
