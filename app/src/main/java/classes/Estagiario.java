package classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Estagiario implements Serializable {

    private int id;
    private String nome;
    private int life;
    private List<Desafio> fase = new ArrayList<Desafio>();

    public Estagiario() {
        this.setLife(3);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public List<Desafio> getFase() {
        return fase;
    }

    public void setFase(List<Desafio> fase) {
        this.fase = fase;
    }
}
