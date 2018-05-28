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
 * User Frame
 * Created by yoichimatsuyama on 4/13/17.
 */
public class UserFrame {

    private PreferenceList actors = new PreferenceList();
    private PreferenceList genres = new PreferenceList();
    private PreferenceList directors = new PreferenceList();
    private PreferenceList movies = new PreferenceList();

    public PreferenceList getList(String listName) {
        Utils.checkContents(listName.toLowerCase(), "genre", "director", "actor", "movie", "genres", "directors", "actors", "movies");
        switch (listName.toLowerCase()) {
            case "genre":
            case "genres":
                return getGenres();
            case "director":
            case "directors":
                return getDirectors();
            case "actor":
            case "actors":
                return getActors();
            case "movie":
            case "movies":
                return getMovies();
            default:
                throw new IllegalArgumentException("you're kidding me, searching for " + listName);
        }
    }

    public PreferenceList getActors() {
        return actors;
    }
    public void setActors(PreferenceList actors) {
        this.actors = actors;
    }

    public PreferenceList getGenres() { return genres; }
    public void setGenres(PreferenceList genres) {
        this.genres = genres;
    }

    public PreferenceList getDirectors() {
        return directors;
    }
    public void setDirectors(PreferenceList directors) {
        this.directors = directors;
    }

    public PreferenceList getMovies() {
        return movies;
    }
    public void setMovies(PreferenceList movies) {
        this.movies = movies;
    }

    /**
     * Actors, Genres, Directors
     */
    public static class PreferenceList {
        private List<String> like = new ArrayList<>();
        private List<String> dislike = new ArrayList<>();

        public PreferenceList() {}
        public PreferenceList(List<String> liked, List<String> disliked) {
            setLike(liked);
            setDislike(disliked);
        }

        public List<String> getLike() {
            return like;
        }
        public void setLike(List<String> like) {
            this.like = like;
        }

        public List<String> getDislike() {
            return dislike;
        }
        public void setDislike(List<String> dislike) {
            this.dislike = dislike;
        }
    }

}