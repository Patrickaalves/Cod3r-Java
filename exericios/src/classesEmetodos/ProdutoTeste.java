package classesEmetodos;

public class ProdutoTeste {
    public static void main(String[] args) {

//      Instanciando minha classe criada
        Produto p1 = new Produto("notebook");

//        p1.nome = "Bolacha";
        p1.desconto = 0.15;
        p1.preco = 25.60;

        Produto p2 = new Produto("Lapis");

//        p2.nome = "Lapis";
        p2.desconto = 0.25;
        p2.preco = 1.90;

        System.out.println(p2.nome);
        System.out.println(p1.nome);

        System.out.println("O preço do produto com o valor ja descontado fica = "+p2.precoComDesconto());
        System.out.println("O preço do produto com o valor ja descontado fica = "+p1.precoComDesconto());

        Produto p3 = new Produto("Patrick", 25.4);

        System.out.println(p3.nome);



        Produto p4 = new Produto();
        p4.tomate = 465.5;
        System.out.println(p4.nome);

        System.out.println(Produto.tomate);
    }
}
