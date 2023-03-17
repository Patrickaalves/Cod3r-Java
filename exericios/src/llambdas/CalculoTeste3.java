package llambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        /*Usando interface funcional do java*/

        //

        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };

        System.out.println("Soma: "+calc.apply(2.0,3.0));

        calc = (x, y) -> x * y;
    }
}
