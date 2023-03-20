package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        //Caixa caixaA = new Caixa();

        Caixa<String> caixaA = new Caixa();
        caixaA.guardar("");
        System.out.println(caixaA.abrir());

        Caixa<Double> caixaB = new Caixa();
        caixaB.guardar(5.0);
        System.out.println(caixaB.abrir());


    }
}
