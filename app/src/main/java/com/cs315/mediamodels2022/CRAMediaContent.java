package com.cs315.mediamodels2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CRAMediaContent {
    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MediaModel> ITEM_MAP = new HashMap<String, MediaModel>();

    /**
     * A List of the Movie items.
     */
    // I am calling this MOVIES, because that's what I am putting in here.  You can call it GAMES, or BOOKS, or ANIME, or FAVORITE_CS_TEXTBOOKS, ...whatever
    public static final List<MediaModel> MOVIES = new ArrayList<MediaModel>();

    /**
     * Create all those movie Strings we will be needing for the models
     */
    // CS315: DO THIS

    private static final String movie1Title = "Avengers: Endgame";
    private static final String movie1Description = "After half of all life is snapped away by Thanos, the Avengers are left scattered and divided. Now with a way to reverse the damage, the Avengers and their allies must assemble once more and learn to put differences aside in order to work together and set things right.";
    private static final String movie1Year = "2019";
    private static final String movie1Image = "avengers_endgame";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt4154796/?ref_=ttpl_pl_tt";

    private static final String movie2Title = "Real Steel";
    private static final String movie2Description = "In the near future, robots have taken over for humans in the boxing ring. A former boxer and small-time promoter (Hugh Jackman) struggles to make a living with patched-up robots in shady venues. When he discovers he has an 11-year-old son who believes that a robot found in the junk heap has what it takes to win, he finds himself with a shot at the big time.";
    private static final String movie2Year = "2011";
    private static final String movie2Image = "real_steel";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt0433035/";

    private static final String movie3Title = "Spectre";
    private static final String movie3Description = "A cryptic message from James Bond's past sends him on a trail to uncover the existence of a sinister organisation named SPECTRE. With a new threat dawning, Bond learns the terrible truth about the author of all his pain in his most recent missions.";
    private static final String movie3Year = "2015";
    private static final String movie3Image = "spectre_poster";
    private static final String movie3Weblink = "https://www.imdb.com/title/tt2379713/";

    private static final String movie4Title = "Cars";
    private static final String movie4Description = "On the way to the biggest race of his life, a hotshot rookie race car gets stranded in a rundown town, and learns that winning isn't everything in life.";
    private static final String movie4Year = "2006";
    private static final String movie4Image = "cars_poster";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt0317219/";

    private static final String movie5Title = "Free Guy";
    private static final String movie5Description = "In the extremely popular video game, Free City, a NPC named Guy learns the true nature of his existence when he meets the girl of his dreams, a human player. This player's interactions with Guy has massive affects on him, the game, and real world as they play it.";
    private static final String movie5Year = "2021";
    private static final String movie5Image = "free_guy";
    private static final String movie5Weblink = "https://www.imdb.com/title/tt6264654/";

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MediaModel> createMovieMagic () {

        // make those movie objects
        MediaModel movie1 = new MediaModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MediaModel movie2 = new MediaModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
        MediaModel movie3 = new MediaModel(movie3Title, movie3Description, movie3Year, movie3Image, movie3Weblink);
        MediaModel movie4 = new MediaModel(movie4Title, movie4Description, movie4Year, movie4Image, movie4Weblink);
        MediaModel movie5 = new MediaModel(movie5Title, movie5Description, movie5Year, movie5Image, movie5Weblink);

        // add EACH movie object to our lists and maps
        addMovieToList(movie1);
        addMovieToList(movie2);
        addMovieToList(movie3);
        addMovieToList(movie4);
        addMovieToList(movie5);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system. Seriously. It happens.
    private void addMovieToList (MediaModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMediaTitle(), datMovie);
    }
}

