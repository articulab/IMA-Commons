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
 * Created by oscarr on 3/16/17.
 */
public class UserIntent {
    private String userIntent;
    private List<String> entities;

    public UserIntent(String userIntent, List<String> entities) {
        this.userIntent = userIntent;
        this.entities = entities;
    }

    public String getUserIntent() {
        return this.userIntent;
    }

    public void setUserIntent(String userIntent) {
        this.userIntent = userIntent;
    }

    public List<String> getEntities() {
        return this.entities;
    }

    public void setEntities(List<String> entities) {
        this.entities = entities;
    }


    @Override
    public String toString() {
        return "Component: " + this.getClass().toString() + " userIntent: "+ userIntent +
                " entities: " + entities.toString();
    }
}
