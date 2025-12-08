package futplayers;

public class Confederacao {
    private int id;
    private String nome;
    private String pais;
    private String continente;
    private PresidenteConfederacao presidente;

    public Confederacao(int id, String nome, String pais, String continente, PresidenteConfederacao presidente) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.continente = continente;
        this.presidente = presidente;
    }

    public String getNome() { return nome; }
}