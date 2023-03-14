package arrayCollections.array;

public class EqualsHashCode {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();

        u1.nome = "Patrick";
        u1.email = "patrick@gmail.com";

        Usuario u2 = new Usuario();

        u2.nome = "Patrick";
        u2.email = "patrick@gmail.com";

        System.out.println(u1 == u2); /*Vai dar falso, pois são dois objetos distintos da memoria, ele esta comparando o local da memória*/
        System.out.println(u1.equals(u2)); /*Por padrão ele vai fazer a mesma coisa que o == e vai dar falso, se eu não tiver implementado o equal na minha classe*/
        System.out.println(u2.equals(u1));


    }
}
