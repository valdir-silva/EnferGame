package classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Desafio implements Serializable {

    private int numero;
    private String descricao;
    private String imagem;
    private List<String> remedio = new ArrayList<String>();
    private List<Integer> opcao = new ArrayList<Integer>();

    public  Desafio(){}

    public Desafio(int numero, String descricao, String imagem, ArrayList<String> remedio, ArrayList<Integer> opcao) {
        this.numero = numero;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public List<String> getRemedio() {
        return remedio;
    }

    public void setRemedio(List<String> remedio) {
        this.remedio = remedio;
    }

    public List<Integer> getOpcao() {
        return opcao;
    }

    public void setOpcao(List<Integer> opcao) {
        this.opcao = opcao;
    }
}
