package orientacaoObjetos.heranca;

public class Heroi extends Jogador{

    public int teste;
    public boolean ataqueEmDobro(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        /*Delta mesmo x = mesma coluna, com y é mesma linha do tabuleiro*/

        if (deltaX == 0 && deltaY == 1){
            oponente.vida -= 20;
            return true;
        }else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
            return true;
        }else {
            return false;
        }
    }

    @Override
    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        /*Delta mesmo x = mesma coluna, com y é mesma linha do tabuleiro*/

        if (deltaX == 0 && deltaY == 1){
            oponente.vida -= 20;
            return true;
        }else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
            return true;
        }else {
            return false;
        }
    }
}
