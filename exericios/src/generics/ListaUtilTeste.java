package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS","Python", "PHP");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);

        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
        Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
    }
}
