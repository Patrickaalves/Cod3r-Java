package orientacaoObjetos.polimorfismo;

public class Sorvete extends Comida{
    public Sorvete(double peso) {
        super(peso);
    }

    boolean validaPesoSorvete(double peso){
        if (peso > 2){
            System.out.println("O peso esta muito grande");
            return false;
        }else {
            return true;
        }
    }
    @Override
    public void setPeso(double peso) {

        if (validaPesoSorvete(peso)){
            super.setPeso(peso);
        }else {
            super.setPeso(this.getPeso() - peso);
        }


    }

    @Override
    public void temperatura() {

    }
}
