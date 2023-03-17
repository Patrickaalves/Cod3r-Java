package orientacaoObjetos.encapsulamento.CasaA;

public class Paulo {

    Ana esposa = new Ana();
    void testesAcessos(){
//      System.out.println(esposa.segredo); /*Não da de acessar pois é privado*/
        System.out.println(esposa.facoDentroDeCasa); /*Consigo acessar pois estão no mesmo pacote*/
        System.out.println(esposa.formaDeFalar); /*Tambem consigo ver os protected dentro do mesmo pacote*/
        System.out.println(esposa.todosSabem); /*Consigo acessar pois é um metodo publico*/
    }
}
