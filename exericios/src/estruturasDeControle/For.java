package estruturasDeControle;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        // gerador de tabuada

        Scanner entrada = new Scanner(System.in);

        System.out.println("Diga qual tabuada você quer ver: ");
        int valor = entrada.nextInt();

        for (int cont = 1; cont < 11; cont++ ){
            System.out.println(valor + "x" + cont + "=" + (valor * cont));
        }

    }
}
