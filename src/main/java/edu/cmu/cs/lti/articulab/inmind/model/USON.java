package edu.cmu.cs.lti.articulab.inmind.model;

/**
 * USON (for UI).
 * Stores text, img url, and/or YouTube code to be used for display on client side.
 * Note: to be moved to IMA Commons once --refresh-dependencies works.
 *
 * Created by Vivian on 6/26/18.
 */
public class USON {
    private String text;
    private String youtube;
    private String img;
    private float start_time;
    private float end_time;

    public String getText() { return text; }
    public void setText(String content) { this.text = content; }
    public String getYoutube() { return youtube; }
    public void setYoutube(String youtube) { this.youtube = youtube; }
    public String getImg() { return img; }
    public void setImg(String url) { this.img = url; }
    public float getStartTime() { return start_time; }
    public void setStartTime(float start_time) { this.start_time = start_time; }
    public float getEndTime() { return end_time; }
    public void setEndTime(float end_time) { this.end_time = end_time; }

    @Override
    public String toString() {
        return "Component: " + this.getClass().toString();
    }
}
