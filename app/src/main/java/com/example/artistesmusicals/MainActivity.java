package com.example.artistesmusicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnLocalitatas = (Button) findViewById(R.id.btnLocalitzacions);
        btnLocalitatas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent (v.getContext(), MapsActivity.class);
                startActivity(myIntent);
            }
        });

        Button btnConcerts = (Button) findViewById(R.id.btnConcerts);
        btnConcerts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent2 = new Intent (v.getContext(), Concerts.class);
                startActivity(myIntent2);
            }
        });
    }

    /*public void btnViewResoltes(View v){
        Intent intent = new Intent(MainActivity.this, LlistaIncidenciesResoltes.class);
        startActivity(intent);
    }*/

}