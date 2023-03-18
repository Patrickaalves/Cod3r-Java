package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        Stream<String> langs = Stream.of("Java","Lua","Js\n");
        langs.forEach(print);

        String[] maisLangs = {"python","Lisp","Pearl","Go\n"};
        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);

        Arrays.stream(maisLangs, 1, 3);

        List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlyn\n");
        outrasLangs.stream().forEach(print);

        outrasLangs.parallelStream().forEach(print);


    }
}
