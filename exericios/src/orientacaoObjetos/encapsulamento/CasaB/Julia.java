package orientacaoObjetos.encapsulamento.CasaB;

import orientacaoObjetos.encapsulamento.CasaA.Ana;

public class Julia {
    Ana sogra = new Ana();
    void testesAcessos(){
//        System.out.println(sogra.segredo); /*Não da de acessar pois é privado*/
//        System.out.println(sogra.facoDentroDeCasa); /*Consigo acessar pois estão no mesmo pacote*/
//        System.out.println(sogra.formaDeFalar); /*Tambem consigo ver os protected dentro do mesmo pacote*/
        System.out.println(sogra.todosSabem); /*Consigo acessar pois é um metodo publico*/
    }
}
