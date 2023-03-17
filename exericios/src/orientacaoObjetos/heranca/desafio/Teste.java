package orientacaoObjetos.heranca.desafio;

public class Teste {
    public static void main(String[] args) {
        Carro generico = new Carro(30);

        Ferrari ferrari = new Ferrari(15);

        generico.acelerar();
        generico.acelerar();
        generico.acelerar();

        generico.frear();
        generico.frear();
        generico.frear();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        ferrari.frear();
        ferrari.frear();
        ferrari.frear();


        System.out.println("A velocidade do carro é: "+generico.valocidade());
        System.out.println("A velocidade do carro é: "+ferrari.valocidade());
    }
}
