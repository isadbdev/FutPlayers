package futplayers;

import javax.swing.*;

public class LoginView extends JFrame {

    public LoginView() {
        setTitle("Login - FutPlayers");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(30, 40, 100, 25);
        add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(120, 40, 200, 25);
        add(txtEmail);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(30, 80, 100, 25);
        add(lblSenha);

        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBounds(120, 80, 200, 25);
        add(txtSenha);

        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(150, 140, 100, 35);
        add(btnEntrar);

        btnEntrar.addActionListener(e -> {
            new DashboardView().setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) {
        new LoginView().setVisible(true);
    }
}