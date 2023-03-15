package arrayCollections.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno principe");
        livros.push("Parcy jackson");
        livros.push("O hobbit");

        System.out.println(livros.peek());

        livros.poll(); /*Remover livros da pilha*/
        livros.remove();
        livros.pop();

        livros.size();
        livros.clear();
    }
}
