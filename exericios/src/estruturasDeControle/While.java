package estruturasDeControle;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int cont = 0;

        while (cont <= 10){
            System.out.println("Bom dia!");
            cont ++;
        }

        Scanner entrada = new Scanner(System.in);

        String teste = "";

        do{
            System.out.println("Digite algo: ");
            teste = entrada.nextLine();
        }while (!teste.equalsIgnoreCase("teste"));
    }
}
