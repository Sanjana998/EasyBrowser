package com.example.browser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.net.URL;

public class homeActivity extends AppCompatActivity {

    ImageButton insta ,gmail,fb,youtube,link,spot,snap,git;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        gmail = findViewById(R.id.gmail);
        insta = findViewById(R.id.insta);
        fb = findViewById(R.id.fb);
        youtube = findViewById(R.id.youtube);
        link = findViewById(R.id.link);
        spot = findViewById(R.id.spot);
       // snap = findViewById(R.id.snap);
       // git = findViewById(R.id.git);

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/");
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.facebook.com/");
            }
        });
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://mail.google.com/");
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/ashleyhere");
            }
        });
        spot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://open.spotify.com/user/31vnxswtm3xgzuffbwuisl5au7pu?si=KkNNN2RPS8Wvx_txPzKr4w");
            }
        });
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.linkedin.com/");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}