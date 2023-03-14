package arrayCollections.array;

import java.util.Arrays;

public class Arrray {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6;

        System.out.println(Arrays.toString(notasAlunoA));

        System.out.println(notasAlunoA[0]);

        double media = 0;
        for (int i = 0; i < notasAlunoA.length; i++){
            System.out.println("As notas do aluno são: " + notasAlunoA[i]);
            media += notasAlunoA[i];
        }

        System.out.println("A media desse aluno é: "+media / notasAlunoA.length);

        /*Formas de mostrar o conteudo do array*/


        double[] notasAlunoB = {6.9, 8.9, 5.5,10}; /*Inicializando direto*/

        for (int i = 0; i < notasAlunoB.length; i++) {
            System.out.println("As notas do aluno são: " + notasAlunoB[i]);
        }

    }

    public static class Usuario {
        String nome;
        String email;

    }
}
