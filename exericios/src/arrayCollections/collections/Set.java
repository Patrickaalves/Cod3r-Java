package arrayCollections.collections;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); /*Ele faz a conversão direta do wraper do tipo primitivo double -> Double*/
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add("x");

        System.out.println("Tamanho é "+ conjunto.size());

        conjunto.add("Teste");
        conjunto.add("x");
        System.out.println("Tamanho é "+ conjunto.size());

        conjunto.remove("teste");
        conjunto.remove("Teste");

        System.out.println("Tamanho é "+ conjunto.size());

        System.out.println(conjunto.contains("x"));
        System.out.println(conjunto.contains("1"));
        System.out.println(conjunto.contains(true));

    }
}
