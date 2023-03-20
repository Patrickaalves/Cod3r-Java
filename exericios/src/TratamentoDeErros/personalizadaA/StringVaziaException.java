package TratamentoDeErros.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{

    String nomeDoAtributo;
    StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    };

    public String getMessage(){
        return String.format("O atributo "+this.nomeDoAtributo + " Esta vazio");
    };
}
