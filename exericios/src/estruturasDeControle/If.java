package estruturasDeControle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a media: ");
        double nota = entrada.nextDouble();

        if(nota > 7){
            System.out.println("Aprovado");
        }else if (nota > 8){
            System.out.println("Parabens");
        }else if (nota > 9){
            System.out.println("Você é um otimo aluno");
        }else {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
