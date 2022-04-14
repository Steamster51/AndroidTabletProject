package com.dmytro.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebsiteScreen extends AppCompatActivity {

    WebView website;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website_screen);
        website = findViewById(R.id.WebView_Website);
        website.setWebChromeClient(new WebChromeClient());
        website.loadUrl("https://www.realtor.ca/?gclid=Cj0KCQjwl7qSBhD-ARIsACvV1X129g_BWKaXGfAXomRQsCfHUZLdTQw_B9Z7SRnEyTXoAsbReavMnlEaAvHhEALw_wcB");
        website.setWebViewClient(new WebViewClient());
        website.getSettings().setJavaScriptEnabled(true);
    }

    public void gotomainscreen(View v){
        Intent gotomain = new Intent(this, MainActivity.class);
        startActivity(gotomain);
    }
}