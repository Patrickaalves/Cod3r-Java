package orientacaoObjetos.composicao;

import arrayCollections.collections.Usuario;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void mostrarCarrinhoDeCompras(){
        System.out.println("------=============------");
        System.out.println("   Carrinho de compras");
        System.out.println("------=============------");
        System.out.println();
        System.out.println("Quantidade de produtos: "+itens.size());
        System.out.println();
        for(Item i: itens) {
            System.out.println(
                    "Nome: "+i.nome+" || "+
                    " Quantidade: "+i.quantidade+" || "+
                    "preco: "+i.preco
            );
        }
        System.out.println();
        System.out.println("Valor total das compras: "+obterValorTotal());
        System.out.println();
        System.out.println("======================");
        System.out.println();
    }

    double obterValorTotal(){
        double total = 0;
        for (Item i: itens){
            total += i.preco;
        }
        return total;
    }

}
