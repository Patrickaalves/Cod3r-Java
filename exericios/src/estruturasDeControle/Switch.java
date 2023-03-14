package estruturasDeControle;

import java.util.Date;

public class Switch {
    public static void main(String[] args) {
        String faixa = "marrom";
        Date teste = new Date();

        System.out.println(teste);

        switch (faixa){
            case "preta":
                System.out.println("Sei o bassei-dai...");
            case "roxa":
                System.out.println("Sei de nada");
            case "amarela":
                System.out.println("Sei o hidam shodan");
                break;
            default:
                System.out.println("Não sei nada :) ");
        }

        System.out.println("fim");
    }
}
