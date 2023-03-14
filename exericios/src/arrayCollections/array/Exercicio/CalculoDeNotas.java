package arrayCollections.array.Exercicio;

import java.util.Scanner;

public class CalculoDeNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor informe a quatidade de notas: ");
        int qtd = entrada.nextInt();

        double[] armazenamentoNota = new double[qtd];

//        Aramazena as notas
        for (int i = 0; i < qtd; i++){
            System.out.println("Informa a "+(i + 1)+"º nota: ");
            double valorNotas = entrada.nextDouble();
            armazenamentoNota[i] = valorNotas;
        }

        System.out.println("---===================---");

        double media = 0;
        for (double nota: armazenamentoNota){
            media += nota;
        }

        System.out.println("A media final: "+media / armazenamentoNota.length);
    }
}
