package classesEmetodos.DesafioModulo;

public class Pessoa {
//  Atributos
    String nomePessoa;
    double pesoPessoa;

//    Construtor

    Pessoa(String nomePessoa, double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

//    Métodos

    public void comer(Comida comida){
        pesoPessoa += comida.pesoComida;
    }
}
