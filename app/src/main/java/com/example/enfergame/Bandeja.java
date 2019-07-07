package com.example.enfergame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.time.Instant;

import classes.Controlador;
import classes.Estagiario;

public class Bandeja extends AppCompatActivity {

    ImageView btnVoltar, btnConfirmar;
    ImageView lblRemedio, lblRemedio2, lblRemedio3, lblRemedio4;
    ImageView lblRemedioBandeja, lblRemedioBandeja2, lblRemedioBandeja3, lblRemedioBandeja4;
    Controlador controlador = new Controlador();

    boolean op_1, op_2, op_3, op_4; // alternativas escolhidas na bandeja

    Estagiario estagiario = new Estagiario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // Retira a Action Bar
        setContentView(R.layout.activity_bandeja);

        Intent recebendoDados = getIntent();
        Bundle dados = recebendoDados.getExtras();
        estagiario = (Estagiario) dados.getSerializable("estagiario");

        btnVoltar = findViewById(R.id.btnVoltar);
        btnConfirmar = findViewById(R.id.btnConfirmar);

        lblRemedio = findViewById(R.id.lblRemedio);
        lblRemedio2 = findViewById(R.id.lblRemedio2);
        lblRemedio3 = findViewById(R.id.lblRemedio3);
        lblRemedio4 = findViewById(R.id.lblRemedio4);

        lblRemedioBandeja = findViewById(R.id.lblRemedioBandeja);
        lblRemedioBandeja2 = findViewById(R.id.lblRemedioBandeja2);
        lblRemedioBandeja3 = findViewById(R.id.lblRemedioBandeja3);
        lblRemedioBandeja4 = findViewById(R.id.lblRemedioBandeja4);

        lblRemedioBandeja.setVisibility(View.INVISIBLE);
        lblRemedioBandeja2.setVisibility(View.INVISIBLE);
        lblRemedioBandeja3.setVisibility(View.INVISIBLE);
        lblRemedioBandeja4.setVisibility(View.INVISIBLE);

        lblRemedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio.setVisibility(View.INVISIBLE);
                lblRemedioBandeja.setVisibility(View.VISIBLE);
                op_1 = true;
            }
        });

        lblRemedio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio2.setVisibility(View.INVISIBLE);
                lblRemedioBandeja2.setVisibility(View.VISIBLE);
                op_2 = true;
            }
        });

        lblRemedio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio3.setVisibility(View.INVISIBLE);
                lblRemedioBandeja3.setVisibility(View.VISIBLE);
                op_3 = true;
            }
        });

        lblRemedio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio4.setVisibility(View.INVISIBLE);
                lblRemedioBandeja4.setVisibility(View.VISIBLE);
                op_4 = true;
            }
        });

        lblRemedioBandeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja.setVisibility(View.INVISIBLE);
                lblRemedio.setVisibility(View.VISIBLE);
                op_1 = false;
            }
        });

        lblRemedioBandeja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja2.setVisibility(View.INVISIBLE);
                lblRemedio2.setVisibility(View.VISIBLE);
                op_2 = false;
            }
        });

        lblRemedioBandeja3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja3.setVisibility(View.INVISIBLE);
                lblRemedio3.setVisibility(View.VISIBLE);
                op_3 = false;
            }
        });

        lblRemedioBandeja4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja4.setVisibility(View.INVISIBLE);
                lblRemedio4.setVisibility(View.VISIBLE);
                op_4 = false;
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreProntuario = new Intent(Bandeja.this, Prontuario.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable("estagiario", estagiario);
                abreProntuario.putExtras(bundle);

                startActivity(abreProntuario);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            }
        });

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new AlertDialog.Builder(Bandeja.this)
                        .setTitle("Salvar Bandeja")
                        .setMessage("Deseja salvar a Bandeja?")
                        .setPositiveButton("sim", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                //informa se acertou ou não
                                if (op_1 && op_2 && op_3 && !op_4){
                                    controlador.mostrarMensagem(
                                            "Parabéns " + estagiario.getNome() + "!!!",
                                            "Você colocou os itens corretos na bandeja",
                                            Bandeja.this);
                                } else
                                {
                                    controlador.mostrarMensagem(
                                            "Tente novamente.",
                                            "Um ou mais itens estão incorretos",
                                            Bandeja.this);
                                }
                            }
                        })
                        .setNegativeButton("nao", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                //não salva, apenas fecha a mensagem
                                dialog.dismiss();
                            }
                        })
                        .show();
            }
        });

    }
}
