package com.cs315.mediamodels2022;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import androidx.core.content.res.ResourcesCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NCMMediaContent
{
    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MediaModel> ITEM_MAP = new HashMap<>();
//pain
    /**
     * A List of the Movie items.
     */
    // I am calling this MOVIES, because that's what I am putting in here.  You can call it GAMES, or BOOKS, or ANIME, or FAVORITE_CS_TEXTBOOKS, ...whatever
    public static final List<MediaModel> MOVIES = new ArrayList<>();


    /**
     * Create all those movie Strings we will be needing for the models
     */
    // CS315: DO THIS
    // TODO: COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String movie1Title = App.getContext().getResources().getString(R.string.movie1_title);
    private static final String movie1Description = App.getContext().getResources().getString(R.string.movie1_desc);
    private static final String movie1Year = App.getContext().getResources().getString(R.string.movie1_year);
    private static final String movie1Image = App.getContext().getResources().getString(R.string.movie1_image);
    private static final String movie1Weblink = App.getContext().getResources().getString(R.string.movie1_link);

    private static final String movie2Title = App.getContext().getResources().getString(R.string.movie2_title);
    private static final String movie2Description = App.getContext().getResources().getString(R.string.movie2_desc);
    private static final String movie2Year = App.getContext().getResources().getString(R.string.movie2_year);
    private static final String movie2Image = App.getContext().getResources().getString(R.string.movie2_image);
    private static final String movie2Weblink = App.getContext().getResources().getString(R.string.movie2_link);

    private static final String movie3Title = App.getContext().getResources().getString(R.string.movie3_title);
    private static final String movie3Description = App.getContext().getResources().getString(R.string.movie3_desc);
    private static final String movie3Year = App.getContext().getResources().getString(R.string.movie3_year);
    private static final String movie3Image = App.getContext().getResources().getString(R.string.movie3_image);
    private static final String movie3Weblink = App.getContext().getResources().getString(R.string.movie3_link);

    private static final String movie4Title = App.getContext().getResources().getString(R.string.movie4_title);
    private static final String movie4Description = App.getContext().getResources().getString(R.string.movie4_desc);
    private static final String movie4Year = App.getContext().getResources().getString(R.string.movie4_year);
    private static final String movie4Image = App.getContext().getResources().getString(R.string.movie4_image);
    private static final String movie4Weblink = App.getContext().getResources().getString(R.string.movie4_link);

    private static final String movie5Title = App.getContext().getResources().getString(R.string.movie5_title);
    private static final String movie5Description = App.getContext().getResources().getString(R.string.movie5_desc);
    private static final String movie5Year = App.getContext().getResources().getString(R.string.movie5_year);
    private static final String movie5Image = App.getContext().getResources().getString(R.string.movie5_image);
    private static final String movie5Weblink = App.getContext().getResources().getString(R.string.movie5_link);
    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MediaModel> createMovieMagic ()
    {
        // make those movie objects
        MediaModel movie1 = new MediaModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MediaModel movie2 = new MediaModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
        MediaModel movie3 = new MediaModel(movie3Title, movie3Description, movie3Year, movie3Image, movie3Weblink);
        MediaModel movie4 = new MediaModel(movie4Title, movie4Description, movie4Year, movie4Image, movie4Weblink);
        MediaModel movie5 = new MediaModel(movie5Title, movie5Description, movie5Year, movie5Image, movie5Weblink);

        MOVIES.clear();

        // add EACH movie object to our lists and maps
        addMovieToList(movie1);
        addMovieToList(movie2);
        addMovieToList(movie3);
        addMovieToList(movie4);
        addMovieToList(movie5);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MediaModel datMovie)
    {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMediaTitle(), datMovie);
    }
}

