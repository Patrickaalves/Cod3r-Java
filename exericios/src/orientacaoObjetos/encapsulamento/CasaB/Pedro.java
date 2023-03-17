package orientacaoObjetos.encapsulamento.CasaB;

import orientacaoObjetos.encapsulamento.CasaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();
    void testesAcessos(){
        //System.out.println(mae.segredo); /*Não da de acessar pois é privado*/
        //System.out.println(mae.facoDentroDeCasa); /*Não Consigo acessar pois não estão no mesmo pacote*/
        System.out.println(formaDeFalar);
        System.out.println(mae.formaDeFalar); /*Desta forma não da certa pois estou pegando de uma instacia*/
        System.out.println(mae.todosSabem); /*Consigo acessar pois é um metodo publico*/
    }
}
