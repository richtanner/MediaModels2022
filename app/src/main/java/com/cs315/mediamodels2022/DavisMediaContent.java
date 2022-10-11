package com.cs315.mediamodels2022;

import android.content.Context;
import android.content.res.Resources;
import android.provider.MediaStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DavisMediaContent {
    Context context = App.getContext();
    Resources res = context.getResources();

    private boolean haveThis = false;

    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MediaModel> SCHITEM_MAP = new HashMap<String, MediaModel>();

    /**
     * A List of the Movie items.
     */
    // I am calling this MOVIES, because that's what I am putting in here.  You can call it GAMES, or BOOKS, or ANIME, or FAVORITE_CS_TEXTBOOKS, ...whatever
    public static final List<MediaModel> SCHMOVIES = new ArrayList<MediaModel>();


    /**
     * Create all those movie Strings we will be needing for the models
     */
    // CS315: DO THIS
    // DONE -> COPY this class to create your OWN MediaContent. DONE -> Then, create five NEW media objects here. Complete with images and URLs. DONE -> DELETE (I keep but fix) the two existing movies, they are only here as an example
            //All Profs things turned to proper strings :)
    private String movie1Title = res.getString(R.string.ProfTannermovie1Title);
    private String movie1Description = res.getString(R.string.ProfTannermovie1Description);
    private String movie1Year = res.getString(R.string.ProfTannermovie1Year);
    private String movie1Image = res.getString(R.string.ProfTannermovie1Image);
    private String movie1Weblink = res.getString(R.string.ProfTannermovie1WebLink);

    private String actionTitle = res.getString(R.string.ProfTannermovie2Title);
    private String actionDescription = res.getString(R.string.ProfTannermovie2Description);
    private String actionYear = res.getString(R.string.ProfTannermovie2Year);
    private String actionImage = res.getString(R.string.ProfTannermovie2Image);
    private String actionWeblink = res.getString(R.string.ProfTannermovie2WebLink);

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
        return SCHMOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MediaModel datMovie) {
        if(SCHMOVIES.size() != 0){
            for (int i = 0; i < SCHMOVIES.size(); i++){
                if(SCHMOVIES.get(i) == datMovie){
                    //we already have it
                    haveThis = true;
                }
            }
        }

        if(haveThis == false) {
            SCHMOVIES.add(datMovie);
            SCHITEM_MAP.put(datMovie.getMediaTitle(), datMovie);
        }

    }
}
