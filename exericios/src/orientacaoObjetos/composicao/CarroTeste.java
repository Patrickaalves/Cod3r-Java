package orientacaoObjetos.composicao;

public class CarroTeste {
    public static void main(String[] args) {

        /*
        System.out.println("Carro c1: "+  );
        System.out.println("Carro c2: "+  );
        * */

        Carro c1 = new Carro();
        Carro c2 = new Carro();

        System.out.println();
        System.out.println("Carro c1: "+c1.estaLigado());
        System.out.println("Carro c2: "+c2.estaLigado());

        c1.ligar();

        System.out.println();
        System.out.println("Carro c1: "+c1.estaLigado());
        System.out.println("Carro c2: "+c2.estaLigado());

        System.out.println();
        System.out.println("Carro c1: "+c1.motor.giros());
        System.out.println("Carro c2: "+c2.motor.giros());

        c1.acelearar();
        c1.acelearar();
        c1.acelearar();
        c1.acelearar();

        System.out.println("Carro c1: "+c1.motor.giros());
        System.out.println("Carro c2: "+c2.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();


        System.out.println("Carro c1: "+c1.motor.giros());
        System.out.println("Carro c2: "+c2.motor.giros());

        System.out.println(c1.fatorInjecao());
        System.out.println(c2.fatorInjecao());
    }
}
