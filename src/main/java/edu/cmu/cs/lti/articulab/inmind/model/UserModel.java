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
import java.util.List;

/**
 * This class represents data about the user that should be persisted between sessions
 */
public class UserModel {
    public static final double RAPPORT_UNDEFINED = 0.0;

    private final List<String> behaviorNetworkStates = new ArrayList<>();
    private UserFrame userFrame;
    private double rapport = RAPPORT_UNDEFINED;

    private final String id;

    public UserModel(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<String> getBehaviorNetworkStates() {
        return behaviorNetworkStates;
    }

    public void updateBehaviorNetworkStates(final List<String> behaviorNetworkStates) {
        if (behaviorNetworkStates != null) {
            this.behaviorNetworkStates.clear();
            this.behaviorNetworkStates.addAll(behaviorNetworkStates);
        }
    }

    public UserFrame getUserFrame() {
        return userFrame;
    }

    public void setUserFrame(final UserFrame userFrame) {
        this.userFrame = userFrame;
    }

    public double getRapport() {
        return rapport;
    }

    public void setRapport(final double rapport) {
        this.rapport = rapport;
    }

    /**
     * If a field is not present in a json object, GSON will overwrite it with null even if it is final.
     * Use this method to ensure that the object is in the expected state.
     * @return <code>true</code> iff this object is in a valid state
     */
    @SuppressWarnings("ConstantConditions")
    public boolean isValid() {
        return id != null && !id.isEmpty() &&
                 behaviorNetworkStates != null;
    }
}
