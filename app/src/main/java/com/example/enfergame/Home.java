package com.example.enfergame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import classes.Controlador;
import classes.Desafio;
import classes.Estagiario;

public class Home extends AppCompatActivity {

    ImageView prontuario;
    Desafio desafio = new Desafio(); // Enviar esse objeto para a proxima Activity

    Estagiario estagiario = new Estagiario();
    Controlador controlador = new Controlador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // Retira a Action Bar
        setContentView(R.layout.activity_home);

        Intent recebendoDados = getIntent();
        Bundle dados = recebendoDados.getExtras();
        estagiario = (Estagiario) dados.getSerializable("estagiario");

        prontuario = findViewById(R.id.btnProntuario);

        controlador.mostrarMensagem(
                "Bem vindo " + estagiario.getNome(),
                "Aperte Ok para inicar o jogo",
                Home.this);

        prontuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreProntuario = new Intent(Home.this, Prontuario.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable("estagiario", estagiario);
                abreProntuario.putExtras(bundle);

                startActivity(abreProntuario);
            }
        });

    }
}
