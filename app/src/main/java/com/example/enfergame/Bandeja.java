package com.example.enfergame;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.ContactsContract;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.chrisbanes.photoview.PhotoView;

import java.time.Instant;

import classes.Controlador;
import classes.Estagiario;

public class Bandeja extends AppCompatActivity {

    ImageView btnVoltar, btnConfirmar, lblCancelar;
    ImageView lblRemedio, lblRemedio2, lblRemedio3, lblRemedio4, lblRemedio5;
    ImageView lblRemedio6, lblRemedio7, lblRemedio8, lblRemedio9, lblRemedio10;
    ImageView lblRemedioZoom, lblConfirmar;
    ImageView lblRemedioBandeja, lblRemedioBandeja2, lblRemedioBandeja3, lblRemedioBandeja4, lblRemedioBandeja5;
    ImageView lblRemedioBandeja6, lblRemedioBandeja7, lblRemedioBandeja8, lblRemedioBandeja9, lblRemedioBandeja10;
    Controlador controlador = new Controlador();

    boolean op[] = new boolean[10];

    Estagiario estagiario = new Estagiario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // Retira a Action Bar

        if (screenSize() < 720){
            setContentView(R.layout.activity_bandeja_small);
        } else {
            setContentView(R.layout.activity_bandeja);
        }

        Intent recebendoDados = getIntent();
        Bundle dados = recebendoDados.getExtras();
        estagiario = (Estagiario) dados.getSerializable("estagiario");

        btnVoltar = findViewById(R.id.btnVoltar);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        lblCancelar = findViewById(R.id.lblCancelar);

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

        lblRemedioZoom = findViewById(R.id.lblRemedioZoom);
        lblConfirmar = findViewById(R.id.lblConfirmar);

        organizaFront();

        lblRemedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomRemedio(1, lblRemedio, lblRemedioBandeja);
            }
        });

        lblRemedio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomRemedio(2, lblRemedio2, lblRemedioBandeja2);
            }
        });

        lblRemedio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomRemedio(3, lblRemedio3, lblRemedioBandeja3);
            }
        });

        lblRemedio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomRemedio(4, lblRemedio4, lblRemedioBandeja4);
            }
        });

        lblRemedio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomRemedio(5, lblRemedio5, lblRemedioBandeja5);
            }
        });

        lblRemedio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomRemedio(6, lblRemedio6, lblRemedioBandeja6);
            }
        });

        lblRemedio7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomRemedio(7, lblRemedio7, lblRemedioBandeja7);
            }
        });

        lblRemedio8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomRemedio(8, lblRemedio8, lblRemedioBandeja8);
            }
        });

        lblRemedio9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomRemedio(9, lblRemedio9, lblRemedioBandeja9);
            }
        });

        lblRemedio10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomRemedio(10, lblRemedio10, lblRemedioBandeja10);
            }
        });

        lblRemedioBandeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removerRemedio(1, lblRemedio, lblRemedioBandeja);
            }
        });

        lblRemedioBandeja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removerRemedio(2, lblRemedio2, lblRemedioBandeja2);
            }
        });

        lblRemedioBandeja3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removerRemedio(3, lblRemedio3, lblRemedioBandeja3);
            }
        });

        lblRemedioBandeja4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removerRemedio(4, lblRemedio4, lblRemedioBandeja4);
            }
        });

        lblRemedioBandeja5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removerRemedio(5, lblRemedio5, lblRemedioBandeja5);
            }
        });

        lblRemedioBandeja6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removerRemedio(6, lblRemedio6, lblRemedioBandeja6);
            }
        });

        lblRemedioBandeja7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removerRemedio(7, lblRemedio7, lblRemedioBandeja7);
            }
        });

        lblRemedioBandeja8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removerRemedio(8, lblRemedio8, lblRemedioBandeja8);
            }
        });

        lblRemedioBandeja9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removerRemedio(9, lblRemedio9, lblRemedioBandeja9);
            }
        });

        lblRemedioBandeja10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removerRemedio(10, lblRemedio10, lblRemedioBandeja10);
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
                                            voltarTela();
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

        lblRemedioZoom.setVisibility(View.INVISIBLE);
        lblConfirmar.setVisibility(View.INVISIBLE);
        lblCancelar.setVisibility(View.INVISIBLE);

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

    public int screenSize (){

        int altura = Resources.getSystem().getDisplayMetrics().heightPixels;
        int largura = Resources.getSystem().getDisplayMetrics().widthPixels;

        if (altura < largura){
            return altura;
        } else {
            return largura;
        }
    }

    public void voltarTela(){
        Intent abreProntuario = new Intent(Bandeja.this, Prontuario.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("estagiario", estagiario);
        abreProntuario.putExtras(bundle);

        startActivity(abreProntuario);
        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
    }

    public void zoomRemedio(final int remedio, final ImageView remedioEscolhido, final ImageView remedioEscolhidoBandeja){
        lblRemedioZoom.setVisibility(View.VISIBLE);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), estagiario.getFase().get(estagiario.getFaseNumero()).getRemedio().get(remedio-1));
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        lblRemedioZoom.setImageDrawable(mDrawable);

        lblConfirmar.setVisibility(View.VISIBLE);
        lblCancelar.setVisibility(View.VISIBLE);

        lblConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionaRemedio(remedio, remedioEscolhido, remedioEscolhidoBandeja);
            }
        });

        lblCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelarAdicionar();
            }
        });
    }

    public void cancelarAdicionar(){
        lblRemedioZoom.setVisibility(View.INVISIBLE);
        lblConfirmar.setVisibility(View.INVISIBLE);
        lblCancelar.setVisibility(View.INVISIBLE);
    }

    public void adicionaRemedio(int remedio, ImageView remedioEscolhido, ImageView remedioEscolhidoBandeja){
        remedioEscolhido.setVisibility(View.INVISIBLE);
        remedioEscolhidoBandeja.setVisibility(View.VISIBLE);
        op[remedio-1] = true;

        lblRemedioZoom.setVisibility(View.INVISIBLE);
        lblConfirmar.setVisibility(View.INVISIBLE);
        lblCancelar.setVisibility(View.INVISIBLE);
    }

    public void removerRemedio(int remedio, ImageView lblRemedioEscolhido, ImageView remedioEscolhidoBandeja){
        remedioEscolhidoBandeja.setVisibility(View.INVISIBLE);
        lblRemedioEscolhido.setVisibility(View.VISIBLE);
        op[remedio-1] = false;
    }
}
