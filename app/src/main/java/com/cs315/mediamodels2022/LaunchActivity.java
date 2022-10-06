package com.cs315.mediamodels2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LaunchActivity extends AppCompatActivity {
    Handler mHandler;
    Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        mHandler = new Handler();
        mRunnable = () -> {
            Intent intent = new Intent(LaunchActivity.this,ItemListFragment.class);
            startActivity(intent);
            finish();
        };

        mHandler.postDelayed(mRunnable,4000);
    }
}