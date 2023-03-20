package TratamentoDeErros;

import TratamentoDeErros.personalizadaA.NumeroNegativoException;
import TratamentoDeErros.personalizadaA.StringVaziaException;
import TratamentoDeErros.personalizadaA.Validar;

public class TestesValidacoes {
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("",-7);
            Validar.usuario(aluno);
        }catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        }catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finalmente");
            /*Sempre o finnaly sera chamado*/
            /*Tipo fechar a conexão com o banco de dados*/
        }

        System.out.println("Fim");

    }
}
