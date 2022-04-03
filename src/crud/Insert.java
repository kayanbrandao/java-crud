package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connections.FabricaConexao;
import objects.Pessoa;

public class Insert {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConnection();
        
        Pessoa p = new Pessoa("Teste03", "teste03@gmail.com", 30);

        String sql = 
        "INSERT INTO Pessoa (nome, email, idade) VALUE"+
        "(?, ?, ?);";
    
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, p.getNome());
        ps.setString(2, p.getEmail());
        ps.setInt(3, p.getIdade());
        ps.execute();
        System.out.println("Sucess!");
        conexao.close();
    }
}
