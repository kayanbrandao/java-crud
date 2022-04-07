package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connections.FabricaConexao;

public class Delete {
    public static void main(String[] args) throws SQLException{
        Connection conexao = FabricaConexao.getConnection();

        String sql = "DELETE FROM Pessoa WHERE Cod = ?";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, 2);
        ps.executeUpdate();
        System.out.println("Success!");
        conexao.close();
    }
}
