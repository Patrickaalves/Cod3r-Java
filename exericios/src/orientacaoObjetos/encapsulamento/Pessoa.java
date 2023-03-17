package orientacaoObjetos.encapsulamento;

public class Pessoa {
    private int idade;

    public Pessoa(int idade) {
        setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        String logErro = "";
        boolean estaValido;

        if (idade <= 0){
            estaValido = false;
            logErro = "A idade não pode ser menor que 0";
        } else if (idade > 60) {
            estaValido = false;
            logErro = "A idade não pode ser maior que 60";
        } else {
            estaValido = true;
        }

        if (estaValido){
            this.idade = idade;
        }else{
            System.out.println(logErro);
        }
    }
}
