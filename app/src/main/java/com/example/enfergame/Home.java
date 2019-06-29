package com.example.enfergame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    ImageView prontuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // Retira a Action Bar
        setContentView(R.layout.home);

        prontuario = findViewById(R.id.btnProntuario);

        prontuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreProntuario = new Intent(Home.this, Prontuario.class);
                startActivity(abreProntuario);
            }
        });

    }
}
