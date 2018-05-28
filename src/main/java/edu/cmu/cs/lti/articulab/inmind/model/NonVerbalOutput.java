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
public class NonVerbalOutput {
    private boolean smiling;
    private boolean gazeAtPartner;

    public NonVerbalOutput() {
    }

    @Override
    public String toString() {
        return "Component: " + this.getClass().toString() + " smiling: "+ smiling + " gazeAtPartner: " + gazeAtPartner;
    }

    public boolean isSmiling() {
        return this.smiling;
    }

    public void setSmiling(boolean smiling) {
        this.smiling = smiling;
    }

    public boolean isGazeAtPartner() {
        return this.gazeAtPartner;
    }

    public void setGazeAtPartner(boolean gazeAtPartner) {
        this.gazeAtPartner = gazeAtPartner;
    }

    public boolean getSmiling(){
        return  smiling;
    }

    public boolean getGaze(){
        return gazeAtPartner;
    }
}
