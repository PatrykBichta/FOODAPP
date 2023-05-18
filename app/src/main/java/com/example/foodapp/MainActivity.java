package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Twój kod do przejścia do drugiej aktywności
                Intent intent = new Intent(MainActivity.this, DrugaAktywnosc.class);
                startActivity(intent);
                finish(); // Opcjonalnie, aby zamknąć pierwszą aktywność po przejściu do drugiej
            }
        }, 3000); // 3000 milisekund = 3 sekundy
    }
}