package edu.cmu.lti.articulab.inmind.multiuser.common.model;

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
