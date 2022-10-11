package com.cs315.mediamodels2022;

import android.content.Context;
import android.content.res.Resources;
import android.provider.MediaStore;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarlonMillerMediaContent {

    public static final Map<String,MediaModel> MM_MAP = new HashMap<String,MediaModel>();
    public static final List<MediaModel> AOT = new ArrayList<MediaModel>(); // Attack on Titan Characters

    //private static AccessController App;
    //private AccessController App;
    //static Context context = myAppContext.getContext();
    //static Resources resources = context.getResources();

    // *****************************************************************************************
    // This is the method to use the strings from strings.xml but Context and Resources make the
    // application crash. So I decided to use the simple strings as long as it runs.
    // *****************************************************************************************

//    private static final String character1Name = resources.getString(R.string.AOTCharacter1Name);
//    private static final String character1Description = resources.getString(R.string.AOTCharacter1Description);
//    private static final String character1Year = resources.getString(R.string.AOTCharacter1Year);
//    private static final String character1Image = String.valueOf(R.drawable.eren_jaegar);
//    private static final String character1WebLink = resources.getString(R.string.AOTCharacter1WebLink);
//
//    private static final String character2Name = resources.getString(R.string.AOTCharacter2Name);
//    private static final String character2Description = resources.getString(R.string.AOTCharacter2Description);
//    private static final String character2Year = resources.getString(R.string.AOTCharacter2Year);
//    private static final String character2Image = String.valueOf(R.drawable.reiner_braun);
//    private static final String character2WebLink = resources.getString(R.string.AOTCharacter2WebLink);
//
//    private static final String character3Name = resources.getString(R.string.AOTCharacter3Name);
//    private static final String character3Description = resources.getString(R.string.AOTCharacter3Description);
//    private static final String character3Year = resources.getString(R.string.AOTCharacter3Year);
//    private static final String character3Image = String.valueOf(R.drawable.armin);
//    private static final String character3WebLink = resources.getString(R.string.AOTCharacter3WebLink);
//
//    private static final String character4Name = resources.getString(R.string.AOTCharacter4Name);
//    private static final String character4Description = resources.getString(R.string.AOTCharacter4Description);
//    private static final String character4Year = resources.getString(R.string.AOTCharacter4Year);
//    private static final String character4Image = String.valueOf(R.drawable.mikasa);
//    private static final String character4WebLink = resources.getString(R.string.AOTCharacter4WebLink);
//
//    private static final String character5Name = resources.getString(R.string.AOTCharacter5Name);
//    private static final String character5Description = resources.getString(R.string.AOTCharacter5Description);
//    private static final String character5Year = resources.getString(R.string.AOTCharacter5Year);
//    private static final String character5Image = String.valueOf(R.drawable.floch);
//    private static final String character5WebLink = resources.getString(R.string.AOTCharacter5WebLink);

    private static final String character1Name = "Eren Jaegar";
    private static final String character1Description = "The boy who sought Freedom. Eren Jaegar is the main protagonist and antagonist of Attack on Titan. He is the last possessor of the Attack Titan, Warhammer Titan and Founding Titan, fighting for Eldia's freedom.";
    private static final String character1Year = "835";
    private static final String character1Image = "eren_jaegar";
    private static final String character1WebLink = "https://attackontitan.fandom.com/wiki/Eren_Jaeger_(Anime)";

    private static final String character2Name = "Reiner Braun";
    private static final String character2Description = "The Armoured Titan. Marley's Shield. The Solder/Warrior that deserved the best of both worlds.";
    private static final String character2Year = "830";
    private static final String character2Image = "reiner_braun";
    private static final String character2WebLink = "https://attackontitan.fandom.com/wiki/Reiner_Braun";

    private static final String character3Name = "Armin Arlert";
    private static final String character3Description = "The Dreamer and Thinker. The Eldian who killed Eren Jaegar, the Attack Titan.";
    private static final String character3Year = "834";
    private static final String character3Image = "armin";
    private static final String character3WebLink = "https://attackontitan.fandom.com/wiki/Armin_Arlert";

    private static final String character4Name = "Mikasa Ackerman";
    private static final String character4Description = "Strongest member of the 104th Survey Corps, and Eldian savior of humanity.";
    private static final String character4Year = "835";
    private static final String character4Image = "mikasa";
    private static final String character4WebLink = "https://attackontitan.fandom.com/wiki/Mikasa_Ackerman";

    private static final String character5Name = "Floch Forster";
    private static final String character5Description = "The Devil's Assistant. Floch is the second right hand man of Eren Jaegar and the leader to the new Eldian Empire and the Jaegarists";
    private static final String character5Year = "835";
    private static final String character5Image = "floch";
    private static final String character5WebLink = "https://attackontitan.fandom.com/wiki/Floch_Forster";

    public List<MediaModel> createAOTCharacters () {

        // make those movie objects
        MediaModel eren = new MediaModel(character1Name, character1Description, character1Year, character1Image, character1WebLink);
        MediaModel reiner = new MediaModel(character2Name, character2Description, character2Year, character2Image, character2WebLink);
        MediaModel armin = new MediaModel(character3Name, character3Description, character3Year, character3Image, character3WebLink);
        MediaModel mikasa = new MediaModel(character4Name, character4Description, character4Year, character4Image, character4WebLink);
        MediaModel floch = new MediaModel(character5Name, character5Description, character5Year, character5Image, character5WebLink);

        // add EACH movie object to our lists and maps
        addCharacterToList(eren);
        addCharacterToList(reiner);
        addCharacterToList(armin);
        addCharacterToList(mikasa);
        addCharacterToList(floch);

        // no more movies to add?  Okay... return our list
        return AOT;
    }

    private boolean fullList = false;
    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addCharacterToList (MediaModel character) {

        // Bad implementation to avoid repetition but solves for 5 constant names being printed in the view
        if(AOT.size() <= 4) {
            AOT.add(character);
            MM_MAP.put(character.getMediaTitle(), character);
        }
    }
}
