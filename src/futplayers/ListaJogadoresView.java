package futplayers;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ListaJogadoresView extends JFrame {

    public ListaJogadoresView() {
        setTitle("Lista de Jogadores");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titulo = new JLabel("Jogadores", SwingConstants.CENTER);
        titulo.setBounds(0, 10, 800, 40);
        titulo.setFont(titulo.getFont().deriveFont(20f));
        add(titulo);

        JButton btnNovo = new JButton("Novo Jogador");
        btnNovo.setBounds(30, 60, 150, 35);
        add(btnNovo);

        JTextField txtBusca = new JTextField();
        txtBusca.setBounds(600, 60, 150, 30);
        add(txtBusca);

        DefaultTableModel modelo = new DefaultTableModel(
            new Object[]{"Nome", "Idade", "Posição", "Time"}, 0
        );

        JTable tabela = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabela);
        scroll.setBounds(30, 110, 720, 300);
        add(scroll);

        btnNovo.addActionListener(e -> new CadastroJogadorView().setVisible(true));
    }
}