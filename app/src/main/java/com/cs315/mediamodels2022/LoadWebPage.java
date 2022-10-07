package com.cs315.mediamodels2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class LoadWebPage extends AppCompatActivity {

    boolean redirect = false;
    boolean completeLoaded = true;
    WebView web;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_web_page);
        progressBar = findViewById(R.id.progressBar2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(ItemDetailFragment.WEBURL);
        web = (WebView) findViewById(R.id.webView);

        web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                if(!completeLoaded)
                {
                    redirect = true;
                }
                completeLoaded = false;
                web.loadUrl(url);
                return true;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon)
            {
                super.onPageStarted(view, url, favicon);
                completeLoaded = false;

            }

            @Override
            public void onPageFinished(WebView view, String url)
            {
                super.onPageFinished(view, url);
                if(!redirect)
                {
                    completeLoaded = true;
                }
                if(completeLoaded && !redirect)
                {
                    //Page completely loaded
                    progressBar.setVisibility(View.GONE);
                    web.setVisibility(View.VISIBLE);
                }
                else
                {
                    redirect = false;
                }
            }

        });

        web.loadUrl(message);

    }

}