package com.example.artistesmusicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayer=MediaPlayer.create(this, R.raw.efecteboto);

        Button btnLocalitatas = (Button) findViewById(R.id.btnLocalitzacions);
        btnLocalitatas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mediaPlayer.start();
                Intent myIntent = new Intent(v.getContext(), MapsActivity.class);
                startActivity(myIntent);
            }
        });

        Button btnConcerts = (Button) findViewById(R.id.btnConcerts);
        btnConcerts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mediaPlayer.start();
                Intent myIntent2 = new Intent(v.getContext(), Concerts.class);
                startActivity(myIntent2);
            }
        });
        Button btnPreferencies = (Button) findViewById(R.id.btnpeferencies);
        btnPreferencies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mediaPlayer.start();
                Intent myIntent3 = new Intent(v.getContext(), Preferencies.class);
                startActivity(myIntent3);
            }
        });
    }
}