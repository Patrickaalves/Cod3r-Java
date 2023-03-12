package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Seu nome é: " + nome);
        System.out.println("E sua idade ?");
        int idade = entrada.nextInt();
        System.out.println("Sua idade é: " + idade);

        entrada.close();
    }
}
