package classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Desafio implements Serializable {

    private int numero;
    private List<String> nome_remedio; // Fazer uma classe para remedio com nome e URL
    private String descricao;
    private Integer imagem;
    private List<Integer> remedio = new ArrayList<Integer>();
    private boolean opcao[] = new boolean[10];

    public  Desafio(){
        for(int i=0;i<10;i++)
            this.getOpcao()[i] = false;
    }

    public Desafio(int numero, List<String> nome_remedio, String descricao, Integer imagem, ArrayList<Integer> remedio, boolean opcao[]) {
        this.numero = numero;
        this.nome_remedio = nome_remedio;
        this.descricao = descricao;
        this.imagem = imagem;
        this.remedio = remedio;
        this.opcao = opcao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int fase) {
        this.numero = fase;
    }

    public List<String> getNome_remedio() {
        return nome_remedio;
    }

    public void setNome_remedio(List<String> nome_remedio) {
        this.nome_remedio = nome_remedio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getImagem() {
        return imagem;
    }

    public void setImagem(Integer imagem) {
        this.imagem = imagem;
    }

    public List<Integer> getRemedio() {
        return remedio;
    }

    public void setRemedio(List<Integer> remedio) {
        this.remedio = remedio;
    }

    public boolean[] getOpcao() {
        return opcao;
    }

    public void setOpcao(boolean[] opcao) {
        this.opcao = opcao;
    }
}
