package com.example.enfergame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import classes.Controlador;
import classes.Desafio;
import classes.Estagiario;

public class Home extends AppCompatActivity {

    ImageView prontuario;
    TextView txtFase, txtLife;

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

        txtFase = findViewById(R.id.txtFase);
        txtLife = findViewById(R.id.txtLife);

        estagiario.setFase(simulaBanco());
        organizaFront();

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

    private void organizaFront(){
        txtFase.setText(Integer.toString(estagiario.getFase().get(0).getNumero()));
        txtLife.setText(Integer.toString(estagiario.getLife()));
    }

    private List<Desafio> simulaBanco(){
        List<Desafio> desafios = new ArrayList<Desafio>();

            Desafio desafio = new Desafio();
            desafio.setNumero(1);
            desafio.setImagem("http://teste.com");
            desafio.setDescricao("Teste de descricao sobre o caso");
            desafio.getRemedio().add("http://remedio.com");
            desafio.getRemedio().add("http://remedio2.com");
            desafio.getRemedio().add("http://remedio3.com");
            desafio.getRemedio().add("http://remedio4.com");
            desafio.getRemedio().add("http://remedio5.com");
            desafio.getRemedio().add("http://remedio6.com");
            desafio.getRemedio().add("http://remedio7.com");
            desafio.getRemedio().add("http://remedio8.com");
            desafio.getRemedio().add("http://remedio9.com");
            desafio.getRemedio().add("http://remedio10.com");
            desafio.getOpcao().add(1);
            desafio.getOpcao().add(2);
            desafio.getOpcao().add(3);
            desafio.getOpcao().add(4);

            desafios.add(desafio);
            estagiario.getFase().add(desafio);

        return desafios;
    }
}
