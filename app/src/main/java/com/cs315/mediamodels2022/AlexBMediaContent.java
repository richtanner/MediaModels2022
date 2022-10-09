package com.cs315.mediamodels2022;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlexBMediaContent extends AppCompatActivity {

    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MediaModel> ITEM_MAP = new HashMap<String, MediaModel>();

    /**
     * A List of the Movie items.
     */
    // I am calling this MOVIES, because that's what I am putting in here.  You can call it GAMES, or BOOKS, or ANIME, or FAVORITE_CS_TEXTBOOKS, ...whatever
    public static final List<MediaModel> Movie_List = new ArrayList<MediaModel>();


    /**
     * Create all those movie Strings we will be needing for the models
     */
    // CS315: DO THIS
    private static final String movie1Title = "The Super Mario Bros. Movie";
    private static final String movie1Description = "A plumber named Mario travels through an underground labyrinth with his brother, Luigi, trying to save a captured princess. Feature film adaptation of the popular video game.";
    private static final String movie1Year = "2023";
    private static final String movie1Image = String.valueOf(R.drawable.api6nuaeb__93364);
    private static final String movie1Weblink = "https://www.imdb.com/title/tt6718170/?ref_=tt_mv_close";

    private static final String movie2Title = "Interstellar";
    private static final String movie2Description = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.";
    private static final String movie2Year = "2014";
    private static final String movie2Image = String.valueOf(R.drawable.interstellar);
    private static final String movie2Weblink = "https://www.imdb.com/title/tt0816692/?ref_=nv_sr_srsg_0";

    private static final String movie3Title = "Sicario";
    private static final String movie3Description = "An idealistic FBI agent is enlisted by a government task force to aid in the escalating war against drugs at the border area between the U.S. and Mexico.";
    private static final String movie3Year = "2015";
    private static final String movie3Image = String.valueOf(R.drawable.sicario);
    private static final String movie3Weblink = "https://www.imdb.com/title/tt3397884/?ref_=nv_sr_srsg_0";

    private static final String movie4Title = "Hell or High Water";
    private static final String movie4Description = "A divorced father and his ex-con older brother resort to a desperate scheme in order to save their family's ranch in West Texas.";
    private static final String movie4Year = "2016";
    private static final String movie4Image = String.valueOf(R.drawable.hellorhighwater);
    private static final String movie4Weblink = "https://www.imdb.com/title/tt2582782/?ref_=nv_sr_srsg_0";

    private static final String movie5Title = "Heat";
    private static final String movie5Description = "A group of high-end professional thieves start to feel the heat from the LAPD when they unknowingly leave a clue at their latest heist.";
    private static final String movie5Year = "1995";
    private static final String movie5Image = String.valueOf(R.drawable.heat);
    private static final String movie5Weblink = "https://www.imdb.com/title/tt0113277/?ref_=nv_sr_srsg_0";




    /**
     * Create and return an array of Movie items.  Duh!
     */
    public void createMovieMagic () {

        // make those movie objects
        MediaModel new_movie1 = new MediaModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MediaModel new_movie2 = new MediaModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
        MediaModel new_movie3 = new MediaModel(movie3Title, movie3Description, movie3Year, movie3Image, movie3Weblink);
        MediaModel new_movie4 = new MediaModel(movie4Title, movie4Description, movie4Year, movie4Image, movie4Weblink);
        MediaModel new_movie5 = new MediaModel(movie5Title, movie5Description, movie5Year, movie5Image, movie5Weblink);

        // add EACH movie object to our lists and maps
        addMovieToList(new_movie1);
        addMovieToList(new_movie2);
        addMovieToList(new_movie3);
        addMovieToList(new_movie4);
        addMovieToList(new_movie5);

        // no more movies to add?  Okay... return our list
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MediaModel datMovie) {
        Movie_List.add(datMovie);
        ITEM_MAP.put(datMovie.getMediaTitle(), datMovie);
    }
}
