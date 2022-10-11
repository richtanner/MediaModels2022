package com.cs315.mediamodels2022;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    Handler mHandler;
    Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        mHandler = new Handler();
        mRunnable = () -> {
            Intent intent = new Intent(SplashScreen.this,ItemDetailHostActivity.class);
            startActivity(intent);
            finish();
        };

        mHandler.postDelayed(mRunnable,4000);
    }
}
