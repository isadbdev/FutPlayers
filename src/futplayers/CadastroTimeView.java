package futplayers;

import javax.swing.*;

public class CadastroTimeView extends JFrame {

    public CadastroTimeView() {
        setTitle("Cadastro de Time");
        setSize(450, 450);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titulo = new JLabel("Cadastro de Time", SwingConstants.CENTER);
        titulo.setBounds(0, 10, 450, 40);
        titulo.setFont(titulo.getFont().deriveFont(20f));
        add(titulo);

        // Nome do time
        JLabel lblNome = new JLabel("Nome do Time:");
        lblNome.setBounds(30, 80, 150, 25);
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(160, 80, 220, 25);
        add(txtNome);

        // Cidade
        JLabel lblCidade = new JLabel("Cidade:");
        lblCidade.setBounds(30, 130, 150, 25);
        add(lblCidade);

        JTextField txtCidade = new JTextField();
        txtCidade.setBounds(160, 130, 220, 25);
        add(txtCidade);

        // Ano de Fundação
        JLabel lblAno = new JLabel("Ano Fundação:");
        lblAno.setBounds(30, 180, 150, 25);
        add(lblAno);

        JTextField txtAno = new JTextField();
        txtAno.setBounds(160, 180, 220, 25);
        add(txtAno);

        // Botões
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(110, 300, 100, 35);
        add(btnSalvar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(230, 300, 100, 35);
        add(btnCancelar);

        btnCancelar.addActionListener(e -> dispose());
    }
}