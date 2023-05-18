package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrugaAktywnosc extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga_aktywnosc);



        Button button = findViewById(R.id.buttonAbout); // Zastąp "myButton" swoim id przycisku

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Twój kod do uruchomienia kolejnej aktywności
                Intent intent = new Intent(DrugaAktywnosc.this, AboutAktywnosc.class);
                startActivity(intent);
            }
        });








    }


}