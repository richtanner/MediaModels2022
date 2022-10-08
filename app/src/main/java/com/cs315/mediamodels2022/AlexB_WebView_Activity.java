package com.cs315.mediamodels2022;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AlexB_WebView_Activity extends Activity {

    MediaModel mediaItem;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alexb_webview);

        WebView webView = findViewById(R.id.alexb_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(mediaItem.getMediaWeblink());
    }

    @Override
    public void onBackPressed() {
        WebView webView = findViewById(R.id.alexb_webview);
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
