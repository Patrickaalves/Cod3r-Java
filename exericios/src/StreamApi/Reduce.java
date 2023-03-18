package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Reduce {
    public static void main(String[] args) {

        Consumer<Integer> print = System.out::print;

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        nums.stream()
                .reduce(soma);

        nums.stream().reduce(soma).get();

        int total = nums.stream().reduce(soma).get();

        System.out.println(total);

        /*Depois do reduce não consigo encadear mais nenhum metodo*/



    }
}
