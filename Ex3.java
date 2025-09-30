import java.util.ArrayList;
import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Fábio");
        nomes.addAll(Arrays.asList("Manuel", "Ze", "Maria", "João"));
        for (String nome: nomes) {
            System.out.println("Ola "+nome);
        }
    }
}