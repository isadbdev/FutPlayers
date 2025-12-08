import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TecnicoDAO {

    public void adicionarTecnico(String nome, int idade, int idClube) {
        String sql = "INSERT INTO tecnicos (nome, idade, id_clube) VALUES (?, ?, ?)";
        try (Connection conn = ConnectionFactory.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setInt(3, idClube);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void buscarTecnicos() {
        String sql = "SELECT t.id, t.nome, t.idade, c.nome AS clube FROM tecnicos t LEFT JOIN clubes c ON t.id_clube = c.id";
        try (Connection conn = ConnectionFactory.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nome") +
                                   " | Idade: " + rs.getInt("idade") +
                                   " | Clube: " + rs.getString("clube"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removerTecnico(int id) {
        String sql = "DELETE FROM tecnicos WHERE id = ?";
        try (Connection conn = ConnectionFactory.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}