package classesEmetodos;

public class DataaTeste {
    public static void main(String[] args) {
        Dataa data = new Dataa();
        System.out.println("A data que temos disponivel é "+data.formataData());

        Dataa data2 = new Dataa(10,5,2023);
        System.out.println(data2.formataData());
    }
}
