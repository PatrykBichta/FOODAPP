package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DrugaAktywnosc extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga_aktywnosc);



        Button button = findViewById(R.id.buttonAbout);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DrugaAktywnosc.this, AboutAktywnosc.class);
                startActivity(intent);
            }
        });














        ImageView imageView = findViewById(R.id.imageView5);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DrugaAktywnosc.this, LogowanieAktywnosc.class);
                startActivity(intent);
            }
        });








        ImageView imageView2 = findViewById(R.id.imageView7);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DrugaAktywnosc.this, RestauracjaJeden.class);
                startActivity(intent);
            }
        });





        ImageView imageView3 = findViewById(R.id.imageView8);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DrugaAktywnosc.this, RestauracjaDwa.class);
                startActivity(intent);
            }
        });











    }


}