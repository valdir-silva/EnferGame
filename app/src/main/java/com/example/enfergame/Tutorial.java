package com.example.enfergame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.Serializable;

import classes.Desafio;
import classes.Estagiario;

public class Tutorial extends AppCompatActivity {

    private EditText editNome;
    private ImageView btnConfirmarNome;

    Estagiario estagiario = new Estagiario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // Retira a Action Bar
        setContentView(R.layout.activity_tutorial);

        editNome = findViewById(R.id.editNome);
        btnConfirmarNome = findViewById(R.id.btnConfirmarNome);

        btnConfirmarNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreHome = new Intent(Tutorial.this, Home.class);

                estagiario.setNome(editNome.getText().toString());
                Bundle bundle = new Bundle();
                bundle.putSerializable("estagiario", estagiario);
                abreHome.putExtras(bundle);

                startActivity(abreHome);
            }
        });
    }
}
