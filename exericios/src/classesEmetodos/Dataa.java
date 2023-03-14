package classesEmetodos;

public class Dataa {
    int dia;
    int mes;
    int ano;

    Dataa(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Dataa(int diaInicial, int mesInical, int anoInical){
        this.dia = diaInicial;
        this.mes = mesInical;
        this.ano = anoInical;
    }

    /*This referencia o objeto que esta sendo criado naquela instancia*/

    /*Método estatico não pode acessar o this
    *
    * static void teste(){
    *   this.dia}
    * */

    public String formataData(){
        return dia+"/"+mes+"/"+ano;
    }


}
