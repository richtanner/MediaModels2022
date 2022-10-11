package com.cs315.mediamodels2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class GJB_WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gjb_web);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        WebView web = (WebView) findViewById(R.id.gjb_web);
        web.setVisibility(View.INVISIBLE);
        web.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                TextView text = findViewById(R.id.textt);
                text.setVisibility(View.INVISIBLE);
                web.setVisibility(View.VISIBLE);
            }
        });
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.loadUrl(url);
    }
}