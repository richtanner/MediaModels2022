package com.cs315.mediamodels2022;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.webkit.WebView;

public class WebThing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_thing);

        String url = "";

        WebView webby = (WebView) findViewById(R.id.webView);
        webby.getSettings().setJavaScriptEnabled(true);
        webby.loadUrl(url);
    }
}