package orientacaoObjetos.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();

        compra1.cliente="Patrick";
        compra1.itens.add(new Item("Canetas", 20, 158.00));
        compra1.itens.add(new Item("Borracha", 7, 1.00));
        compra1.itens.add(new Item("Lapis", 4, 15.00));

        Compra compra2 = new Compra();

        compra2.itens.add(new Item("Canetas", 20, 158.00));
        compra2.itens.add(new Item("Borracha", 7, 1.00));
        compra2.itens.add(new Item("Lapis", 4, 15.00));
        compra2.itens.add(new Item("Canetas", 20, 158.00));
        compra2.itens.add(new Item("Borracha", 7, 1.00));
        compra2.itens.add(new Item("Lapis", 4, 15.00));
        compra2.itens.add(new Item("Canetas", 20, 158.00));
        compra2.itens.add(new Item("Borracha", 7, 1.00));
        compra2.itens.add(new Item("Lapis", 4, 15.00));
        compra2.itens.add(new Item("Canetas", 20, 158.00));
        compra2.itens.add(new Item("Borracha", 7, 1.00));
        compra2.itens.add(new Item("Lapis", 4, 15.00));


        compra1.mostrarCarrinhoDeCompras();
        compra2.mostrarCarrinhoDeCompras();




    }
}
