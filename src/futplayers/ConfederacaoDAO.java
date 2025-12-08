import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConfederacaoDAO {

    public void adicionarConfederacao(String nome, String pais, String continente, String presidente) {
        String sql = "INSERT INTO confederacoes (nome, pais, continente, presidente) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, pais);
            stmt.setString(3, continente);
            stmt.setString(4, presidente);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void buscarConfederacoes() {
        String sql = "SELECT * FROM confederacoes";
        try (Connection conn = ConnectionFactory.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nome") +
                                   " | País: " + rs.getString("pais") +
                                   " | Continente: " + rs.getString("continente") +
                                   " | Presidente: " + rs.getString("presidente"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removerConfederacao(int id) {
        String sql = "DELETE FROM confederacoes WHERE id = ?";
        try (Connection conn = ConnectionFactory.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}