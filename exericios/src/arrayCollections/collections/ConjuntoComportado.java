package arrayCollections.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        /*Quando eu faço isso eu digo que obrigatoriamente minha lista só pode ser do tipo String*/

        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");

        for(String candidato: lista){
            System.out.println(candidato);
        }

    }
}
