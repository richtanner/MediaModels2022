package com.cs315.mediamodels2022;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AlexB_WebView_Activity extends Activity {

    private WebSettings webSettings;
    String url;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alexb_webview);

        // Gets the webview element
        WebView webView = findViewById(R.id.alexb_webview);

        // Get settings
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Get the url from the intent that started this activity
        Intent intent = getIntent();
        url = intent.getStringExtra(ItemDetailFragment.URL);

        // Instance a new web client with progress bar
        webView.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                findViewById(R.id.alexb_webview_progressbar).setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                findViewById(R.id.alexb_webview_progressbar).setVisibility(View.GONE);
                webView.setVisibility(View.VISIBLE);
            }
        });

        webView.loadUrl(url);
    }

}
