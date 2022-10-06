package com.cs315.mediamodels2022;

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

    // TODO: COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String civName1 = "America";
    private static final String civDesc1 = "The American people represent a civilization in Civilization VI. They are led by Teddy Roosevelt, under whom their default colors are dark blue and white. When led by Rough Rider Teddy, their default colors are red and white.";
    private static final String civLeader1 = "Teddy Roosevelt";
    private static final String civImage1 = "america";
    private static final String civWebLink1 = "https://civilization.fandom.com/wiki/American_(Civ6)";

    private static final String civName2 = "Generic Rom Com 1:";
    private static final String civDesc2 = "";
    private static final String civLeader2 = "2015";
    private static final String civImage2 = "genericromcom";
    private static final String civWebLink2 = "http://showtimeshowdown.com/5-cliche-formulas-of-movie-genres/";

    private static final String civName3 = "Generic Rom Com 1:";
    private static final String civDesc3 = "";
    private static final String civLeader3 = "2015";
    private static final String civImage3 = "genericromcom";
    private static final String civWebLink3 = "http://showtimeshowdown.com/5-cliche-formulas-of-movie-genres/";

    private static final String civName4 = "Generic Rom Com 1:";
    private static final String civDesc4 = "";
    private static final String civLeader4 = "2015";
    private static final String civImage4 = "genericromcom";
    private static final String civWebLink4 = "http://showtimeshowdown.com/5-cliche-formulas-of-movie-genres/";

    private static final String civName5 = "Generic Rom Com 1:";
    private static final String civDesc5 = "";
    private static final String civLeader5 = "2015";
    private static final String civImage5 = "genericromcom";
    private static final String civWebLink5 = "http://showtimeshowdown.com/5-cliche-formulas-of-movie-genres/";




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
