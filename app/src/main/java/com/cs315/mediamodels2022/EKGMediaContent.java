package com.cs315.mediamodels2022;

import androidx.lifecycle.MediatorLiveData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EKGMediaContent {
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
    // TODO: Set these all to strings in strings.xml
    private static final String hollowKnightTitle = "Hollow Knight";
    private static final String hollowKnightDescription = "Forge your own path in Hollow Knight! An epic action adventure through a vast ruined kingdom of insects and heroes. Explore twisting caverns, battle tainted creatures and befriend bizarre bugs, all in a classic, hand-drawn 2D style.";
    private static final String hollowKnightYear = "2017";
    private static final String hollowKnightImage = "hollowknightimage";
    private static final String hollowKnightWeblink = "https://store.steampowered.com/app/367520/Hollow_Knight/";

    private static final String rocketLeagueTitle = "Rocket League";
    private static final String rocketLeagueDescription = "Download and compete in the high-octane hybrid of arcade-style soccer and vehicular mayhem! customize your car, hit the field, and compete in one of the most critically acclaimed sports games of all time! Download and take your shot! \n \nHit the field by yourself or with friends in 1v1, 2v2, and 3v3 Online Modes, or enjoy Extra Modes like Rumble, Snow Day, or Hoops. Unlock items in Rocket Pass, climb the Competitive Ranks, compete in Competitive Tournaments, complete Challenges, enjoy cross-platform progression and more! The field is waiting. Take your shot!";
    private static final String rocketLeagueYear = "2015";
    private static final String rocketLeagueImage = "rocketleagueimage";
    private static final String rocketLeagueWeblink = "https://www.rocketleague.com/";

    private static final String terrariaTitle = "Terraria";
    private static final String terrariaDescription = "Dig, Fight, Explore, Build: The very world is at your fingertips as you fight for survival, fortune, and glory. Will you delve deep into cavernous expanses in search of treasure and raw materials with which to craft ever-evolving gear, machinery, and aesthetics? Perhaps you will choose instead to seek out ever-greater foes to test your mettle in combat? Maybe you will decide to construct your own city to house the host of mysterious allies you may encounter along your travels? \n \nIn the World of Terraria, the choice is yours!\n" + "\n" + "Blending elements of classic action games with the freedom of sandbox-style creativity, Terraria is a unique gaming experience where both the journey and the destination are completely in the player’s control. The Terraria adventure is truly as unique as the players themselves! \n \nAre you up for the monumental task of exploring, creating, and defending a world of your own?";
    private static final String terrariaYear = "2011";
    private static final String terrariaImage = "terrariaimage";
    private static final String terrariaWeblink = "https://store.steampowered.com/app/105600/Terraria/";

    private static final String mgrrTitle = "Metal Gear Rising: Revengeance";
    private static final String mgrrDescription = "Developed by Kojima Productions and PlatinumGames, METAL GEAR RISING: REVENGEANCE takes the renowned METAL GEAR franchise into exciting new territory with an all-new action experience. The game seamlessly melds pure action and epic story-telling that surrounds Raiden – a child soldier transformed into a half-human, half-cyborg ninja who uses his High Frequency katana blade to cut through any thing that stands in his vengeful path!";
    private static final String mgrrYear = "2013";
    private static final String mgrrImage = "mgrrimage";
    private static final String mgrrWeblink = "https://store.steampowered.com/app/235460/METAL_GEAR_RISING_REVENGEANCE/";

    private static final String amongUsTitle = "Among Us";
    private static final String amongUsDescription = "Play with 4-15 player online or via local WiFi as you attempt to prepare your spaceship for departure, but beware as one or more random players among the Crew are Impostors bent on killing everyone!";
    private static final String amongUsYear = "2018";
    private static final String amongUsImage = "amongusimage";
    private static final String amongUsWeblink = "https://store.steampowered.com/app/945360/Among_Us/";


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
        GAMES.add(game);
        ITEM_MAP.put(game.getMediaTitle(), game);
    }
}

