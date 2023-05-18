package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutAktywnosc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_aktywnosc);








        Button button = findViewById(R.id.buttonWROC); // Zastąp "myButton" swoim id przycisku

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Twój kod do uruchomienia kolejnej aktywności
                Intent intent = new Intent(AboutAktywnosc.this, DrugaAktywnosc.class);
                startActivity(intent);
            }
        });













    }
}