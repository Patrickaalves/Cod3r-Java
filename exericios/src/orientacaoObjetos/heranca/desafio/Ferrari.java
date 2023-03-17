package orientacaoObjetos.heranca.desafio;

public class Ferrari extends Carro{

    @Override
    boolean acelerar() {
        this.velocidade += 20;
        return true;
    }

    @Override
    boolean frear() {
        return super.frear();
    }
}
