package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("Bmw ","Audi ","Honda ");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println("\n");

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();

        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

        UnaryOperator<String> grito = n -> n + "!!!";

        marcas.stream()
                .map(primeiraLetra)
                .map(grito)
                .forEach(print);

        System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("bmw"));


    }
}
