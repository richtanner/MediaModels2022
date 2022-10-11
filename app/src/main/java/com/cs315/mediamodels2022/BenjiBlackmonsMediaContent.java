package com.cs315.mediamodels2022;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BenjiBlackmonsMediaContent
{
    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MediaModel> ITEM_MAP = new HashMap<String, MediaModel>();

    /**
     * A List of the Movie items.
     */
    // I am calling this MOVIES, because that's what I am putting in here.  You can call it GAMES, or BOOKS, or ANIME, or FAVORITE_CS_TEXTBOOKS, ...whatever
    public static final List<MediaModel> GAMES = new ArrayList<MediaModel>();


    /**
     * Create all those movie Strings we will be needing for the models
     */
    // CS315: DO THIS
    Context context = App.getContext();
    Resources res = context.getResources();

    private String game1Title = res.getString(R.string.game1Title);
    private String game1Description = res.getString(R.string.game1Description);
    private String game1Year = res.getString(R.string.game1Year);
    private String game1Image = res.getString(R.string.game1Image);//TODO: Find image
    private String game1Weblink = res.getString(R.string.game1WebLink);

    private String game2Title = res.getString(R.string.game2Title);
    private String game2Description = res.getString(R.string.game2Description);
    private String game2Year = res.getString(R.string.game2Year);
    private String game2Image = res.getString(R.string.game2Image);//TODO: Find image
    private String game2Weblink = res.getString(R.string.game2WebLink);

    private String game3Title = res.getString(R.string.game3Title);
    private String game3Description = res.getString(R.string.game3Description);
    private String game3Year = res.getString(R.string.game3Year);
    private String game3Image = res.getString(R.string.game3Image);//TODO: Find image
    private String game3Weblink = res.getString(R.string.game3WebLink);

    private String game4Title = res.getString(R.string.game4Title);
    private String game4Description = res.getString(R.string.game4Description);
    private String game4Year = res.getString(R.string.game4Year);
    private String game4Image = res.getString(R.string.game4Image);//TODO: Find image
    private String game4Weblink = res.getString(R.string.game4WebLink);

    private String game5Title = res.getString(R.string.game5Title);
    private String game5Description = res.getString(R.string.game5Description);
    private String game5Year = res.getString(R.string.game5Year);
    private String game5Image = res.getString(R.string.game5Image);//TODO: Find image
    private String game5Weblink = res.getString(R.string.game5WebLink);


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MediaModel> createGameList ()
    {

        // make those movie objects
        MediaModel game1 = new MediaModel(game1Title, game1Description, game1Year, game1Image, game1Weblink);
        MediaModel game2 = new MediaModel(game2Title, game2Description, game2Year, game2Image, game2Weblink);
        MediaModel game3 = new MediaModel(game3Title, game3Description, game3Year, game3Image, game3Weblink);
        MediaModel game4 = new MediaModel(game4Title, game4Description, game4Year, game4Image, game4Weblink);
        MediaModel game5 = new MediaModel(game5Title, game5Description, game5Year, game5Image, game5Weblink);

        GAMES.clear();
        // add EACH movie object to our lists and maps
        addGameToList(game1);
        addGameToList(game2);
        addGameToList(game3);
        addGameToList(game4);
        addGameToList(game5);

        // no more movies to add?  Okay... return our list
        return GAMES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addGameToList (MediaModel game)
    {
        GAMES.add(game);
        ITEM_MAP.put(game.getMediaTitle(), game);
    }
}
