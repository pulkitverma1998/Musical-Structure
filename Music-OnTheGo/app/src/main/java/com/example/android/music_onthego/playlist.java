package com.example.android.music_onthego;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class playlist extends AppCompatActivity {

    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Shows "Rewind" Toast message
        ImageView rewind = (ImageView) findViewById(R.id.rewind);

        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast rewind = Toast.makeText(playlist.this, "Rewind", Toast.LENGTH_SHORT);
                rewind.show();
            }
        });

        // Shows "Forward" Toast message
        ImageView forward = (ImageView) findViewById(R.id.forward);

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast forward = Toast.makeText(playlist.this, "Forward", Toast.LENGTH_SHORT);
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
