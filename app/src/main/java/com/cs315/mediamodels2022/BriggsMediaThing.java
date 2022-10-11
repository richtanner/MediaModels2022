package com.cs315.mediamodels2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BriggsMediaThing {
    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MediaModel> ITEM_MAP = new HashMap<String, MediaModel>();

    /**
     * A List of the Movie items.
     */
    // I am calling this MOVIES, because that's what I am putting in here.  You can call it GAMES, or BOOKS, or ANIME, or FAVORITE_CS_TEXTBOOKS, ...whatever
    public static final List<MediaModel> DUNKEYTOP52021 = new ArrayList<MediaModel>();

    /**
     * Create all those movie Strings we will be needing for the models
     */
    // CS315: DO THIS
    // TODO: ***DONE*** COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String game5Title = "Guilty Gear Strive";
    private static final String game5Description = "“Guilty Gear -Strive-“ is the latest entry in the critically acclaimed Guilty Gear fighting game franchise. Created by Daisuke Ishiwatari and developed by Arc System Works, “Guilty Gear -Strive-“ upholds the series’ reputation for a high octane soundtrack, groundbreaking hybrid 2D/3D cell-shaded graphics and intense, rewarding gameplay.";
    private static final String game5Year = "2021";
    private static final String game5Image = "guiltygearstriveimage";
    private static final String game5Weblink = "https://store.steampowered.com/app/1384160/GUILTY_GEAR_STRIVE/";

    private static final String game4Title = "Hitman 3";
    private static final String game4Description = "HITMAN 3 is the dramatic conclusion to the World of Assassination trilogy. Become Agent 47, a legendary assassin and use creativity and improvisation to execute the most ingenious and spectacular eliminations, in sprawling sandbox locations all around the globe.";
    private static final String game4Year = "2021";
    private static final String game4Image = "hitman3";
    private static final String game4Weblink = "https://store.steampowered.com/app/1659040/HITMAN_3/";

    private static final String game3Title = "Dragon's Quest 11";
    private static final String game3Description = "DRAGON QUEST XI S is the last entry in the legendary RPG series from creator Yuji Horii, character designer Akira Toriyama and composer Koichi Sugiyama. This eleventh main entry is a completely standalone experience that features new characters, a beautifully detailed world, finely tuned turn-based combat, and an immersive story that will appeal to longtime fans and franchise newcomers alike.";
    private static final String game3Year = "2021";
    private static final String game3Image = "dragonsquest11";
    private static final String game3Weblink = "https://store.steampowered.com/app/1295510/DRAGON_QUEST_XI_S_Echoes_of_an_Elusive_Age__Definitive_Edition/";

    private static final String game2Title = "It Takes 2";
    private static final String game2Description = "Embark on the craziest journey of your life in It Takes Two, a genre-bending platform adventure created purely for co-op. Invite a friend to join for free with Friend’s Pass and work together across a huge variety of gleefully disruptive gameplay challenges. Play as the clashing couple Cody and May, two humans turned into dolls by a magic spell. Together, trapped in a fantastical world where the unpredictable hides around every corner, they are reluctantly challenged with saving their fractured relationship.";
    private static final String game2Year = "2021";
    private static final String game2Image = "ittakes2";
    private static final String game2Weblink = "https://store.steampowered.com/app/1426210/It_Takes_Two/";

    private static final String game1Title = "Bowser's Fury";
    private static final String game1Description = "In Bowser’s Fury, Mario arrives on Lake Lapcat and is confronted with a rampaging Bowser! Join forces with Bowser Jr. and venture through an interconnected world made of cat-themed…well, everything. Enemies, flowers, and even birds take on a feline form.";
    private static final String game1Year = "2021";
    private static final String game1Image = "bowsersfury";
    private static final String game1Weblink = "https://www.nintendo.com/store/products/super-mario-3d-world-plus-bowsers-fury-switch/";



    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MediaModel> createGameMagic () {

        // make those movie objects
        MediaModel guiltyGearStrive = new MediaModel(game5Title, game5Description, game5Year, game5Image, game5Weblink);
        MediaModel hitman3 = new MediaModel(game4Title, game4Description, game4Year, game4Image, game4Weblink);
        MediaModel dragonQuest11 = new MediaModel(game3Title, game3Description, game3Year, game3Image, game3Weblink);
        MediaModel itTakes2 = new MediaModel(game2Title, game2Description, game2Year, game2Image, game2Weblink);
        MediaModel bowsersFury = new MediaModel(game1Title, game1Description, game1Year, game1Image, game1Weblink);

        DUNKEYTOP52021.clear();
        // add EACH movie object to our lists and maps
        addGameToList(guiltyGearStrive);
        addGameToList(hitman3);
        addGameToList(dragonQuest11);
        addGameToList(itTakes2);
        addGameToList(bowsersFury);

        // no more movies to add?  Okay... return our list
        return DUNKEYTOP52021;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addGameToList (MediaModel datGame)
    {

        DUNKEYTOP52021.add(datGame);
        ITEM_MAP.put(datGame.getMediaTitle(), datGame);
    }
}
