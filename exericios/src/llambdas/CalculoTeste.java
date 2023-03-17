package llambdas;

public class CalculoTeste {
    public static void main(String[] args) {
        Calculo calculo = new Soma();
        System.out.println("Soma: "+calculo.executar(5,5));

        calculo = new Multiplicar();
        System.out.println("Multiplicacao: "+calculo.executar(5,5));
    }
}
