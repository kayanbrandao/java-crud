package crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connections.FabricaConexao;
import objects.Pessoa;

public class Read {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConnection();

        String sql = "SELECT * FROM Pessoa;";

        Statement st = conexao.createStatement();
        ResultSet rs = st.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

         while(rs.next()){
            Pessoa ps = new Pessoa();
            ps.setNome(rs.getString("nome"));
            ps.setEmail(rs.getString("email"));
            ps.setIdade(rs.getInt("idade"));
            pessoas.add(ps);
         }

         for (Pessoa pessoa : pessoas) {
             System.out.println(pessoa);
         }
    }
}
