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
        setContentView(R.layout.preferencies);

        CheckBox sofons= (CheckBox) findViewById(R.id.checkBox);
        CheckBox efectesso= (CheckBox) findViewById(R.id.checkBox2);

        boolean checked = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("checkBox1", false);
        sofons.setChecked(checked);
        efectesso.setChecked(checked);

        Button btnGuardaPreferencies = findViewById(R.id.btnGuardaPreferencies);
        btnGuardaPreferencies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(sofons.isChecked()==true) {
                    MainActivity.setSoActivat(false);
                }else{
                    MainActivity.setSoActivat(true);
                }
                finish();
            }
        });
    }


}
