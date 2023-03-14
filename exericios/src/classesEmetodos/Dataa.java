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
        dia = diaInicial;
        mes = mesInical;
        ano = anoInical;
    }

    public String formataData(){
        return dia+"/"+mes+"/"+ano;
    }


}
