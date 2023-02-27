package com.example.artistesmusicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Concerts extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.concerts);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.tigini);
        mediaPlayer.start();

        Button btnLink1 = (Button) findViewById(R.id.link1);
        btnLink1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.ticketmaster.es/artist/david-guetta-entradas/247763");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                v.getContext().startActivity(intent);
            }
        });
        Button btnLink2 = (Button) findViewById(R.id.link2);
        btnLink2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.ticketmaster.es/artist/david-guetta-entradas/247763");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                v.getContext().startActivity(intent);
            }
        });

        Button btnLink3 = (Button) findViewById(R.id.link3);
        btnLink3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.ticketmaster.es/artist/david-guetta-entradas/247763");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                v.getContext().startActivity(intent);
            }
        });

        Button btnLink4 = (Button) findViewById(R.id.link4);
        btnLink4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.ticketmaster.es/artist/david-guetta-entradas/247763");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                v.getContext().startActivity(intent);
            }
        });

        Button btnLink5 = (Button) findViewById(R.id.link5);
        btnLink5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.ticketmaster.es/artist/david-guetta-entradas/247763");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                v.getContext().startActivity(intent);
            }
        });
    }

}
