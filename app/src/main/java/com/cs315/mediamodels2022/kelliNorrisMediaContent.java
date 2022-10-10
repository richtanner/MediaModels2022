package com.cs315.mediamodels2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class kelliNorrisMediaContent {
        /**
         * A map of the Movie items, by ID (title).
         */
        public static final Map<String, MediaModel> ITEM_MAP = new HashMap<String, MediaModel>();

        /**
         * A List of the Movie items.
         */
        // I am calling this MOVIES, because that's what I am putting in here.  You can call it GAMES, or BOOKS, or ANIME, or FAVORITE_CS_TEXTBOOKS, ...whatever
        public static final List<MediaModel> GaMEs = new ArrayList<MediaModel>();


        /**
         * Create all those movie Strings we will be needing for the models
         */
        // CS315: DO THIS
        // TODO: COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

        private static final String gameHorizonZeroDawn = "Horizon Zero Dawn: ";
        private static final String game1Description = "Girl with no parents decides to tame metal animals but she is actually a clone.";
        private static final String game1Year = "2017";
        private static final String game1Image = "hzd.png";
        private static final String game1Weblink = "https://www.playstation.com/en-us/games/horizon-zero-dawn/";

    private static final String gameKatanaZero = "Katana Zero: ";
    private static final String game2Description = "Man on drugs can see through multiple dimensions and uses his powers to kill all the bad guys.";
    private static final String game2Year = "2019";
    private static final String game2Image = "ktz.png";
    private static final String game2Weblink = "https://katanazero.com/";

    private static final String gameBreathOfTheWild = "Breath of the Wild: ";
    private static final String game3Description = "Man wakes up from taking a 100yr bath, and an invisible lady tells him he's gotta fight some people";
    private static final String game3Year = "2017";
    private static final String game3Image = "botw.png";
    private static final String game3Weblink = "https://www.zelda.com/breath-of-the-wild/";

    private static final String gameWitchIt = "Witch It: ";
    private static final String game4Description = "Witches being hunted by potato farmers. ";
    private static final String game4Year = "2017";
    private static final String game4Image = "wi.png";
    private static final String game4Weblink = "https://barrelrollgames.com/games/";

    private static final String gameSuperSmashBrothers = "Super Smash Brothers: ";
    private static final String game5Description = "calculated violence";
    private static final String game5Year = "2001";
    private static final String game5Image = "ssb.png";
    private static final String game5Weblink = "https://www.smashbros.com/en_US/";


        /**
         * Create and return an array of Movie items.  Duh!
         */
        public List<MediaModel> createMovieMagic () {

            // make those movie objects
            MediaModel hzd = new MediaModel(gameHorizonZeroDawn, game1Description, game1Year, game1Image, game1Weblink);
            MediaModel ktz = new MediaModel(gameKatanaZero, game2Description, game2Year, game2Image, game2Weblink);
            MediaModel botw = new MediaModel(gameBreathOfTheWild, game3Description, game3Year, game3Image, game3Weblink);
            MediaModel wi = new MediaModel(gameWitchIt, game4Description, game4Year, game4Image, game4Weblink);
            MediaModel ssb = new MediaModel(gameSuperSmashBrothers, game5Description, game5Year, game5Image, game5Weblink);

            // add EACH movie object to our lists and maps
            addMovieToList(hzd);
            addMovieToList(ktz);
            addMovieToList(botw);
            addMovieToList(wi);
            addMovieToList(ssb);

            // no more movies to add?  Okay... return our list
            return GaMEs;
        }

        // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
        private void addMovieToList (MediaModel game) {
            GaMEs.add(game);
            ITEM_MAP.put(game.getMediaTitle(), game);
        }
    }

