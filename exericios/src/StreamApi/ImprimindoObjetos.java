package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void separar(){
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();
    }

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "gui", "Luca","Mario");

        for (int i = 0; i < aprovados.size(); i++){
            System.out.println(aprovados.get(i));
        }

        separar();

        for(String nome: aprovados){
            System.out.println(nome);
        }

        separar();

        Iterator<String> it = aprovados.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        separar();

        Stream<String> st = aprovados.stream();

        st.forEach(System.out::println);

        st.forEach(System.out::println);

    }
}
