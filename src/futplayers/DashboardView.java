package futplayers;

import javax.swing.*;

public class DashboardView extends JFrame {

    public DashboardView() {

        setTitle("FutPlayers - Dashboard");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // MENU LATERAL
        JPanel menu = new JPanel();
        menu.setLayout(null);
        menu.setBounds(0, 0, 200, 600);
        add(menu);

        JButton btnJogadores = new JButton("Jogadores");
        btnJogadores.setBounds(20, 80, 160, 40);
        menu.add(btnJogadores);

        JButton btnTimes = new JButton("Times");
        btnTimes.setBounds(20, 140, 160, 40);
        menu.add(btnTimes);

        JButton btnEstat = new JButton("Estatísticas");
        btnEstat.setBounds(20, 200, 160, 40);
        menu.add(btnEstat);

        // ÁREA PRINCIPAL
        JLabel titulo = new JLabel("Dashboard", SwingConstants.CENTER);
        titulo.setBounds(200, 0, 700, 80);
        titulo.setFont(titulo.getFont().deriveFont(22f));
        add(titulo);

        // Ações dos botões
        btnJogadores.addActionListener(e -> {
            new ListaJogadoresView().setVisible(true);
        });

        btnTimes.addActionListener(e -> {
            new CadastroTimeView().setVisible(true);
        });

        btnEstat.addActionListener(e -> {
            new EstatisticasView().setVisible(true);
        });
    }
}