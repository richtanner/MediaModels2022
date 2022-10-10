package com.cs315.mediamodels2022;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity
{
    Handler mHandler;
    Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mHandler = new Handler(Looper.getMainLooper());
        mRunnable = () ->
        {
            Intent intent = new Intent(Splash.this, ItemDetailHostActivity.class);
            startActivity(intent);
            finish();
        };

        mHandler.postDelayed(mRunnable,4000);
    }
}