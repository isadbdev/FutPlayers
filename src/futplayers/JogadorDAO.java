import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JogadorDAO {

    public void adicionarJogador(String nome, int idade, double altura, double peso, String nacionalidade, int idClube) {
        String sql = "INSERT INTO jogadores (nome, idade, altura, peso, nacionalidade, id_clube) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setDouble(3, altura);
            stmt.setDouble(4, peso);
            stmt.setString(5, nacionalidade);
            stmt.setInt(6, idClube);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void buscarJogadores() {
        String sql = "SELECT j.id, j.nome, j.idade, j.altura, j.peso, j.nacionalidade, c.nome AS clube " +
                     "FROM jogadores j LEFT JOIN clubes c ON j.id_clube = c.id";
        try (Connection conn = ConnectionFactory.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nome") +
                                   " | Idade: " + rs.getInt("idade") +
                                   " | Altura: " + rs.getDouble("altura") +
                                   " | Peso: " + rs.getDouble("peso") +
                                   " | Nacionalidade: " + rs.getString("nacionalidade") +
                                   " | Clube: " + rs.getString("clube"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removerJogador(int id) {
        String sql = "DELETE FROM jogadores WHERE id = ?";
        try (Connection conn = ConnectionFactory.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}