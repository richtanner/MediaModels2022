package com.cs315.mediamodels2022;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MRMediaContent {

    private final Context context = FNV_Wiki.getContext();
    private final Resources res = context.getResources();

    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MediaModel> ITEM_MAP = new HashMap<String, MediaModel>();

    /**
     * A List of the Movie items.
     */
    // I am calling this MOVIES, because that's what I am putting in here.  You can call it GAMES, or BOOKS, or ANIME, or FAVORITE_CS_TEXTBOOKS, ...whatever
    public static final List<MediaModel> GAME = new ArrayList<MediaModel>();


    // TODO: COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private final String fnvName1 = res.getString(R.string.fnv_name_1);
    private final String fnvDesc1 = res.getString(R.string.fnv_desc_1);
    private final String fnvLeader1 = res.getString(R.string.fnv_leader_1);
    private final String fnvImage1 = res.getString(R.string.fnv_image_1);
    private final String fnvWebLink1 = res.getString(R.string.fnv_web_link_1);

    private final String fnvName2 = res.getString(R.string.fnv_name_2);
    private final String fnvDesc2 = res.getString(R.string.fnv_desc_2);
    private final String fnvLeader2 = res.getString(R.string.fnv_leader_2);
    private final String fnvImage2 = res.getString(R.string.fnv_image_2);
    private final String fnvWebLink2 = res.getString(R.string.fnv_web_link_2);

    private final String fnvName3 = res.getString(R.string.fnv_name_3);
    private final String fnvDesc3 = res.getString(R.string.fnv_desc_3);
    private final String fnvLeader3 = res.getString(R.string.fnv_leader_3);
    private final String fnvImage3 = res.getString(R.string.fnv_image_3);
    private final String fnvWebLink3 = res.getString(R.string.fnv_web_link_3);

    private final String fnvName4 = res.getString(R.string.fnv_name_4);
    private final String fnvDesc4 = res.getString(R.string.fnv_desc_4);
    private final String fnvLeader4 = res.getString(R.string.fnv_leader_4);
    private final String fnvImage4 = res.getString(R.string.fnv_image_4);
    private final String fnvWebLink4 = res.getString(R.string.fnv_web_link_4);

    private final String fnvName5 = res.getString(R.string.fnv_name_5);
    private final String fnvDesc5 = res.getString(R.string.fnv_desc_5);
    private final String fnvLeader5 = res.getString(R.string.fnv_leader_5);
    private final String fnvImage5 = res.getString(R.string.fnv_image_5);
    private final String fnvWebLink5 = res.getString(R.string.fnv_web_link_5);




    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MediaModel> createGame () {

        // make those movie objects
        MediaModel fnv1 = new MediaModel(fnvName1, fnvDesc1, fnvLeader1, fnvImage1, fnvWebLink1);
        MediaModel fnv2 = new MediaModel(fnvName2, fnvDesc2, fnvLeader2, fnvImage2, fnvWebLink2);
        MediaModel fnv3 = new MediaModel(fnvName3, fnvDesc3, fnvLeader3, fnvImage3, fnvWebLink3);
        MediaModel fnv4 = new MediaModel(fnvName4, fnvDesc4, fnvLeader4, fnvImage4, fnvWebLink4);
        MediaModel fnv5 = new MediaModel(fnvName5, fnvDesc5, fnvLeader5, fnvImage5, fnvWebLink5);


        // add EACH movie object to our lists and maps
        addfnvToList(fnv1);
        addfnvToList(fnv2);
        addfnvToList(fnv3);
        addfnvToList(fnv4);
        addfnvToList(fnv5);

        // no more movies to add?  Okay... return our list
        return GAME;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addfnvToList (MediaModel game) {
        String title = game.getMediaTitle();
        if (!(ITEM_MAP.containsKey(title))) {
            GAME.add(game);
            ITEM_MAP.put(game.getMediaTitle(), game);
        }
    }
}
