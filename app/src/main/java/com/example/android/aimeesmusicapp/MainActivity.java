package com.example.android.aimeesmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView songDetail = (TextView) findViewById(R.id.Song_Detail);

        songDetail.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the Song Detail View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songDetailIntent = new Intent(MainActivity.this, songDetail.class);
                startActivity(songDetailIntent);
            }
        });

        TextView Library = (TextView) findViewById(R.id.Library);

        Library.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the Library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent LibraryIntent = new Intent(MainActivity.this, library.class);
                startActivity(LibraryIntent);
            }
        });
        TextView Artist = (TextView) findViewById(R.id.Artist);

        Artist.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the Library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ArtistIntent = new Intent(MainActivity.this, artist.class);
                startActivity(ArtistIntent);
            }
        });

    }
}
