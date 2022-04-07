package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connections.FabricaConexao;
import objects.Pessoa;

public class Update {
    public static void main(String[] args) throws SQLException{
        Pessoa p = new Pessoa("Kayan", "kayan@gmail.com", 21);
        Connection conexao = FabricaConexao.getConnection();
        String sql = "UPDATE Pessoa SET Nome = (?) WHERE Cod = ?";
        
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, p.getNome());
        ps.setInt(2, 2);
        ps.execute();
        
        System.out.println("Success!");
        conexao.close();
    }
}
