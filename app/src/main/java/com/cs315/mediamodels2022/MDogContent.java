package com.cs315.mediamodels2022;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MDogContent {
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
    Context context = app.getContext();
    Resources res = context.getResources();
    // CS315: DO THIS
    // TODO: COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private final String movie1Title = app.getContext().getResources().getString(R.string.My_Hero_Academia);
    private final String movie1Description = res.getString(R.string.heroDes);
    private final String movie1Year = res.getString(R.string.heroYear);
    private final String movie1Image = "my_hero";
    private final String movie1Weblink = res.getString(R.string.heroURL);

    private final String actionTitle = app.getContext().getResources().getString(R.string.minetitle);
    private final String actionDescription = res.getString(R.string.mineDes);
    private final String actionYear = res.getString(R.string.mineYear);
    private final String actionImage = "minecraft";
    private final String actionWeblink = res.getString(R.string.mineURL);

    private final String wowTitle = app.getContext().getResources().getString(R.string.eldarn);
    private final String wowDescription = res.getString(R.string.eldarnDes);
    private final String wowYear = res.getString(R.string.eldarnYear);
    private final String wowImage = "eldarn";
    private final String wowWeblink = res.getString(R.string.eldarnURL);

    private final String zoomTitle = app.getContext().getResources().getString(R.string.ter);
    private final String zoomDescription = res.getString(R.string.terDes);
    private final String zoomYear = res.getString(R.string.terYear);
    private final String zoomImage = "terraria";
    private final String zoomWeblink = res.getString(R.string.eldarnURL);

    private final String vroomTitle = app.getContext().getResources().getString(R.string.teen);
    private final String vroomDescription = res.getString(R.string.teenDes);
    private final String vroomYear = res.getString(R.string.teenYear);
    private final String vroomImage = "teen_titans";
    private final String vroomWeblink = res.getString(R.string.teenURL);

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MediaModel> createMovieMagic () {

        // make those movie objects
        MediaModel action = new MediaModel(actionTitle, actionDescription, actionYear, actionImage, actionWeblink);
        MediaModel romcom = new MediaModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MediaModel wow = new MediaModel(wowTitle, wowDescription, wowYear, wowImage, wowWeblink);
        MediaModel twodmine = new MediaModel(zoomTitle, zoomDescription, zoomYear, zoomImage, zoomWeblink);
        MediaModel teen = new MediaModel(vroomTitle, vroomDescription, vroomYear, vroomImage, vroomWeblink);

        // add EACH movie object to our lists and maps
        addMovieToList(action);
        addMovieToList(romcom);
        addMovieToList(wow);
        addMovieToList(twodmine);
        addMovieToList(teen);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MediaModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMediaTitle(), datMovie);
    }
}

