package com.cs315.mediamodels2022;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class WebPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webpage);

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar2);
        if (progressBar.getVisibility() != View.VISIBLE) {
            progressBar.setVisibility(View.VISIBLE);
        }

        WebView web = (WebView) findViewById(R.id.WebView);
        web.getSettings().setJavaScriptEnabled(true);

        Bundle bundle = getIntent().getExtras();
        String url = bundle.getString("url");
        web.loadUrl(url);

        web.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView view, String url) {
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
    }
}
