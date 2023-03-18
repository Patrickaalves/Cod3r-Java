package StreamApi.desafioMap;

import StreamApi.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MapDesafio {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1 ,2,3,4,5,6,7,8);

        Consumer<Integer> print = System.out::print;

        UnaryOperator<Integer> binario = n -> Integer.valueOf(Integer.toBinaryString(n));
        UnaryOperator<Integer> a = n -> Integer.parseInt(new StringBuilder(n).reverse().toString());

        UnaryOperator<Integer> espaco =(n) ->{
            String esp = String.valueOf(n);
            String form = esp + " ";
            Integer valorfinal = Integer.parseInt(esp);
            return valorfinal;
        };

        UnaryOperator<Integer> inverterPalavra = (n) -> {
            String palavraNormal = String.valueOf(n);

            String palavraAlterada = new StringBuilder(palavraNormal).reverse().toString();

            Integer palavraFinal = Integer.parseInt(palavraAlterada);

            return palavraFinal;
        };

        nums.stream()
                .map(inverterPalavra)
                .map(binario)
                .forEach(print);

        /*
        * 1. NUmero para string binaria... 6 => "110"
        * 2. Inverter a string... "110" => "011"
        * */
    }
}
