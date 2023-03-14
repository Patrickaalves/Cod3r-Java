package classesEmetodos;

public class ValorNulo {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!!!"));

//        String s2;
//        System.out.println(s2.concat("!!!!")); /*Não é possivel se não inciar variaveis locais*/

        String s3 = null;
        System.out.println(s3.concat("!!!!")); /*Ira estourar o erro do null pointer exception*/



    }
}
