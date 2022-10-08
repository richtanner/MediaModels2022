package com.cs315.mediamodels2022;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AlexB_WebView_Activity extends Activity {

    private WebSettings webSettings;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alexb_webview);

        // Gets the webview element
        WebView webView = findViewById(R.id.alexb_webview);

        // Instance a new web client
        webView.setWebViewClient(new WebViewClient());

        // Get settings
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Intent intent = getIntent();
        url = intent.getStringExtra(ItemDetailFragment.URL);
        webView.loadUrl(url);
    }

    //rivate class MyWebView extends W
}
