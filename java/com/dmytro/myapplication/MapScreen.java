package com.dmytro.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapScreen extends AppCompatActivity {

    WebView map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_screen);
        map = findViewById(R.id.WebView_Map);
        map.setWebChromeClient(new WebChromeClient());
        map.loadUrl("https://www.google.com/maps");
        map.setWebViewClient(new WebViewClient());
        map.getSettings().setJavaScriptEnabled(true);
    }

    public void GoToMainScreen(View v){
        Intent gobacktomain = new Intent(this, MainActivity.class);
        startActivity(gobacktomain);
    }
}