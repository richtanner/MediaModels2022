package com.cs315.mediamodels2022;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlissaDavisMediaContent {
    Context context = this.context;
    Resources res = context.getResources();
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
    // COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private String ADEraTitle = res.getString(R.string.DavisTitleEragon);
    private String ADEraDesc = res.getString(R.string.DavisDescEragon);
    private String ADEraYear = res.getString(R.string.DavisYearEragon);
    private String ADEraImage = res.getString(R.string.DavisImageEragon);
    private String ADEraLink = res.getString(R.string.DavisLinkEragon);
    private String ADLKTitle = res.getString(R.string.DavisTitleLionKing);
    private String ADLKDesc = res.getString(R.string.DavisDescLionKing);
    private String ADLKYear = res.getString(R.string.DavisYearLionKing);
    private String ADLKImage = res.getString(R.string.DavisImageLionKing);
    private String ADLKLink = res.getString(R.string.DavisLinkLionKing);
    private String ADLK2Title = res.getString(R.string.DavisTitleLionKing2);
    private String ADLK2Desc = res.getString(R.string.DavisDescLionKing2);
    private String ADLK2Year = res.getString(R.string.DavisYearLionKing2);
    private String ADLK2Image = res.getString(R.string.DavisImageLionKing2);
    private String ADLK2Link = res.getString(R.string.DavisLinkLionKing2);
    private String ADLK3Title = res.getString(R.string.DavisTitleLionKing1Half);
    private String ADLK3Desc = res.getString(R.string.DavisDescLionKing1Half);
    private String ADLK3Year = res.getString(R.string.DavisYearLionKing1Half);
    private String ADLK3Image = res.getString(R.string.DavisImageLionKing1Half);
    private String ADLK3Link = res.getString(R.string.DavisLinkLionKing1Half);
    private String ADDHTitle = res.getString(R.string.DavisTitleDragonHeart);
    private String ADDHDesc = res.getString(R.string.DavisDescDragonHeart);
    private String ADDHYear = res.getString(R.string.DavisYearDragonHeart);
    private String ADDHImage = res.getString(R.string.DavisImageDragonHeart);
    private String ADDHLink = res.getString(R.string.DavisLinkDragonHeart);


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MediaModel> createMovieMagic () {

        // make those movie objects
        //MediaModel action = new MediaModel(actionTitle, actionDescription, actionYear, actionImage, actionWeblink);
        //MediaModel romcom = new MediaModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MediaModel eragon = new MediaModel(ADEraTitle, ADEraDesc, ADEraYear, ADEraImage, ADEraLink);
        MediaModel lk = new MediaModel(ADLKTitle, ADLKDesc, ADLKYear,ADLKImage,ADLKLink);
        MediaModel lk2 = new MediaModel(ADLK2Title, ADLK2Desc,ADLK2Year,ADLK2Image,ADLK2Link);
        MediaModel lk3 = new MediaModel(ADLK3Title, ADLK3Desc, ADLK3Year, ADLK3Image, ADLK3Link);
        MediaModel dh = new MediaModel(ADDHTitle, ADDHDesc,ADDHYear,ADDHImage,ADDHLink);
        // add EACH movie object to our lists and maps
        //addMovieToList(action);
       //addMovieToList(romcom);
        addMovieToList(eragon);
        addMovieToList(lk);
        addMovieToList(lk2);
        addMovieToList(lk3);
        addMovieToList(dh);
        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MediaModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMediaTitle(), datMovie);
    }
}

