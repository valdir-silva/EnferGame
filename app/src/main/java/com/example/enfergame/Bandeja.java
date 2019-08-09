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
    ImageView lblRemedio, lblRemedio2, lblRemedio3, lblRemedio4, lblRemedio5;
    ImageView lblRemedio6, lblRemedio7, lblRemedio8, lblRemedio9, lblRemedio10;
    ImageView lblRemedioBandeja, lblRemedioBandeja2, lblRemedioBandeja3, lblRemedioBandeja4, lblRemedioBandeja5;
    ImageView lblRemedioBandeja6, lblRemedioBandeja7, lblRemedioBandeja8, lblRemedioBandeja9, lblRemedioBandeja10;
    Controlador controlador = new Controlador();

    boolean op_1, op_2, op_3, op_4, op_5, op_6, op_7, op_8, op_9, op_10; // alternativas escolhidas na bandeja
    boolean op[] = new boolean[10];

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
        lblRemedio5 = findViewById(R.id.lblRemedio5);
        lblRemedio6 = findViewById(R.id.lblRemedio6);
        lblRemedio7 = findViewById(R.id.lblRemedio7);
        lblRemedio8 = findViewById(R.id.lblRemedio8);
        lblRemedio9 = findViewById(R.id.lblRemedio9);
        lblRemedio10 = findViewById(R.id.lblRemedio10);

        lblRemedioBandeja = findViewById(R.id.lblRemedioBandeja);
        lblRemedioBandeja2 = findViewById(R.id.lblRemedioBandeja2);
        lblRemedioBandeja3 = findViewById(R.id.lblRemedioBandeja3);
        lblRemedioBandeja4 = findViewById(R.id.lblRemedioBandeja4);
        lblRemedioBandeja5 = findViewById(R.id.lblRemedioBandeja5);
        lblRemedioBandeja6 = findViewById(R.id.lblRemedioBandeja6);
        lblRemedioBandeja7 = findViewById(R.id.lblRemedioBandeja7);
        lblRemedioBandeja8 = findViewById(R.id.lblRemedioBandeja8);
        lblRemedioBandeja9 = findViewById(R.id.lblRemedioBandeja9);
        lblRemedioBandeja10 = findViewById(R.id.lblRemedioBandeja10);

        lblRemedioBandeja.setVisibility(View.INVISIBLE);
        lblRemedioBandeja2.setVisibility(View.INVISIBLE);
        lblRemedioBandeja3.setVisibility(View.INVISIBLE);
        lblRemedioBandeja4.setVisibility(View.INVISIBLE);
        lblRemedioBandeja5.setVisibility(View.INVISIBLE);
        lblRemedioBandeja6.setVisibility(View.INVISIBLE);
        lblRemedioBandeja7.setVisibility(View.INVISIBLE);
        lblRemedioBandeja8.setVisibility(View.INVISIBLE);
        lblRemedioBandeja9.setVisibility(View.INVISIBLE);
        lblRemedioBandeja10.setVisibility(View.INVISIBLE);

        organizaFront();

        lblRemedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio.setVisibility(View.INVISIBLE);
                lblRemedioBandeja.setVisibility(View.VISIBLE);
                op_1 = true;
                op[0] = true;
            }
        });

        lblRemedio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio2.setVisibility(View.INVISIBLE);
                lblRemedioBandeja2.setVisibility(View.VISIBLE);
                op_2 = true;
                op[1] = true;
            }
        });

        lblRemedio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio3.setVisibility(View.INVISIBLE);
                lblRemedioBandeja3.setVisibility(View.VISIBLE);
                op_3 = true;
                op[2] = true;
            }
        });

        lblRemedio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio4.setVisibility(View.INVISIBLE);
                lblRemedioBandeja4.setVisibility(View.VISIBLE);
                op_4 = true;
                op[3] = true;
            }
        });

        lblRemedio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio5.setVisibility(View.INVISIBLE);
                lblRemedioBandeja5.setVisibility(View.VISIBLE);
                op_5 = true;
                op[4] = true;
            }
        });

        lblRemedio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio6.setVisibility(View.INVISIBLE);
                lblRemedioBandeja6.setVisibility(View.VISIBLE);
                op_6 = true;
                op[5] = true;
            }
        });

        lblRemedio7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio7.setVisibility(View.INVISIBLE);
                lblRemedioBandeja7.setVisibility(View.VISIBLE);
                op_7 = true;
                op[6] = true;
            }
        });

        lblRemedio8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio8.setVisibility(View.INVISIBLE);
                lblRemedioBandeja8.setVisibility(View.VISIBLE);
                op_8 = true;
                op[7] = true;
            }
        });

        lblRemedio9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio9.setVisibility(View.INVISIBLE);
                lblRemedioBandeja9.setVisibility(View.VISIBLE);
                op_9 = true;
                op[8] = true;
            }
        });

        lblRemedio10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedio10.setVisibility(View.INVISIBLE);
                lblRemedioBandeja10.setVisibility(View.VISIBLE);
                op_10 = true;
                op[9] = true;
            }
        });

        lblRemedioBandeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja.setVisibility(View.INVISIBLE);
                lblRemedio.setVisibility(View.VISIBLE);
                op_1 = false;
                op[0] = false;
            }
        });

        lblRemedioBandeja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja2.setVisibility(View.INVISIBLE);
                lblRemedio2.setVisibility(View.VISIBLE);
                op_2 = false;
                op[1] = false;
            }
        });

        lblRemedioBandeja3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja3.setVisibility(View.INVISIBLE);
                lblRemedio3.setVisibility(View.VISIBLE);
                op_3 = false;
                op[2] = false;
            }
        });

        lblRemedioBandeja4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja4.setVisibility(View.INVISIBLE);
                lblRemedio4.setVisibility(View.VISIBLE);
                op_4 = false;
                op[3] = false;
            }
        });

        lblRemedioBandeja5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja5.setVisibility(View.INVISIBLE);
                lblRemedio5.setVisibility(View.VISIBLE);
                op_5 = false;
                op[4] = false;
            }
        });

        lblRemedioBandeja6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja6.setVisibility(View.INVISIBLE);
                lblRemedio6.setVisibility(View.VISIBLE);
                op_6 = false;
                op[5] = false;
            }
        });

        lblRemedioBandeja7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja7.setVisibility(View.INVISIBLE);
                lblRemedio7.setVisibility(View.VISIBLE);
                op_7 = false;
                op[6] = false;
            }
        });

        lblRemedioBandeja8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja8.setVisibility(View.INVISIBLE);
                lblRemedio8.setVisibility(View.VISIBLE);
                op_8 = false;
                op[7] = false;
            }
        });

        lblRemedioBandeja9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja9.setVisibility(View.INVISIBLE);
                lblRemedio9.setVisibility(View.VISIBLE);
                op_9 = false;
                op[8] = false;
            }
        });

        lblRemedioBandeja10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblRemedioBandeja10.setVisibility(View.INVISIBLE);
                lblRemedio10.setVisibility(View.VISIBLE);
                op_10 = false;
                op[9] = false;
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
                                if (java.util.Arrays.equals(op, estagiario.getFase().get(estagiario.getFaseNumero()).getOpcao())){ // Melhorar força de validação
                                    controlador.mostrarMensagem(
                                            "Parabéns " + estagiario.getNome() + "!!!",
                                            "Você colocou os itens corretos na bandeja",
                                            Bandeja.this);
                                            acertouResposta();
                                } else
                                {
                                    controlador.mostrarMensagem(
                                            "Tente novamente.",
                                            "Um ou mais itens estão incorretos",
                                            Bandeja.this);
                                    estagiario.setLife(estagiario.getLife()-1);
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

    public void acertouResposta(){

        estagiario.setFaseNumero(estagiario.getFaseNumero()+1);
    }

    public void organizaFront(){
        lblRemedio.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(0));
        lblRemedio2.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(1));
        lblRemedio3.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(2));
        lblRemedio4.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(3));
        lblRemedio5.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(4));
        lblRemedio6.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(5));
        lblRemedio7.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(6));
        lblRemedio8.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(7));
        lblRemedio9.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(8));
        lblRemedio10.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(9));

        lblRemedioBandeja.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(0));
        lblRemedioBandeja2.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(1));
        lblRemedioBandeja3.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(2));
        lblRemedioBandeja4.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(3));
        lblRemedioBandeja5.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(4));
        lblRemedioBandeja6.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(5));
        lblRemedioBandeja7.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(6));
        lblRemedioBandeja8.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(7));
        lblRemedioBandeja9.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(8));
        lblRemedioBandeja10.setImageResource(estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(9));
    }
}
