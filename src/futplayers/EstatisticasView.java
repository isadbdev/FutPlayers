package futplayers;

import javax.swing.*;

public class EstatisticasView extends JFrame {

    public EstatisticasView() {
        setTitle("Estatísticas e Relatórios");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titulo = new JLabel("Estatísticas e Relatórios", SwingConstants.CENTER);
        titulo.setBounds(0, 10, 900, 40);
        titulo.setFont(titulo.getFont().deriveFont(22f));
        add(titulo);

        // 3 cards de estatísticas
        JPanel card1 = criarCard("Total de Jogadores", "###");
        card1.setBounds(230, 80, 180, 120);
        add(card1);

        JPanel card2 = criarCard("Times Cadastrados", "###");
        card2.setBounds(380 + 80, 80, 180, 120);
        add(card2);

        JPanel card3 = criarCard("Jogadores por Time", "###");
        card3.setBounds(530 + 160, 80, 180, 120);
        add(card3);

        // Simulação de gráfico (painel grande)
        JPanel grafico = new JPanel();
        grafico.setBounds(230, 230, 580, 280);
        grafico.setBorder(BorderFactory.createTitledBorder("Gráfico de Estatísticas"));
        add(grafico);
    }

    private JPanel criarCard(String titulo, String valor) {
        JPanel card = new JPanel();
        card.setLayout(null);
        card.setBorder(BorderFactory.createEtchedBorder());

        JLabel lblTitulo = new JLabel(titulo, SwingConstants.CENTER);
        lblTitulo.setBounds(10, 10, 160, 30);
        card.add(lblTitulo);

        JLabel lblValor = new JLabel(valor, SwingConstants.CENTER);
        lblValor.setBounds(10, 60, 160, 40);
        lblValor.setFont(lblValor.getFont().deriveFont(24f));
        card.add(lblValor);

        return card;
    }
}