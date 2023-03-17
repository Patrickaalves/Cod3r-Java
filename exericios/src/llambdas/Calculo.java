package llambdas;

/*FunctionalInterface Ela força você ter apensa um metodo*/
@FunctionalInterface
public interface Calculo {
    public abstract double executar(double a, double b);

    /*Só é permitido o metodo default*/
    default  String legal(){
        return "legal";
    }

    /*Estatico tambem pode*/
    static String muitoLegal(){
        return "Muito legal";
    }
}
