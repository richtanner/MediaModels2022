package com.cs315.mediamodels2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class WebPage extends AppCompatActivity
{
    private MediaModel mediaItem;
    WebView web;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_page);

        Intent intent = getIntent();

        String webURL = intent.getStringExtra(ItemDetailFragment.webURL);
        String movieTitle = intent.getStringExtra(ItemDetailFragment.movieTitle);

        setTitle(movieTitle);

        progressBar = findViewById(R.id.progressBar);

        web = (WebView) findViewById(R.id.webView);
        web.getSettings().setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient());
        web.loadUrl(webURL);
    }

    public class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon)
        {
            super.onPageStarted(view, url, favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            view.loadUrl(url);
            return true;
        }
        @Override
        public void onPageFinished(WebView view, String url)
        {
            super.onPageFinished(view, url);
            progressBar.setVisibility(View.GONE);
        }
    }
}