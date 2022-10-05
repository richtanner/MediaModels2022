package com.cs315.mediamodels2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView web = (WebView) findViewById(R.id.WebView);
        web.getSettings().setJavaScriptEnabled(true);

        Bundle bundle = getIntent().getExtras();
        String url = bundle.getString("url");
        web.loadUrl(url);
    }
}