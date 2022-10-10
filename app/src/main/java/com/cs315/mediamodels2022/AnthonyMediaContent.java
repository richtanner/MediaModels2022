package com.cs315.mediamodels2022;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnthonyMediaContent {
    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MediaModel> ITEM_MAP = new HashMap<String, MediaModel>();

    /**
     * A List of the Movie items.
     */
    // I am calling this MOVIES, because that's what I am putting in here.  You can call it GAMES, or BOOKS, or ANIME, or FAVORITE_CS_TEXTBOOKS, ...whatever
    public static final List<MediaModel> CONTENT = new ArrayList<MediaModel>();

    Context context = this.context;
    Resources res = context.getResources();

    // TODO: COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private final String civName1 = res.getString(R.string.civ_name_1);
    private final String civDesc1 = res.getString(R.string.civ_desc_1);
    private final String civLeader1 = res.getString(R.string.civ_leader_1);
    private final String civImage1 = res.getString(R.string.civ_image_1);
    private final String civWebLink1 = res.getString(R.string.civ_web_link_1);

    private final String civName2 = res.getString(R.string.civ_name_2);
    private final String civDesc2 = res.getString(R.string.civ_desc_2);
    private final String civLeader2 = res.getString(R.string.civ_leader_2);
    private final String civImage2 = res.getString(R.string.civ_image_2);
    private final String civWebLink2 = res.getString(R.string.civ_web_link_2);

    private final String civName3 = res.getString(R.string.civ_name_3);
    private final String civDesc3 = res.getString(R.string.civ_desc_3);
    private final String civLeader3 = res.getString(R.string.civ_leader_3);
    private final String civImage3 = res.getString(R.string.civ_image_3);
    private final String civWebLink3 = res.getString(R.string.civ_web_link_3);

    private final String civName4 = res.getString(R.string.civ_name_4);
    private final String civDesc4 = res.getString(R.string.civ_desc_4);
    private final String civLeader4 = res.getString(R.string.civ_leader_4);
    private final String civImage4 = res.getString(R.string.civ_image_4);
    private final String civWebLink4 = res.getString(R.string.civ_web_link_4);

    private final String civName5 = res.getString(R.string.civ_name_5);
    private final String civDesc5 = res.getString(R.string.civ_desc_5);
    private final String civLeader5 = res.getString(R.string.civ_leader_5);
    private final String civImage5 = res.getString(R.string.civ_image_5);
    private final String civWebLink5 = res.getString(R.string.civ_web_link_5);




    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MediaModel> generateCiv () {

        // make those movie objects
        MediaModel civ1 = new MediaModel(civName1, civDesc1, civLeader1, civImage1, civWebLink1);
        MediaModel civ2 = new MediaModel(civName2, civDesc2, civLeader2, civImage2, civWebLink2);
        MediaModel civ3 = new MediaModel(civName3, civDesc3, civLeader3, civImage3, civWebLink3);
        MediaModel civ4 = new MediaModel(civName4, civDesc4, civLeader4, civImage4, civWebLink4);
        MediaModel civ5 = new MediaModel(civName5, civDesc5, civLeader5, civImage5, civWebLink5);


        // add EACH movie object to our lists and maps
        addCivToList(civ1);
        addCivToList(civ2);
        addCivToList(civ3);
        addCivToList(civ4);
        addCivToList(civ5);

        // no more movies to add?  Okay... return our list
        return CONTENT;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addCivToList (MediaModel myContent) {
        CONTENT.add(myContent);
        ITEM_MAP.put(myContent.getMediaTitle(), myContent);
    }
}
