package generics;

public class CaixaIntTeste {
    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt();

        caixaA.guardar(20);

        System.out.println(caixaA.abrir());
    }
}
