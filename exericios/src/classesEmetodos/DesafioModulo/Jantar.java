package classesEmetodos.DesafioModulo;
public class Jantar {
    public static void main(String[] args) {
        /*Quando passar o método comida para o método comer
        * pegar o peso da comida e acrescentar ao peso da pessoa */

        Pessoa patrick = new Pessoa("Patrick", 72);
        Comida arroz = new Comida("Arroz", 0.98);

        System.out.println("Sou "+patrick.nomePessoa+"E tenho "+patrick.pesoPessoa+"KG");
        patrick.comer(arroz);

        System.out.println("Após comer fiquei com "+patrick.pesoPessoa+"KG");

    }
}
