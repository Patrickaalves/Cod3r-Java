package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();

        String sql = "create database if not exists cursojava";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Banco criado com sucesso");
        conexao.close();
    }
}
