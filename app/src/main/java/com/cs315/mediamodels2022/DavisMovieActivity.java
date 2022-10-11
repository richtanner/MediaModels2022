package com.cs315.mediamodels2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class DavisMovieActivity extends AppCompatActivity {

    Context context = App.getContext();
    Resources res = context.getResources();
    String webURL;
    WebView wbv;
    ProgressBar pgB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_davis_movie);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        webURL = (String) bundle.get("URL");
        wbv = (WebView) findViewById(res.getLayout(R.layout.activity_davis_movie).getIdAttributeResourceValue(R.id.webviewer));
        pgB = findViewById(R.id.progressBar);
        wbv.setWebViewClient(new WebViewClient());
        wbv.getSettings().setJavaScriptEnabled(true);
        wbv.loadUrl(webURL);
    }

    public class WebViewClient extends android.webkit.WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view, url, favicon);
        }
        @Override
        public void onPageFinished(WebView view, String url){
            super.onPageFinished(view, url);
            pgB.setVisibility(View.GONE);
        }
    }


}