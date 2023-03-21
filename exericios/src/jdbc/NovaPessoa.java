package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.print("informe o nome: ");
        String nome = entrada.nextLine();

        Connection conexao = FabricaConexao.getConexao();

        String sql = "INSERT INTO pessoas (nome, codigo) values (?, ?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setInt(2,104);

        stmt.execute();

        System.out.println("Pessoa incluida com sucesso");
        entrada.close();
        stmt.close();
    }
}
