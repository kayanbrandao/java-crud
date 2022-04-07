package crud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import connections.FabricaConexao;

public class Create {
    public static void main(String[] args) throws SQLException{
        Connection conexao =  FabricaConexao.getConnection();

        String sql =
        "CREATE TABLE Pessoa ("+
        "   cod INTEGER PRIMARY KEY AUTO_INCREMENT,"+
        "   nome VARCHAR(64) NOT NULL,"+
        "   email VARCHAR(64) NOT NULL,"+
        "   idade INTEGER NOT NULL"+
        ");";
    
        Statement st = conexao.createStatement();
        st.execute(sql);
        System.out.println("Success!");
        conexao.close();    
    }
    
}
