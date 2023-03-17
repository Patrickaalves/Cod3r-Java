package orientacaoObjetos.heranca;

public class Monstro extends Jogador{
    @Override
    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        /*return super.atacar(oponente);*/
        return  ataque1 || ataque2;
    }
}
