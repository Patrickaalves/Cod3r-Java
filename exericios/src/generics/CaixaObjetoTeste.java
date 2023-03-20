package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); // double -> Double

        Integer coisa = (Integer) caixaA.abrir(); // cast perigoso de fazer

        Double coisa2 = (Double) caixaA.abrir(); // cast perigoso de fazer

        System.out.println(coisa);
        System.out.println(coisa2);

        // Não é muito bom ficar fazendo conversão


    }
}
