package classesEmetodos;

public class Produto {
    String nome;
    double preco;
    double desconto;
    static double tomate = 545;

//  Construtores
    Produto(){
    }
    Produto(String nomeInicial){
        nome = nomeInicial;
    }

    Produto(String nomeInical, double precoInicial){
        nome = nomeInical.toUpperCase();
        preco = precoInicial;
    }

    //  Métodos
    public double precoComDesconto(){
        return preco - (preco * desconto);
    }

}
