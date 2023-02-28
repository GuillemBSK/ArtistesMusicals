package com.example.artistesmusicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static MediaPlayer mediaPlayer;
    private static Boolean soActivat = true;

    public void ActivaSo(Boolean b){
        mediaPlayer=MediaPlayer.create(this, R.raw.efecteboto);
        if(b){
            mediaPlayer.start();
        }else{
            mediaPlayer.stop();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLocalitatas = (Button) findViewById(R.id.btnLocalitzacions);
        btnLocalitatas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ActivaSo(soActivat);
                Intent myIntent = new Intent(v.getContext(), MapsActivity.class);
                startActivity(myIntent);
            }
        });

        Button btnConcerts = (Button) findViewById(R.id.btnConcerts);
        btnConcerts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ActivaSo(soActivat);
                Intent myIntent2 = new Intent(v.getContext(), Concerts.class);
                startActivity(myIntent2);
            }
        });
        Button prefeBtn = (Button) findViewById(R.id.btnpeferencies);
        prefeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                ActivaSo(soActivat);
                Intent myIntent3 = new Intent(v.getContext(), Preferencies.class);
                startActivity(myIntent3);
            }
        });
    }

    public static void setSoActivat(Boolean b) {
        soActivat = b;
    }

    public static Boolean getSoActivat() {
        return soActivat;
    }
}