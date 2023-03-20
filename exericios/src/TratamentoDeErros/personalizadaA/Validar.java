package TratamentoDeErros.personalizadaA;

import TratamentoDeErros.Aluno;

public class Validar {
    private Validar(){};

    public static void usuario(Aluno aluno){
        if (aluno == null){
            throw new IllegalArgumentException("O aluno não pode ser vazio");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if (aluno.nota < 0){
            throw new NumeroNegativoException("nota");
        }
    };
}
