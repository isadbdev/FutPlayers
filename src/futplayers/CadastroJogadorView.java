package futplayers;

import javax.swing.*;

public class CadastroJogadorView extends JFrame {

    public CadastroJogadorView() {
        setTitle("Cadastro de Jogador");
        setSize(450, 450);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(30, 40, 120, 25);
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(150, 40, 200, 25);
        add(txtNome);

        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(30, 80, 120, 25);
        add(lblIdade);

        JTextField txtIdade = new JTextField();
        txtIdade.setBounds(150, 80, 200, 25);
        add(txtIdade);

        JLabel lblPos = new JLabel("Posição:");
        lblPos.setBounds(30, 120, 120, 25);
        add(lblPos);

        JTextField txtPos = new JTextField();
        txtPos.setBounds(150, 120, 200, 25);
        add(txtPos);

        JLabel lblTime = new JLabel("Time:");
        lblTime.setBounds(30, 160, 120, 25);
        add(lblTime);

        JTextField txtTime = new JTextField();
        txtTime.setBounds(150, 160, 200, 25);
        add(txtTime);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(100, 300, 100, 35);
        add(btnSalvar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(220, 300, 100, 35);
        add(btnCancelar);

        btnCancelar.addActionListener(e -> dispose());
    }
}