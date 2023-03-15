package arrayCollections.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Bia"); /*Retorna falso caso não consiga add*/
        fila.offer("mario");
        fila.offer("Michele");
        fila.offer("pai");
        fila.offer("mae");

        System.out.println(fila.peek());
        System.out.println(fila.element());

        fila.size();
        fila.isEmpty();
        fila.clear();

        System.out.println(fila.poll()); /*Retorna o primeiro elemento da fila ja removendo*/
    }
}
