package arrayCollections.array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos: ");
        int qtdAlunos = entrada.nextInt();
        System.out.println("Quantas notas: ");
        int qtdNotas = entrada.nextInt();

        int[][] matriz = new int[qtdAlunos][qtdNotas];

//        Aramazena os valores
        double total = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int k = 0; k < matriz[i].length; k++){
                System.out.println("Aluno ["+(i + 1)+"]" + " Nota: "+ "["+(k + 1)+"]: ");
                int resposta = entrada.nextInt();
                matriz[i][k] = resposta;
                total += matriz[i][k];
            }
        }

        System.out.println();
        System.out.println("===------------------------------===");
        System.out.println("Visualização dos dados");
        System.out.println();

//        Mostra os valores
        for (int i = 0; i < matriz.length; i++){
            System.out.println("Aluno: "+ (i+1)+": ");
            System.out.println();
            for (int k = 0; k < matriz[i].length; k++){
                System.out.println("Aluno ["+(i + 1)+"]" + " Nota: "+ "["+(k + 1)+"]: "+matriz[i][k]);
            }
            System.out.println("---================---");
        }

        System.out.println("A média da turma é igual a "+ (total / (qtdAlunos * qtdNotas)) );

        for(int[] nn: matriz){
            System.out.println(Arrays.toString(matriz));
        }

        entrada.close();
    }
}
