package futplayers;

public class Prototipo {
    public static void main(String[] args) {

        Tecnico tecnicoFlamengo = new Tecnico(1, "Filipe Luís", 34, null);

        Clube flamengo = new Clube(
                1,
                "Clube de Regatas do Flamengo",
                null,
                null,
                null,
                null,
                tecnicoFlamengo
        );

        tecnicoFlamengo.setClube(flamengo);

        Jogador pedro = new Jogador(
                1,
                "Pedro Guilherme",
                26,
                1.85,
                80,
                "Brasil",
                flamengo
        );

        Repository repo = new Repository();
        repo.addClube(flamengo);
        repo.addJogador(pedro);

        for (Clube c : repo.getClubes()) {
            System.out.println("Clube: " + c.getNome() + " | Técnico: " + c.getTecnico().getNome());
        }

        for (Jogador j : repo.getJogadores()) {
            System.out.println("Jogador: " + j.getNome() + " | Clube: " + j.getClube().getNome());
        }
    }
}