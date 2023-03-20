package TratamentoDeErros.personalizadaA;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException{

    String nomeDoAtributo;
    NumeroNegativoException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    };

    public String getMessage(){
        return String.format("O atributo "+this.nomeDoAtributo + " Esta negativo");
    };
}
