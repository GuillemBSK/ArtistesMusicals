package com.example.artistesmusicals;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.concerts);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.tigini);
        mediaPlayer.start();
    }

}