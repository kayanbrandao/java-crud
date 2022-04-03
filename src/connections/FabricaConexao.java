package connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
    public static Connection getConnection() {
        try {
            final String stringDeConexao = "jdbc:mysql://localhost:3306/db_iesf?verfyServerCertificate=false&userSSL=true";
            final String usauario = "root";
            final String senha = "root";
            return DriverManager.getConnection(stringDeConexao, usauario, senha);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
