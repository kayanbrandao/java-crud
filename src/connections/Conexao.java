package connections;

import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConnection(); 
        System.out.println("Success!");
        conexao.close();
    }
}
