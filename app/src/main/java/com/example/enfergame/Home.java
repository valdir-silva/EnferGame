package com.example.enfergame;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import classes.Controlador;
import classes.Desafio;
import classes.Estagiario;

public class Home extends AppCompatActivity {

    ImageView prontuario, texto_apresentacao, texto_leito, texto_seringa, btnCama, btnSeringa;
    TextView txtFase, txtLife;

    Estagiario estagiario = new Estagiario();
    Controlador controlador = new Controlador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // Retira a Action Bar

        if (screenSize() < 720){
            setContentView(R.layout.activity_home_small);
        } else {
            setContentView(R.layout.activity_home);
        }

        Intent recebendoDados = getIntent();
        Bundle dados = recebendoDados.getExtras();
        estagiario = (Estagiario) dados.getSerializable("estagiario");

        prontuario = findViewById(R.id.btnProntuario);
        btnCama = findViewById(R.id.btnCama);
        btnSeringa = findViewById(R.id.btnSeringa);
        texto_apresentacao = findViewById(R.id.texto_apresentacao);
        texto_leito = findViewById(R.id.texto_leito);
        texto_seringa = findViewById(R.id.texto_seringa);

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

        btnCama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apagaBaloes();
                texto_leito.setVisibility(View.VISIBLE);
            }
        });
        btnSeringa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apagaBaloes();
                texto_seringa.setVisibility(View.VISIBLE);
            }
        });
    }

    private void apagaBaloes(){
        texto_leito.setVisibility(View.INVISIBLE);
        texto_seringa.setVisibility(View.INVISIBLE);
        texto_apresentacao.setVisibility(View.INVISIBLE);
    }

    private void organizaFront(){
        txtFase.setText(Integer.toString(estagiario.getFase().get(estagiario.getFaseNumero()).getNumero()));
        txtLife.setText(Integer.toString(estagiario.getLife()));
        texto_leito.setVisibility(View.INVISIBLE);
        texto_seringa.setVisibility(View.INVISIBLE);
        //texto_apresentacao.setVisibility(View.INVISIBLE);
    }

    private List<Desafio> simulaBanco(){
        List<Desafio> desafios = new ArrayList<Desafio>();

            Desafio desafio = new Desafio();
            desafio.setNumero(1);
            desafio.setImagem(R.drawable.escoriacoes);
            desafio.setDescricao("J.E.S,26 anos, EGR, admitido no hospital apresentando lesão escoriativas em MMII e MMSS após cair de bicicleta. Estado consciente, orientado, utilizava capacete.");
            desafio.getNome_remedio().add("Luva Estéril");
            desafio.getRemedio().add(R.drawable.luva_esteril);
            desafio.getNome_remedio().add("Limpeza com soro fisiológico 0,9% ");
            desafio.getRemedio().add(R.drawable.solucao_fisiologica_09pc);
            desafio.getNome_remedio().add("Cobertura com gaze Rayon em bebida com Petrolatum");
            desafio.getRemedio().add(R.drawable.gaze_rayon_com_emulsao_de_petrolatum);
            desafio.getNome_remedio().add("Gaze Esteril");
            desafio.getRemedio().add(R.drawable.gaze_esteril);
            desafio.getNome_remedio().add("Esparadrapo");
            desafio.getRemedio().add(R.drawable.esparadrapo);
            desafio.getRemedio().add(remedioAleatorio());
            desafio.getRemedio().add(remedioAleatorio());
            desafio.getRemedio().add(remedioAleatorio());
            desafio.getRemedio().add(remedioAleatorio());
            desafio.getRemedio().add(remedioAleatorio());
            desafio.getOpcao()[0] = true;
            desafio.getOpcao()[1] = true;
            desafio.getOpcao()[2] = true;
            desafio.getOpcao()[3] = true;
            desafio.getOpcao()[4] = true;
            //usar esse array Opcao para validar respostas

            desafios.add(desafio);
            estagiario.getFase().add(desafio);

            Desafio desafio2 = new Desafio();
            desafio2.setNumero(2);
            desafio2.setImagem(R.drawable.cateter_venoso_central);
            desafio2.setDescricao("J.S,24 anos, com Hd de desidratação severa, não apresenta veias periféricas acessíveis para a realização de punção, foi inserido cateter venoso central em via subclávia direita.\n" +
                    "\n" +
                    "Já está no tempo de trocar o curativo, ele foi realizado há 7 dias. Reúna os materiais e boa sorte.\n");
            desafio.getNome_remedio().add("Luva de Procedimento");
            desafio2.getRemedio().add(R.drawable.luva_de_procedimento);
            desafio.getNome_remedio().add("Luva Estéril");
            desafio2.getRemedio().add(R.drawable.luva_esteril);
            desafio.getNome_remedio().add("Gaze Esteril");
            desafio2.getRemedio().add(R.drawable.gaze_esteril);
            desafio.getNome_remedio().add("Clorexidina alcoólica 0,5%");
            desafio2.getRemedio().add(R.drawable.clorexidina_alcoolica_05pc);
            desafio.getNome_remedio().add("Filme semipermeável");
            desafio2.getRemedio().add(R.drawable.filme_semipermeavel);
            desafio2.getRemedio().add(remedioAleatorio());
            desafio2.getRemedio().add(remedioAleatorio());
            desafio2.getRemedio().add(remedioAleatorio());
            desafio2.getRemedio().add(remedioAleatorio());
            desafio2.getRemedio().add(remedioAleatorio());
            desafio2.getOpcao()[0] = true;
            desafio2.getOpcao()[1] = true;
            desafio2.getOpcao()[2] = true;
            desafio2.getOpcao()[3] = true;
            desafio2.getOpcao()[4] = true;

            desafios.add(desafio2);

            estagiario.getFase().add(desafio2);

        Desafio desafio3 = new Desafio();
        desafio3.setNumero(3);
        desafio3.setImagem(R.drawable.lesao_por_pressao_estagio1);
        desafio3.setDescricao("M.J.O, 72 anos, EGR, acamado portador de HAS, DM, Sequelado de AVE- com hemiparesia e hemiplegia de lado esquerdo, evidencia lesão por pressão estagio II apresentando pele intacta, com coloração cianótica e centro roseo.");
        desafio3.getRemedio().add(remedioAleatorio());
        desafio3.getRemedio().add(remedioAleatorio());
        desafio3.getRemedio().add(remedioAleatorio());
        desafio3.getRemedio().add(remedioAleatorio());
        desafio3.getRemedio().add(remedioAleatorio());
        desafio3.getRemedio().add(remedioAleatorio());
        desafio3.getRemedio().add(remedioAleatorio());
        desafio3.getRemedio().add(remedioAleatorio());
        desafio3.getRemedio().add(remedioAleatorio());
        desafio3.getRemedio().add(remedioAleatorio());
        desafio3.getOpcao()[0] = true;
        desafio3.getOpcao()[1] = true;

        desafios.add(desafio3);

        estagiario.getFase().add(desafio3);

        return desafios;
    }

    Integer remedioAleatorio(){ //Populando lista de remedios e retornando um ramdon (seperar em dois metodos)
        //Implementar entrada de lista com remedios certos para serem ignorados e não retornar um aleatorio repetido

        Integer remedioEscolhido = 0;
        List<Integer> remedios = new ArrayList<Integer>();
        Random gerador = new Random();

        remedios.add(R.drawable.luva_esteril);
        remedios.add(R.drawable.solucao_fisiologica_09pc);
        remedios.add(R.drawable.gaze_rayon_com_emulsao_de_petrolatum);
        remedios.add(R.drawable.gaze_esteril);
        remedios.add(R.drawable.esparadrapo);
        remedios.add(R.drawable.luva_de_procedimento);
        remedios.add(R.drawable.clorexidina_alcoolica_05pc);
        remedios.add(R.drawable.filme_semipermeavel);


        remedioEscolhido = remedios.get(gerador.nextInt(8));

        return remedioEscolhido;
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
}
