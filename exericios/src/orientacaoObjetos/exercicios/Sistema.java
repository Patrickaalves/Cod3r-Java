package orientacaoObjetos.exercicios;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Patrick");

        Compra compra1 = new Compra();
        compra1.addItem("Caneta", 9.68, 100);
        compra1.addItem(new Produto("Notebook", 16985),2);


        Compra compra2 = new Compra();
        compra2.addItem("Lapis", 4, 100);
        compra2.addItem(new Produto("Chiclete", 155.60),40);

        System.out.println(compra2.obterValorTotal());


        cliente.addCompras(compra1);
        cliente.addCompras(compra2);

        cliente.mostrarCarrinho();
        System.out.println(cliente.compras.size());

        /*Cliente 2*/

        Cliente cliente2 = new Cliente("Patrick");

        Compra c1 = new Compra();
        c1.addItem("Caneta", 9.68, 100);

        Compra c2 = new Compra();
        c2.addItem("Lapis", 4, 100);

        System.out.println(c2.obterValorTotal());

        cliente2.addCompras(c1);
        cliente2.addCompras(c2);

        cliente2.mostrarCarrinho();
        System.out.println(cliente2.compras.size());


    }
}
