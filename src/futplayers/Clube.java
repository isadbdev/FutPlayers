package futplayers;

public class Clube {
    private int id;
    private String nome;
    private Competicao competicao;
    private PresidenteClube presidente;
    private VicePresidente vice;
    private DiretorFutebol diretor;
    private Tecnico tecnico;

    public Clube(int id, String nome, Competicao competicao, PresidenteClube presidente, VicePresidente vice, DiretorFutebol diretor, Tecnico tecnico) {
        this.id = id;
        this.nome = nome;
        this.competicao = competicao;
        this.presidente = presidente;
        this.vice = vice;
        this.diretor = diretor;
        this.tecnico = tecnico;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Competicao getCompeticao() {
        return competicao;
    }

    public PresidenteClube getPresidente() {
        return presidente;
    }

    public VicePresidente getVice() {
        return vice;
    }

    public DiretorFutebol getDiretor() {
        return diretor;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}