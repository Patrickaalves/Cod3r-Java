package orientacaoObjetos.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(100);
        p1.setIdade(20);

        p1.setIdade(65);
        p1.setIdade(-30);

        System.out.println(p1.getIdade());
    }
}
