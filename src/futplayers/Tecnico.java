package futplayers;

public class Tecnico {
    private int id;
    private String nome;
    private int idade;
    private Clube clube;

    public Tecnico(int id, String nome, int idade, Clube clube) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.clube = clube;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }
}