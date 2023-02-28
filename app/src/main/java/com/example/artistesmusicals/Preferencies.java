package com.example.artistesmusicals;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

public class Preferencies extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //FEM VISIBLE EL LAYOUT DE PREFERENCIES
        setContentView(R.layout.preferencies);

        //IDENTIFIQUEM ELS DOS CHECKBOX QUE TENIM
        CheckBox sofons= (CheckBox) findViewById(R.id.checkBox);
        CheckBox efectesso= (CheckBox) findViewById(R.id.checkBox2);

        //FEM UN BOOLEAN PER DONAR UN VALOR ALS CHECKBOX
        boolean checked = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("checkBox1", false);

        //AFEGIM EL BOLEAN ALS DOS CHECKBOX
        sofons.setChecked(checked);
        efectesso.setChecked(checked);

        //IDENTIFIQUEM EL BOTO PER GUARDAR LES PREFERENCIES DE L'USUARI
        Button btnGuardaPreferencies = findViewById(R.id.btnGuardaPreferencies);
        //QUAN FEM CLICK AL BOTO GUARDEN LES PREFERENCIES
        btnGuardaPreferencies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                //COMPROVEM L'ESTAT DELS CHECKBOX I LI PASEM EL VALOR AL SEU OBJECTE
                if(sofons.isChecked()==true) {
                    //SI ACTIVA EL CHECKBOX, PASEM EL VALOR FALSE AL OBJECTE I NO SONARA
                    MainActivity.setSoActivat(false);
                }else{
                    //SI NO ACTIVA EL CHECKBOX, PASEM EL VALOR TRUE AL OBJECTE I SONARA
                    MainActivity.setSoActivat(true);
                }
                finish();
            }
        });
    }


}
