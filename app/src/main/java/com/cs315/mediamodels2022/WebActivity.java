package com.cs315.mediamodels2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Intent intent = getIntent();
        String message = intent.getStringExtra(ItemDetailFragment.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        WebView webView = findViewById(R.id.WebView);
        webView.loadUrl(message);
    }

}