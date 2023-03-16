package orientacaoObjetos.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;
    final List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    void mostrarCarrinho(){
        for (Compra compra: compras) {
            for (Item c: compra.itens){
                System.out.println(c.produto.nome);
            }
        }
    }
    void addCompras(Compra compra){
        this.compras.add(compra);
    }

    double obterValorTotal(){
        double total = 0;
        for (Compra compra:compras){
            total += compra.obterValorTotal();
        }
        return total;
    }
}
