package arrayCollections.collections;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1,"Roberto");
        usuarios.put(2,"Romario");
        usuarios.put(20,"Patrick");
        usuarios.put(4,"Vinicius");
        usuarios.put(5,"Ryan");

        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsKey(500));

        System.out.println(usuarios.get(20)); /*Apartir da chave pega o valor*/

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
            System.out.println("Valores");
            System.out.println(usuarios.get(chave));
        }

        for (Map.Entry<Integer, String> tudo: usuarios.entrySet()){
            System.out.println(tudo);
            System.out.println(tudo.getKey());
            System.out.println(tudo.getValue());
        }
    }
}
