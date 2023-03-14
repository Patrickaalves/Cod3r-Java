package arrayCollections.collections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Patrick");
        lista.add(u1);

        lista.add(new Usuario("Pai"));
        lista.add(new Usuario("Mãe"));
        lista.add(new Usuario("Bruna"));
        lista.add(new Usuario("Amanda"));

        System.out.println(lista.get(3).nome); /*Acessar pelo indice*/

        lista.remove(1);/*Remover pelo indice*/
        lista.remove(new Usuario("Patrick"));/*Remover pelo objeto*/

        System.out.println(lista.contains(new Usuario("Amanda"))); /*Contem*/

        for(Usuario u: lista) {
            System.out.println(u.toString());
        }


    }
}
