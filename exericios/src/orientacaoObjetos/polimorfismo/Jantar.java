package orientacaoObjetos.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(50);
        System.out.println("O peso da pessoa: "+p1.getPeso());
        System.out.println();

        Arroz ingrediente1 = new Arroz(0.300);
        Feijao ingrediente2 = new Feijao(0.200);
        Sorvete sorbemesa = new Sorvete(0.500);

        p1.comer(ingrediente1);

        System.out.println("O peso da pessoa: "+p1.getPeso());
    }
}

