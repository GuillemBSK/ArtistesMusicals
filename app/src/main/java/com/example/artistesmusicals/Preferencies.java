package com.example.artistesmusicals;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

public class Preferencies extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferencies);

    }
    //CheckBox sofons= (CheckBox) findViewById(R.id.checkBox);
    //CheckBox efectesso= (CheckBox) findViewById(R.id.checkBox2);
    public void onCheckedChanged() {
        /**
        if (sofons.isChecked()==true) {
            Concerts.mediaPlayer2.stop();
        }
        if (efectesso.isChecked()==true) {
            MainActivity.mediaPlayer.stop();
        }
         **/
    }
}
