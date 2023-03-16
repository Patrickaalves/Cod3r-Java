package orientacaoObjetos.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> itens = new ArrayList<>();

    void addItem(Produto p, int quantidade){
        this.itens.add(new Item(p, quantidade));
    }

    void addItem(String nome, double preco, int quantidade){
        this.itens.add(new Item(new Produto(nome, preco), quantidade));
    }

    double obterValorTotal(){
        double total = 0;
        for (Item item:itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
    void vlTotal(){

    }
}
