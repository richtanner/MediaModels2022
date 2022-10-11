package com.cs315.mediamodels2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebPageActivity extends AppCompatActivity {

    WebView web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_page);
        Intent intent = getIntent();
        String message = intent.getStringExtra(ItemDetailFragment.WEBURL);
        web = (WebView) findViewById(R.id.webView);
        web.loadUrl(message);

    }
}