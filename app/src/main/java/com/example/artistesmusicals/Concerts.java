package com.example.artistesmusicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Concerts extends AppCompatActivity{
    //CREEM L'OBJECTE BUIT PER LA MUSICA DE FONS
    public static MediaPlayer mediaPlayer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //FEM VISIBLE EL LAYOUT DE CONCERTS
        setContentView(R.layout.concerts);

        //OMPLIM L'OBJECTE DE LA MUSICA DE FONS AMB UN ARXIU .MP3
        mediaPlayer2 = MediaPlayer.create(this, R.raw.tigini);
        //MIREM SI L'USUARI VOL MUSICA DE FONS O NO
        if(MainActivity.getSoActivat() == false){
            //SI NO EN VOL PAREM LA MUSICA
            mediaPlayer2.stop();
        }else{
            //SI EN VOL, EXECUTEM L'ARXIU .MP3
            mediaPlayer2.start();
        }

        //IDENTIFIQUEM EL BOTO DE TIRAR ENRADERA
        Button btnEnrere = findViewById(R.id.btnEnrere);
        //QUAN FEM CLICK AL BOTO DE TIRAR ENRADERA ES PARA LA MUSICA
        btnEnrere.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mediaPlayer2.stop();
                finish();
            }
        });

        //IDENTIFIQUEM EL 1 BOTO PER COMPRAR ENTRADA
        Button btnLink1 = (Button) findViewById(R.id.link1);
        //QUAN FEM CLICK SOBRE ELL S'OBRE L'ENLLAÇ
        btnLink1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //AFEGIM EL LINK
                Uri uri = Uri.parse("https://www.ticketmaster.es/artist/david-guetta-entradas/247763");
                //CREEM I EXECUTEM L'INTENT
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                v.getContext().startActivity(intent);
            }
        });
        //IDENTIFIQUEM EL 2 BOTO PER COMPRAR ENTRADA
        Button btnLink2 = (Button) findViewById(R.id.link2);
        //QUAN FEM CLICK SOBRE ELL S'OBRE L'ENLLAÇ
        btnLink2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //AFEGIM EL LINK
                Uri uri = Uri.parse("https://www.ticketmaster.es/artist/david-guetta-entradas/247763");
                //CREEM I EXECUTEM L'INTENT
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                v.getContext().startActivity(intent);
            }
        });

        //IDENTIFIQUEM EL 3 BOTO PER COMPRAR ENTRADA
        Button btnLink3 = (Button) findViewById(R.id.link3);
        //QUAN FEM CLICK SOBRE ELL S'OBRE L'ENLLAÇ
        btnLink3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //AFEGIM EL LINK
                Uri uri = Uri.parse("https://www.ticketmaster.es/artist/david-guetta-entradas/247763");
                //CREEM I EXECUTEM L'INTENT
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                v.getContext().startActivity(intent);
            }
        });

        //IDENTIFIQUEM EL 4 BOTO PER COMPRAR ENTRADA
        Button btnLink4 = (Button) findViewById(R.id.link4);
        //QUAN FEM CLICK SOBRE ELL S'OBRE L'ENLLAÇ
        btnLink4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //AFEGIM EL LINK
                Uri uri = Uri.parse("https://www.ticketmaster.es/artist/david-guetta-entradas/247763");
                //CREEM I EXECUTEM L'INTENT
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                v.getContext().startActivity(intent);
            }
        });

        //IDENTIFIQUEM EL 5 BOTO PER COMPRAR ENTRADA
        Button btnLink5 = (Button) findViewById(R.id.link5);
        //QUAN FEM CLICK SOBRE ELL S'OBRE L'ENLLAÇ
        btnLink5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //AFEGIM EL LINK
                Uri uri = Uri.parse("https://www.ticketmaster.es/artist/david-guetta-entradas/247763");
                //CREEM I EXECUTEM L'INTENT
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                v.getContext().startActivity(intent);
            }
        });
    }

}
