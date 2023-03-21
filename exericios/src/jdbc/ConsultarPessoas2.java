package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Passe sua condição: ");
        String resposta = entrada.nextLine();

        String sql = "select * from pessoas p where p.nome like '%"+resposta+"%' ";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);


        while(resultado.next()){
            String nome = resultado.getString("nome");
            System.out.println(nome);
        }

        stmt.close();
        conexao.close();
    }
}
