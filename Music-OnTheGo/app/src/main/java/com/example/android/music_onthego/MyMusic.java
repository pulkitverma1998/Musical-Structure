package com.example.android.music_onthego;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MyMusic extends AppCompatActivity {

    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        ImageView delete = (ImageView) findViewById(R.id.delete);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent delete = new Intent(MyMusic.this, MainActivity.class);
                startActivity(delete);
            }
        });

        ImageView addSongToPlaylist = (ImageView) findViewById(R.id.plus);

        addSongToPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast plus = Toast.makeText(MyMusic.this, "Song added to Playlist", Toast.LENGTH_SHORT);
                plus.show();
            }
        });

        ImageView rewind = (ImageView) findViewById(R.id.rewind);

        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast rewind = Toast.makeText(MyMusic.this, "Rewind", Toast.LENGTH_SHORT);
                rewind.show();
            }
        });

        ImageView forward = (ImageView) findViewById(R.id.forward);

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast forward = Toast.makeText(MyMusic.this, "Forward", Toast.LENGTH_SHORT);
                forward.show();
            }
        });

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
