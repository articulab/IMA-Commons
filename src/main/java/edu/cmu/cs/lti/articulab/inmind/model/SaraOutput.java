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

import java.util.ArrayList;

/**
 * Created by oscarr on 3/3/17.
 */
@Deprecated
public class SaraOutput {
    private VerbalOutput verbal;
    private NonVerbalOutput nonVerbal;
    private SocialIntent socialIntent;
    private String status = "";
    private UserIntent userIntent ;
    private String systemIntent;

    public SaraOutput() {
        verbal = new VerbalOutput("", "");
        nonVerbal = new NonVerbalOutput();
        socialIntent = new SocialIntent(0, "", "");
        userIntent = new UserIntent("", new ArrayList<String>());
    }

    @Override
    public String toString() {
        return "Component: " + this.getClass().toString() + " VerbalOutput: " + verbal.toString()
                + " NonVerbalOutput: " + nonVerbal.toString() + " SocialIntent: "+ socialIntent.toString()
                + " UserIntent: " + userIntent.toString() + " status: " + status + " systemIntent: " + systemIntent;
    }

    public VerbalOutput getVerbal() {
        return this.verbal;
    }

    public void setVerbal(VerbalOutput verbal) {
        this.verbal = verbal;
    }

    public NonVerbalOutput getNonVerbal() {
        return this.nonVerbal;
    }

    public void setNonVerbal(NonVerbalOutput nonVerbal) {
        this.nonVerbal = nonVerbal;
    }

    public SocialIntent getSocialIntent() {
        return this.socialIntent;
    }

    public void setSocialIntent(SocialIntent socialIntent) {
        this.socialIntent = socialIntent;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserIntent getUserIntent() {
        return this.userIntent;
    }

    public void setUserIntent(UserIntent userIntent) {
        this.userIntent = userIntent;
    }

    public String getSystemIntent() {
        return this.systemIntent;
    }

    public void setSystemIntent(String systemIntent) {
        this.systemIntent = systemIntent;
    }
}
