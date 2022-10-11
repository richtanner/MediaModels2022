package com.cs315.mediamodels2022;

import android.app.Application;
import android.content.Context;

public class myAppContext extends Application {

    private static Context context;

    @Override
    public void onCreate() {

        super.onCreate();
        context = this;
    }

    public static Context getContext(){
        return context;
    }
}
