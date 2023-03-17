package orientacaoObjetos.heranca.desafio;

public class Carro {
    int velocidade;

    boolean acelerar(){
        this.velocidade += 10;
        return true;
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
