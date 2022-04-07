package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connections.FabricaConexao;
import objects.Pessoa;

public class Insert {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConnection();
        
        Pessoa p = new Pessoa("Teste01", "teste01@gmail.com", 01);

        String sql = 
        "INSERT INTO Pessoa (nome, email, idade) VALUE"+
        "(?, ?, ?);";
    
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, p.getNome());
        ps.setString(2, p.getEmail());
        ps.setInt(3, p.getIdade());
        ps.execute();
        System.out.println("Success!");
        conexao.close();
    }
}
