package futplayers;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private List<Jogador> jogadores = new ArrayList<>();
    private List<Clube> clubes = new ArrayList<>();

    public void addJogador(Jogador j) {
        jogadores.add(j);
    }

    public void addClube(Clube c) {
        clubes.add(c);
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public List<Clube> getClubes() {
        return clubes;
    }
}