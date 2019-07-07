package classes;

public class Desafio {

    private int fase;
    private String descricao;
    private String imagem;
    private String remedio[];
    private boolean opcao[];

    public  Desafio(){}

    public Desafio(int fase, String descricao, String imagem, String[] remedio, boolean[] opcao) {
        this.fase = fase;
        this.descricao = descricao;
        this.imagem = imagem;
        this.remedio = remedio;
        this.opcao = opcao;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
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

    public String[] getRemedio() {
        return remedio;
    }

    public void setRemedio(String[] remedio) {
        this.remedio = remedio;
    }

    public boolean[] getOpcao() {
        return opcao;
    }

    public void setOpcao(boolean[] opcao) {
        this.opcao = opcao;
    }
}
