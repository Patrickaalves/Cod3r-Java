package TratamentoDeErros;

public class Basico {
    public static void main(String[] args) {

        try {
            System.out.println(7 / 0);
        }catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("alouuuuu");


    }
}
