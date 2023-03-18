package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Fillter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Patrick", 10);
        Aluno a3 = new Aluno("test1", 8);
        Aluno a4 = new Aluno("tes1", 4);
        Aluno a5 = new Aluno("Teste11", 9);
        Aluno a6 = new Aluno("TTTeste", 2);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> saudacaoAprovado = a -> "Parabens " + a.nome + "! Você foi aprovado(a)";
        Consumer<String> print = System.out::print;

//        alunos.stream()
//                .filter(a -> a.nota > 7)
//                .map(a-> "Parabens " + a.nome + "! Você foi aprovado(a)")
//                .forEach(System.out::println);

        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(print);
    }
}
