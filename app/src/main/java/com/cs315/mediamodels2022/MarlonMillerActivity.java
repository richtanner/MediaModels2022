package com.cs315.mediamodels2022;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import android.os.Bundle;

public class MarlonMillerActivity extends AppCompatActivity {

    private WebSettings webSettings;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marlon_miller);

        Intent intent = getIntent();
        String link = intent.getStringExtra(ItemDetailFragment.URL);

        WebView webView = findViewById(R.id.marlon_miller_webview);
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl(link);
    }
}