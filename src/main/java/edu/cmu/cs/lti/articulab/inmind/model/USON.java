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
