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

    private static final String civName2 = "Aztec";
    private static final String civDesc2 = "The Aztec people represent a civilization in Civilization VI. They are led by Montezuma, under whom their default colors are cyan and dark red. They were added to Civilization VI in a free, separate pack that was released 90 days after the game's launch (as was the case with the Mongol civilization pack in Civilization V); during those 90 days, the Aztec civilization was available exclusively to players who had pre-ordered the game.";
    private static final String civLeader2 = "Montezuma";
    private static final String civImage2 = "aztec";
    private static final String civWebLink2 = "https://civilization.fandom.com/wiki/Aztec_(Civ6)";

    private static final String civName3 = "Babylon";
    private static final String civDesc3 = "The Babylonian people represent a civilization in Civilization VI. They are led by Hammurabi, under whom their default colors are light and dark blue. They are available with the Babylon Pack, which was released on November 19, 2020.";
    private static final String civLeader3 = "Hammurabi";
    private static final String civImage3 = "babylon";
    private static final String civWebLink3 = "https://civilization.fandom.com/wiki/Babylonian_(Civ6)";

    private static final String civName4 = "Japan";
    private static final String civDesc4 = "The Japanese people represent a civilization in Civilization VI. They are led by Hojo Tokimune, under whom their default colors are white and dark red.";
    private static final String civLeader4 = "Hojo Tokimune";
    private static final String civImage4 = "japan";
    private static final String civWebLink4 = "https://civilization.fandom.com/wiki/Japanese_(Civ6)";

    private static final String civName5 = "Mongolia";
    private static final String civDesc5 = "The Mongolian people (or Mongols) represent a civilization in Civilization VI: Rise and Fall. They are led by Genghis Khan, under whom their default colors are dark red and orange; and (with New Frontier Pass) by Kublai Khan, under whom their default colors are reversed.";
    private static final String civLeader5 = "Genghis Khan";
    private static final String civImage5 = "mongolia";
    private static final String civWebLink5 = "https://civilization.fandom.com/wiki/Mongolian_(Civ6)";




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
