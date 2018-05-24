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
