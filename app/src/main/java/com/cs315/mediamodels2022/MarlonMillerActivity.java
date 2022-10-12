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


        WebView webView = findViewById(R.id.marlon_miller_webview);
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Intent intent = getIntent();
        String link = intent.getStringExtra(ItemDetailFragment.link);

        //webView.loadUrl(link);
//        webView.setWebViewClient(new WebViewClient() {
//
//            @Override
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                super.onPageStarted(view, url, favicon);
//                findViewById(R.id.alexb_webview_progressbar).setVisibility(View.VISIBLE);
//            }
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                super.onPageFinished(view, url);
//                findViewById(R.id.alexb_webview_progressbar).setVisibility(View.GONE);
//                webView.setVisibility(View.VISIBLE);
//            }
//        });
    }
}