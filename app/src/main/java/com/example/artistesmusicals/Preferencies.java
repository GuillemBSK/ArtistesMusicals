package com.example.artistesmusicals;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class Preferencies extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    CheckBox sofons= (CheckBox) findViewById(R.id.checkBox);
    CheckBox efectesso= (CheckBox) findViewById(R.id.checkBox2);
    
}
