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
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.tigini);
        mediaPlayer.start();


        Button btnLocalitatas = (Button) findViewById(R.id.btnLocalitzacions);
        btnLocalitatas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent (v.getContext(), MapsActivity.class);
                startActivity(myIntent);
            }
        });
    }
    /*public void btnView(View v){
        Intent intent = new Intent(MainActivity.this, Concerts.class);
        startActivity(intent);
    }

    public void btnViewResoltes(View v){
        Intent intent = new Intent(MainActivity.this, LlistaIncidenciesResoltes.class);
        startActivity(intent);
    }*/

}