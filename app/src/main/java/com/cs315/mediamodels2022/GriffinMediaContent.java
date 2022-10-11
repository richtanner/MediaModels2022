package com.cs315.mediamodels2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GriffinMediaContent {
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
    // TODO: COPY this class to create your OWN MediaContent.  Then, create five NEW media objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String gjb_movie1Title = "La La Land";
    private static final String gjb_movie1Description = "While navigating their careers in Los Angeles, a pianist and an actress fall in love while attempting to reconcile their aspirations for the future.";
    private static final String gjb_movie1Year = "2016";
    private static final String gjb_movie1Image = "lalaland";
    private static final String gjb_movie1Weblink = "https://www.imdb.com/title/tt3783958/";

    private static final String gjb_actionTitle = "Avengers";
    private static final String gjb_actionDescription = "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.";
    private static final String gjb_actionYear = "2012";
    private static final String gjb_actionImage = "avengers";
    private static final String gjb_actionWeblink = "https://www.imdb.com/title/tt0848228/";

    private static final String gjb_movie2Title = "Penguins of Madagascar";
    private static final String gjb_movie2Description = "Skipper, Kowalski, Rico and Private join forces with undercover organization The North Wind to stop the villainous Dr. Octavius Brine from destroying the world as we know it.";
    private static final String gjb_movie2Year = "2014";
    private static final String gjb_movie2Image = "penguins";
    private static final String gjb_movie2Weblink = "https://www.imdb.com/title/tt1911658/";

    private static final String gjb_movie3Title = "Shrek";
    private static final String gjb_movie3Description = "A mean lord exiles fairytale creatures to the swamp of a grumpy ogre, who must go on a quest and rescue a princess for the lord in order to get his land back.";
    private static final String gjb_movie3Year = "2001";
    private static final String gjb_movie3Image = "shrek";
    private static final String gjb_movie3Weblink = "https://www.imdb.com/title/tt0126029/";

    private static final String gjb_movie4Title = "Over The Hedge";
    private static final String gjb_movie4Description = "A scheming raccoon fools a mismatched family of forest creatures into helping him repay a debt of food, by invading the new suburban sprawl that popped up while they were hibernating...and learns a lesson about family himself.";
    private static final String gjb_movie4Year = "2006";
    private static final String gjb_movie4Image = "hedge";
    private static final String gjb_movie4Weblink = "https://www.imdb.com/title/tt0327084/";



    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MediaModel> createMovieMagic () {
        MOVIES.clear();

        // make those movie objects
        MediaModel action = new MediaModel(gjb_actionTitle, gjb_actionDescription, gjb_actionYear, gjb_actionImage, gjb_actionWeblink);
        MediaModel romcom = new MediaModel(gjb_movie1Title, gjb_movie1Description, gjb_movie1Year, gjb_movie1Image, gjb_movie1Weblink);
        MediaModel movies2 = new MediaModel(gjb_movie2Title, gjb_movie2Description, gjb_movie2Year, gjb_movie2Image, gjb_movie2Weblink);
        MediaModel movies3 = new MediaModel(gjb_movie3Title, gjb_movie3Description, gjb_movie3Year, gjb_movie3Image, gjb_movie3Weblink);
        MediaModel movies4 = new MediaModel(gjb_movie4Title, gjb_movie4Description, gjb_movie4Year, gjb_movie4Image, gjb_movie4Weblink);

        // add EACH movie object to our lists and maps
        addMovieToList(action);
        addMovieToList(romcom);
        addMovieToList(movies2);
        addMovieToList(movies3);
        addMovieToList(movies4);

        // no more movies to add?  Okay... return our lis
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MediaModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMediaTitle(), datMovie);
    }
}
