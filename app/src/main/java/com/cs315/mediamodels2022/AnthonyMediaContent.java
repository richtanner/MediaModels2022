package com.cs315.mediamodels2022;

import android.content.Context;
import android.content.res.Resources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AnthonyMediaContent{
    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MediaModel> ITEM_MAP = new HashMap<String, MediaModel>();


    /**
     * A List of the Movie items.
     */
    // I am calling this MOVIES, because that's what I am putting in here.  You can call it GAMES, or BOOKS, or ANIME, or FAVORITE_CS_TEXTBOOKS, ...whatever
    public static final List<MediaModel> CONTENT = new ArrayList<MediaModel>();
    //Context context = getContext();
    Context context = App.getContext();
    Resources res = context.getResources();

    // TODO: COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private String civName1 = App.getContext().getResources().getString(R.string.civ_name_1);
    private String civDesc1 = res.getString(R.string.civ_desc_1);
    private String civLeader1 = res.getString(R.string.civ_leader_1);
    private String civImage1 = res.getString(R.string.civ_image_1);
    private String civWebLink1 = res.getString(R.string.civ_web_link_1);

    private String civName2 = res.getString(R.string.civ_name_2);
    private String civDesc2 = res.getString(R.string.civ_desc_2);
    private String civLeader2 = res.getString(R.string.civ_leader_2);
    private String civImage2 = res.getString(R.string.civ_image_2);
    private String civWebLink2 = res.getString(R.string.civ_web_link_2);

    private String civName3 = res.getString(R.string.civ_name_3);
    private String civDesc3 = res.getString(R.string.civ_desc_3);
    private String civLeader3 = res.getString(R.string.civ_leader_3);
    private String civImage3 = res.getString(R.string.civ_image_3);
    private String civWebLink3 = res.getString(R.string.civ_web_link_3);

    private String civName4 = res.getString(R.string.civ_name_4);
    private String civDesc4 = res.getString(R.string.civ_desc_4);
    private String civLeader4 = res.getString(R.string.civ_leader_4);
    private String civImage4 = res.getString(R.string.civ_image_4);
    private String civWebLink4 = res.getString(R.string.civ_web_link_4);

    private String civName5 = res.getString(R.string.civ_name_5);
    private String civDesc5 = res.getString(R.string.civ_desc_5);
    private String civLeader5 = res.getString(R.string.civ_leader_5);
    private String civImage5 = res.getString(R.string.civ_image_5);
    private String civWebLink5 = res.getString(R.string.civ_web_link_5);




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

        CONTENT.clear();
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
