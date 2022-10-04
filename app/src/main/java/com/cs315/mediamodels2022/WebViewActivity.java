package com.cs315.mediamodels2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    private WebView webby;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webby = findViewById(R.id.WebView);
        webby.getSettings().setJavaScriptEnabled(true);

        url = String.valueOf(getIntent().getExtras());
    }
}