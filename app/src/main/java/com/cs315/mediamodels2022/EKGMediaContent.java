package com.cs315.mediamodels2022;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EKGMediaContent {

    private final Context context = App.getContext();
    private final Resources r = context.getResources();

    /**
     * A map of the Game items, by ID (title).
     */
    public static final Map<String, MediaModel> ITEM_MAP = new HashMap<String, MediaModel>();

    /**
     * A List of the Game items.
     */
    public static final List<MediaModel> GAMES = new ArrayList<MediaModel>();

    /**
     * Create all those game Strings we will be needing for the models
     */
    // CS315: DO THIS
    private final String hollowKnightTitle = r.getString(R.string.hollowKnightTitle);
    private final String hollowKnightDescription = r.getString(R.string.hollowKnightDescription);
    private final String hollowKnightYear = r.getString(R.string.hollowKnightYear);
    private final String hollowKnightImage = r.getString(R.string.hollowKnightImage);
    private final String hollowKnightWeblink = r.getString(R.string.hollowKnightWebLink);

    private final String rocketLeagueTitle = r.getString(R.string.rocketLeagueTitle);
    private final String rocketLeagueDescription = r.getString(R.string.rocketLeagueDescription);
    private final String rocketLeagueYear = r.getString(R.string.rocketLeagueYear);
    private final String rocketLeagueImage = r.getString(R.string.rocketLeagueImage);
    private final String rocketLeagueWeblink = r.getString(R.string.rocketLeagueWebLink);

    private final String terrariaTitle = r.getString(R.string.terrariaTitle);
    private final String terrariaDescription = r.getString(R.string.terrariaDescription);
    private final String terrariaYear = r.getString(R.string.terrariaYear);
    private final String terrariaImage = r.getString(R.string.terrariaImage);
    private final String terrariaWeblink = r.getString(R.string.terrariaWebLink);

    private final String mgrrTitle = r.getString(R.string.mgrrTitle);
    private final String mgrrDescription = r.getString(R.string.mgrrDescription);
    private final String mgrrYear = r.getString(R.string.mgrrYear);
    private final String mgrrImage = r.getString(R.string.mgrrImage);
    private final String mgrrWeblink = r.getString(R.string.mgrrWebLink);

    private final String amongUsTitle = r.getString(R.string.amongUsTitle);
    private final String amongUsDescription = r.getString(R.string.amongUsDescription);
    private final String amongUsYear = r.getString(R.string.amongUsYear);
    private final String amongUsImage = r.getString(R.string.amongUsImage);
    private final String amongUsWeblink = r.getString(R.string.amongUsWebLink);

    /**
     * Create and return an array of Game items.  Duh!
     */
    public List<MediaModel> createGameMagic () {

        // make those game objects
        MediaModel hollow_knight = new MediaModel(hollowKnightTitle, hollowKnightDescription, hollowKnightYear, hollowKnightImage, hollowKnightWeblink);
        MediaModel rocket_league = new MediaModel(rocketLeagueTitle, rocketLeagueDescription, rocketLeagueYear, rocketLeagueImage, rocketLeagueWeblink);
        MediaModel terraria = new MediaModel(terrariaTitle, terrariaDescription, terrariaYear, terrariaImage, terrariaWeblink);
        MediaModel mgrr = new MediaModel(mgrrTitle, mgrrDescription, mgrrYear, mgrrImage, mgrrWeblink);
        MediaModel among_us = new MediaModel(amongUsTitle, amongUsDescription, amongUsYear, amongUsImage, amongUsWeblink);

        // add EACH game object to our lists and maps
        addGameToList(hollow_knight);
        addGameToList(rocket_league);
        addGameToList(terraria);
        addGameToList(mgrr);
        addGameToList(among_us);

        // no more games to add?  Okay... return our list
        return GAMES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addGameToList (MediaModel game) {
        String title = game.getMediaTitle();
        if (!(ITEM_MAP.containsKey(title))) {
            GAMES.add(game);
            ITEM_MAP.put(game.getMediaTitle(), game);
        }
    }
}

