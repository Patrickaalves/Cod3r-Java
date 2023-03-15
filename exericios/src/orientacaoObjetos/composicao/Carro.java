package orientacaoObjetos.composicao;

public class Carro {
        Motor motor = new Motor();

        void acelearar(){
            motor.fatorinjecao += 0.4;
        }

        void frear(){
            if (motor.fatorinjecao > 0.5){
                motor.fatorinjecao -= 0.4;
            }else {
                System.out.println("Não é possivel frear");
            }

        }

        void ligar(){
            motor.ligado = true;
        }

        void desligar(){
            motor.ligado = false;
        }

        boolean estaLigado(){
            return motor.ligado;
        }

        double fatorInjecao(){
            return motor.fatorinjecao;
        }

}
