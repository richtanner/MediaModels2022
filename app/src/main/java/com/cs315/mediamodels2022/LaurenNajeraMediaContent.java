package com.cs315.mediamodels2022;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LaurenNajeraMediaContent
{
    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MediaModel> ITEM_MAP = new HashMap<String, MediaModel>();

    /**
     * A List of the Movie items.
     */
    // I am calling this MOVIES, because that's what I am putting in here.  You can call it GAMES, or BOOKS, or ANIME, or FAVORITE_CS_TEXTBOOKS, ...whatever
    public static final List<MediaModel> MEDIA = new ArrayList<MediaModel>();


    /**
     * Create all those movie Strings we will be needing for the models
     */
    // CS315: DO THIS
    // TODO: COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    Context context = App.getContext();
    Resources res = context.getResources();

    private String movie1Title = res.getString(R.string.movie1Title);
    private String movie1Description = res.getString(R.string.movie1Description);
    private String movie1Year = res.getString(R.string.movie1Year);
    private String movie1Image = res.getString(R.string.movie1Image);
    private String movie1Weblink = res.getString(R.string.movie1WebLink);

    private String actionTitle = res.getString(R.string.actionTitle);
    private String actionDescription = res.getString(R.string.actionDescription);
    private String actionYear = res.getString(R.string.actionYear);
    private String actionImage = res.getString(R.string.actionImage);
    private String actionWeblink = res.getString(R.string.actionWebLink);

    private String animeTitle = res.getString(R.string.animeTitle);
    private String animeDescription = res.getString(R.string.animeDescription);
    private String animeYear = res.getString(R.string.animeYear);
    private String animeImage = res.getString(R.string.animeImage);
    private String animeWeblink = res.getString(R.string.animeWebLink);

    private String game1Title = res.getString(R.string.game1Title);
    private String game1Description = res.getString(R.string.game1Description);
    private String game1Year = res.getString(R.string.game1Year);
    private String game1Image = res.getString(R.string.game1Image);
    private String game1Weblink = res.getString(R.string.game1WebLink);

    private String game2Title = res.getString(R.string.game2Title);
    private String game2Description = res.getString(R.string.game2Description);
    private String game2Year = res.getString(R.string.game2Year);
    private String game2Image = res.getString(R.string.game2Image);
    private String game2Weblink = res.getString(R.string.game2WebLink);


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MediaModel> createMovieMagic ()
    {

        // make those movie objects
        MediaModel disaster = new MediaModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MediaModel action = new MediaModel(actionTitle, actionDescription, actionYear, actionImage, actionWeblink);
        MediaModel anime = new MediaModel(animeTitle, animeDescription, animeYear, animeImage, animeWeblink);
        MediaModel game1 = new MediaModel(game1Title, game1Description, game1Year, game1Image, game1Weblink);
        MediaModel game2 = new MediaModel(game2Title, game2Description, game2Year, game2Image, game2Weblink);

        MEDIA.clear();
        // add EACH movie object to our lists and maps
        addMovieToList(action);
        addMovieToList(disaster);
        addMovieToList(anime);
        addMovieToList(game1);
        addMovieToList(game2);

        // no more movies to add?  Okay... return our list
        return MEDIA;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MediaModel datMovie)
    {
        MEDIA.add(datMovie);
        ITEM_MAP.put(datMovie.getMediaTitle(), datMovie);
    }
}
