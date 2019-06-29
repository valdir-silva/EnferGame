package com.example.enfergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Prontuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // Retira a Action Bar
        setContentView(R.layout.activity_prontuario);
    }
}
