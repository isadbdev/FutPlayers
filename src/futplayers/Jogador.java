package futplayers;

public class Jogador {
    private int id;
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String nacionalidade;
    private Clube clube;

    public Jogador(int id, String nome, int idade, double altura, double peso, String nacionalidade, Clube clube) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
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

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }
}