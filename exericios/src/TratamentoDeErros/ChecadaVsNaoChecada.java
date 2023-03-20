package TratamentoDeErros;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try {
            geraErro1();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        }catch (Throwable e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Fim");
    }

    // Não checada/verificada
    static void geraErro1(){
        new RuntimeException("Ocorreu um erro bem legal #01");
        /*Para lançar o erro eu devo colocar o Throw na frente*/

        throw new RuntimeException("Ocorreu um erro bem legal #01");
    }

    //excessão checada
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro bem legal #02");
        /*Para lançar o erro eu devo colocar o Throw na frente*/

    }
}
