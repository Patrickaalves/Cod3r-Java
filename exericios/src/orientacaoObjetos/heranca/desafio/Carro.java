package orientacaoObjetos.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidade;

    public Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    boolean acelerar(){
        if (this.velocidade + 10 > this.VELOCIDADE_MAXIMA){
            System.out.println("Não é permitido acelearar pois esta na velocidade maxima");
            return false;
        }else {
            this.velocidade += 10;
            return true;
        }
    }

    boolean frear(){
        if (this.velocidade - 5 < 0){
            System.out.println("Não é possivel diminuir mais que isso");
            this.velocidade = 0;
        }else {
            this.velocidade -= 5;
        }
        return true;
    }

    int valocidade(){
        return this.velocidade;
    }


}
