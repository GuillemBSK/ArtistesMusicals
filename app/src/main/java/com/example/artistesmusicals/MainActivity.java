package com.example.artistesmusicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //CREEM L'OBJECTE PER L'ARXIU .MP3 SENSE VALOR
    public static MediaPlayer mediaPlayer;
    //CREEM EL BOOLEAN QUE ACTIVA O NO EL SO
    private static Boolean soActivat = true;

    //CREEM LA FUNCIO QUE SEGONS EL VALOR DEL BOOLEAN EXECUTARA O NO L'ARXIU .MP3
    public void ActivaSo(Boolean b){
        //ASSIGNEM L'ARXIU .MP3 AL OBJECTE
        mediaPlayer=MediaPlayer.create(this, R.raw.efecteboto);
        //EXECUTEM O NO L'OBJECTE
        if(b){
            mediaPlayer.start();
        }else{
            mediaPlayer.stop();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //FEM VISIBLE EL LAYOUT ACTIVITY_MAIN
        setContentView(R.layout.activity_main);

        //IDENTIFIQUEM EL BOTO DE LOCALITZACIONS, ON ESTARA EL MAPS
        Button btnLocalitatas = (Button) findViewById(R.id.btnLocalitzacions);
        //AL FER CLICK AL BOTO
        btnLocalitatas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //CRIDEM LA FUNCIO DEL SO
                ActivaSo(soActivat);
                //CREEM I EXECUTEM L'INTENT QUE ENS PORTRA AL LAYOUT DEL MAPS
                Intent myIntent = new Intent(v.getContext(), MapsActivity.class);
                startActivity(myIntent);
            }
        });

        //IDENTIFIQUEM EL BOTO DE CONCERTS, ON ESTARA EL LLISTAT DE CONCERTS
        Button btnConcerts = (Button) findViewById(R.id.btnConcerts);
        //AL FER CLICK AL BOTO
        btnConcerts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //CRIDEM LA FUNCIO DEL SO
                ActivaSo(soActivat);
                //CREEM I EXECUTEM L'INTENT QUE ENS PORTRA AL LAYOUT DE CONCERTS
                Intent myIntent2 = new Intent(v.getContext(), Concerts.class);
                startActivity(myIntent2);
            }
        });

        //IDENTIFIQUEM EL BOTO DE PREFEERENCIES, ON ESTARAN LES PREFERENCIES DE L'USUARI
        Button prefeBtn = (Button) findViewById(R.id.btnpeferencies);
        //AL FER CLICK AL BOTO
        prefeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                //CRIDEM LA FUNCIO DEL SO
                ActivaSo(soActivat);
                //CREEM I EXECUTEM L'INTENT QUE ENS PORTRA AL LAYOUT DE PREFERENCIES
                Intent myIntent3 = new Intent(v.getContext(), Preferencies.class);
                startActivity(myIntent3);
            }
        });
    }

    //FEM EL SETTER DE soActivat
    public static void setSoActivat(Boolean b) {
        soActivat = b;
    }

    //FEM EL GETTER DE soActivat
    public static Boolean getSoActivat() {
        return soActivat;
    }
}