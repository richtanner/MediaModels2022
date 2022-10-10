package com.cs315.mediamodels2022;

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
    // TODO: COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String game1Title = "Drawn To Life";
    private static final String game1Description = "A village has fallen into ruin, and everyone is leaving as the darkness creeps in. The daughter of the mayor calls out to the Creator to save them, and he offers them a hero to save them from the evil Wilfre. He saves all of the citizens who ran away and defeats Wilfre with the help of the Creator drawing different items to help the hero navigate through the levels";
    private static final String game1Year = "2007";
    private static final String game1Image = "drawn_to_life.png";//TODO: Find image
    private static final String game1Weblink = "https://drawntolife.wiki/en/Drawn_to_Life";

    private static final String game2Title = "Mario & Luigi: Bowser's Inside Story";
    private static final String game2Description = "A turn based RPG in the Mario and Luigi series where the brothers have to team up with Bowser. After being inhaled by him, the bros navigate inside of Bowser while Bowser himself navigates the overworld. If Bowser is ever in need of assistance, the brothers can help him out by stimulating muscles, striking nerves, and fixing up Bowser's body to give him new abilities.";
    private static final String game2Year = "2009";
    private static final String game2Image = "bowsers_inside_story.png";//TODO: Find image
    private static final String game2Weblink = "https://www.mariowiki.com/Mario_%26_Luigi:_Bowser%27s_Inside_Story";

    private static final String game3Title = "Professor Layton Vs Phoenix Wright: Ace Attorney";
    private static final String game3Description = "A crossover between the Professor Layton and Phoenix Wright game franchises, featuring investigation sequences that lean more into the Professor Layton puzzle solving genre and trial sequences that take from the Phoenix Wright games. The main mystery of the game is about a mysterious medieval town called Laberyinthia";
    private static final String game3Year = "2012";
    private static final String game3Image = "professor_layton_vs_phoenix_wright.png";//TODO: Find image
    private static final String game3Weblink = "https://en.wikipedia.org/wiki/Professor_Layton_vs._Phoenix_Wright:_Ace_Attorney";

    private static final String game4Title = "The Legendary Starfy";
    private static final String game4Description = "An underwater adventure about a starfish named Starfy, this platformer is often likened to an underwater Kirby game with it's interesting powerups and fun boss fights";
    private static final String game4Year = "2008";
    private static final String game4Image = "the_legendary_starfy.png";//TODO: Find image
    private static final String game4Weblink = "https://en.wikipedia.org/wiki/The_Legendary_Starfy_(video_game)";

    private static final String game5Title = "Wario: Master of Disguise";
    private static final String game5Description = "An action platformer staring everyone's favorite thief, Wario. Use the stylis to draw disguises on Wario to grant him different abilities, and try to get as much treasure as you can, and maybe also stop a demon lord while you're at it.";
    private static final String game5Year = "2007";
    private static final String game5Image = "wario_master_of_disguise.png";//TODO: Find image
    private static final String game5Weblink = "https://www.mariowiki.com/Wario:_Master_of_Disguise";


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
