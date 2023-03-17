package orientacaoObjetos.heranca;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        /*Tão na mesma coluna*/

        monstro.atacar(heroi);
        monstro.atacar(heroi);
        monstro.atacar(heroi);

        heroi.ataqueEmDobro(monstro);
        heroi.atacar(monstro);

        System.out.println("Monstro");
        System.out.println(monstro.x);
        System.out.println(monstro.y);
        System.out.println(monstro.vida);
        System.out.println();
        System.out.println("Heroi 2");
        System.out.println(heroi.x);
        System.out.println(heroi.y);
        System.out.println(heroi.vida);


    }
}
