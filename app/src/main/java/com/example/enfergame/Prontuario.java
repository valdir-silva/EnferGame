package com.example.enfergame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import classes.Estagiario;

public class Prontuario extends AppCompatActivity {

    ImageView btnVoltar, btnBandeja, bgFerida;

    TextView txtDescricao;

    TextView txtFase, txtLife;

    Estagiario estagiario = new Estagiario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // Retira a Action Bar
        setContentView(R.layout.activity_prontuario);

        Intent recebendoDados = getIntent();
        Bundle dados = recebendoDados.getExtras();
        estagiario = (Estagiario) dados.getSerializable("estagiario");

        btnVoltar = findViewById(R.id.btnVoltar);
        btnBandeja = findViewById(R.id.btnBandeja);
        txtDescricao = findViewById(R.id.txtDescricao);
        txtFase = findViewById(R.id.txtFase);
        txtLife = findViewById(R.id.txtLife);
        bgFerida = findViewById(R.id.bgFerida);

        organizaFront();

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreHome = new Intent(Prontuario.this, Home.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable("estagiario", estagiario);
                abreHome.putExtras(bundle);

                startActivity(abreHome);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            }
        });

        btnBandeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreBandeja = new Intent(Prontuario.this, Bandeja.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable("estagiario", estagiario);
                abreBandeja.putExtras(bundle);

                startActivity(abreBandeja);
            }
        });
    }

    private void organizaFront(){
        bgFerida.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getImagem());
        txtDescricao.setText(estagiario.getFase().get(estagiario.getFaseNumero()).getDescricao());
        txtFase.setText(Integer.toString(estagiario.getFase().get(estagiario.getFaseNumero()).getNumero()));
        txtLife.setText(Integer.toString(estagiario.getLife()));
    }
}
