package futplayers;

public class Competicao {
    private int id;
    private String nome;
    private Confederacao confederacao;

    public Competicao(int id, String nome, Confederacao confederacao) {
        this.id = id;
        this.nome = nome;
        this.confederacao = confederacao;
    }

    public String getNome() { return nome; }
}