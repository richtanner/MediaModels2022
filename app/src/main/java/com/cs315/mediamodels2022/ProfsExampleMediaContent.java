package com.cs315.mediamodels2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfsExampleMediaContent {
    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MediaModel> ITEM_MAP = new HashMap<String, MediaModel>();

    /**
     * A List of the Movie items.
     */
    // I am calling this MOVIES, because that's what I am putting in here.  You can call it GAMES, or BOOKS, or ANIME, or FAVORITE_CS_TEXTBOOKS, ...whatever
    public static final List<MediaModel> MOVIES = new ArrayList<MediaModel>();


    /**
     * Create all those movie Strings we will be needing for the models
     */
    // CS315: DO THIS
    // TODO: COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String game1 = App.getContext().getResources().getString(R.string.game1);
    private static final String description1 = App.getContext().getResources().getString(R.string.description1);
    private static final String year1 = App.getContext().getResources().getString(R.string.year1);
    private static final String image1 = "genericromcom";
    private static final String link1 = App.getContext().getResources().getString(R.string.link1);

    private static final String game2 = App.getContext().getResources().getString(R.string.game2);
    private static final String description2 = App.getContext().getResources().getString(R.string.description2);
    private static final String year2 = App.getContext().getResources().getString(R.string.year2);
    private static final String image2 = "genericromcom";
    private static final String link2 = App.getContext().getResources().getString(R.string.link2);

    private static final String game3 = App.getContext().getResources().getString(R.string.game3);
    private static final String description3 = App.getContext().getResources().getString(R.string.description3);
    private static final String year3 = App.getContext().getResources().getString(R.string.year3);
    private static final String image3 = "genericromcom";
    private static final String link3 = App.getContext().getResources().getString(R.string.link3);

    private static final String game4 = App.getContext().getResources().getString(R.string.game4);
    private static final String description4 = App.getContext().getResources().getString(R.string.description4);
    private static final String year4 = App.getContext().getResources().getString(R.string.year4);
    private static final String image4 = "genericromcom";
    private static final String link4 = App.getContext().getResources().getString(R.string.link4);

    private static final String game5 = App.getContext().getResources().getString(R.string.game5);
    private static final String description5 = App.getContext().getResources().getString(R.string.description5);
    private static final String year5 = App.getContext().getResources().getString(R.string.year5);
    private static final String image5 = "genericromcom";
    private static final String link5 = App.getContext().getResources().getString(R.string.link5);


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MediaModel> createMovieMagic () {

        // make those movie objects
        MediaModel model1 = new MediaModel(game1, description1, year1, image1, link1);
        MediaModel model2 = new MediaModel(game2, description2, year2, image2, link2);
        MediaModel model3 = new MediaModel(game3, description3, year3, image3, link3);
        MediaModel model4 = new MediaModel(game4, description4, year4, image4, link4);
        MediaModel model5 = new MediaModel(game5, description5, year5, image5, link5);

        // add EACH movie object to our lists and maps
        addMovieToList(model1);
        addMovieToList(model2);
        addMovieToList(model3);
        addMovieToList(model4);
        addMovieToList(model5);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MediaModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMediaTitle(), datMovie);
    }
}

