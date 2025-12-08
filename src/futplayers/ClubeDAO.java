import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClubeDAO {

    public void adicionarClube(String nome, String competicao, String presidente, String vice, String diretorFutebol) {
        String sql = "INSERT INTO clubes (nome, competicao, presidente, vice, diretor_futebol) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, competicao);
            stmt.setString(3, presidente);
            stmt.setString(4, vice);
            stmt.setString(5, diretorFutebol);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void buscarClubes() {
        String sql = "SELECT * FROM clubes";
        try (Connection conn = ConnectionFactory.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nome") +
                                   " | Competição: " + rs.getString("competicao") +
                                   " | Presidente: " + rs.getString("presidente") +
                                   " | Vice: " + rs.getString("vice") +
                                   " | Diretor de Futebol: " + rs.getString("diretor_futebol"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removerClube(int id) {
        String sql = "DELETE FROM clubes WHERE id = ?";
        try (Connection conn = ConnectionFactory.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}