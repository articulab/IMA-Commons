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
