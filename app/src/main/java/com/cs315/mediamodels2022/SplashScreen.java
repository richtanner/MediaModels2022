package com.cs315.mediamodels2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    Handler mHandler;
    Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mHandler = new Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,ItemDetailHostActivity.class);
                startActivity(intent);
                finish();
            }
        };

        // its trigger runnable after 4000 millisecond.
        mHandler.postDelayed(mRunnable,2000);

    }
}