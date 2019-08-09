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
        txtFase.setText(Integer.toString(estagiario.getFase().get(estagiario.getFaseNumero()).getNumero()));
        txtLife.setText(Integer.toString(estagiario.getLife()));
    }

    private List<Desafio> simulaBanco(){
        List<Desafio> desafios = new ArrayList<Desafio>();

            Desafio desafio = new Desafio();
            desafio.setNumero(1);
            desafio.setImagem(R.drawable.escoriacoes);
            desafio.setDescricao("J.E.S,26 anos, EGR, admitido no hospital apresentando lesão escoriativas em MMII e MMSS após cair de bicicleta. Estado consciente, orientado, utilizava capacete.");
            desafio.getRemedio().add(R.drawable.luva_esteril);
            desafio.getRemedio().add(R.drawable.solucao_fisiologica_09pc);
            desafio.getRemedio().add(R.drawable.gaze_rayon_com_emulsao_de_petrolatum);
            desafio.getRemedio().add(R.drawable.gaze_esteril);
            desafio.getRemedio().add(R.drawable.remedio);
            desafio.getRemedio().add(R.drawable.remedio);
            desafio.getRemedio().add(R.drawable.remedio);
            desafio.getRemedio().add(R.drawable.remedio);
            desafio.getRemedio().add(R.drawable.remedio);
            desafio.getRemedio().add(R.drawable.remedio);
            desafio.getOpcao()[0] = true;
            desafio.getOpcao()[1] = true;
            desafio.getOpcao()[2] = true;
            desafio.getOpcao()[3] = true;
            //usar esse array Opcao para validar respostas

            desafios.add(desafio);
            estagiario.getFase().add(desafio);

            Desafio desafio2 = new Desafio();
            desafio2.setNumero(2);
            desafio2.setImagem(R.drawable.cateter_venoso_central);
            desafio2.setDescricao("J.S,24 anos, com Hd de desidratação severa, não apresenta veias periféricas acessíveis para a realização de punção, foi inserido cateter venoso central em via subclávia direita.\n" +
                    "\n" +
                    "Já está no tempo de trocar o curativo, ele foi realizado há 7 dias. Reúna os materiais e boa sorte.\n");
            desafio2.getRemedio().add(R.drawable.remedio);
            desafio2.getRemedio().add(R.drawable.acido_graxos_essenciais);
            desafio2.getRemedio().add(R.drawable.remedio);
            desafio2.getRemedio().add(R.drawable.remedio);
            desafio2.getRemedio().add(R.drawable.remedio);
            desafio2.getRemedio().add(R.drawable.remedio);
            desafio2.getRemedio().add(R.drawable.remedio);
            desafio2.getRemedio().add(R.drawable.remedio);
            desafio2.getRemedio().add(R.drawable.remedio);
            desafio2.getRemedio().add(R.drawable.remedio);
            desafio2.getOpcao()[0] = true;
            desafio2.getOpcao()[1] = true;
            desafio2.getOpcao()[2] = true;

            desafios.add(desafio2);

            estagiario.getFase().add(desafio2);

        return desafios;
    }
}
