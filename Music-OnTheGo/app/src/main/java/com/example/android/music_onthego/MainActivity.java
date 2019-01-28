package com.example.android.music_onthego;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Opens Genre
        LinearLayout genre = (LinearLayout) findViewById(R.id.genre);

        genre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genre = new Intent(MainActivity.this, genre.class);
                startActivity(genre);
            }
        });

        // Opens My Music
        LinearLayout myMusic = (LinearLayout) findViewById(R.id.my_music);

        myMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myMusic = new Intent(MainActivity.this, MyMusic.class);
                startActivity(myMusic);
            }
        });

        // Opens My Playlist
        LinearLayout myPlaylist = (LinearLayout) findViewById(R.id.playlist);

        myPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myPlaylist = new Intent(MainActivity.this, playlist.class);
                startActivity(myPlaylist);
            }
        });

        // Opens Album
        LinearLayout album = (LinearLayout) findViewById(R.id.album);

        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent album = new Intent(MainActivity.this, album.class);
                startActivity(album);
            }
        });

        // Shows "Rewind" Toast message
        ImageView rewind = (ImageView) findViewById(R.id.rewind);

        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast rewind = Toast.makeText(MainActivity.this, "Rewind", Toast.LENGTH_SHORT);
                rewind.show();
            }
        });

        // Shows "Forward" Toast message
        ImageView forward = (ImageView) findViewById(R.id.forward);

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast forward = Toast.makeText(MainActivity.this, "Forward", Toast.LENGTH_SHORT);
                forward.show();
            }
        });

        // Play/ Pause dynamic Button
        final Button mPlayButton = (Button) findViewById(R.id.play);

        mPlayButton.setBackgroundResource(R.drawable.play);

        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isPlaying) {
                    mPlayButton.setBackgroundResource(R.drawable.play);
                } else {
                    mPlayButton.setBackgroundResource(R.drawable.pause);
                }

                isPlaying = !isPlaying;

            }
        });


    }


}
