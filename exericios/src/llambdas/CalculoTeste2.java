package llambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo calc = (x, y) -> {
          return x + y;
        };

        System.out.println("Soma: "+calc.executar(5,5));

        calc = (x, y) -> x * y;
    }
}
