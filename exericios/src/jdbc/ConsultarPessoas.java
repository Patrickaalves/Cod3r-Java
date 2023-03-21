package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();

        String sql = "select * from pessoas";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList();

        while(resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");

            pessoas.add(new Pessoa(codigo, nome));
        }

        for(Pessoa p:pessoas){
            System.out.println("Nome: "+p.getPessoa());
            System.out.println("Codigo: "+p.getCodigo());
        };

        stmt.close();
        conexao.close();
    }
}
