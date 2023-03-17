package orientacaoObjetos.heranca.desafio;

public class Ferrari extends Carro{
    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    boolean acelerar() {
        if (this.velocidade + 20 > this.VELOCIDADE_MAXIMA){
            System.out.println("Não é permitido acelearar pois esta na velocidade maxima");
            this.velocidade = this.VELOCIDADE_MAXIMA;
            return false;
        }else {
            this.velocidade += 20;
            return true;
        }
    }

    @Override
    boolean frear() {
        return super.frear();
    }
}
