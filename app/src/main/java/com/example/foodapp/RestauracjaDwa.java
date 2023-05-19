package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestauracjaDwa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restauracja_dwa);


        ////////////////////KOD KOSZYKA











        //////////////////////PRZYCISK WROC
        Button button = findViewById(R.id.buttonWROC3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RestauracjaDwa.this, DrugaAktywnosc.class);
                startActivity(intent);
            }
        });
    }
}