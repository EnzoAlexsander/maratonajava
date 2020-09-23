package maratonajava.javacore.pt25_colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Enzo");
        nomes.add("Alexsander");
        nomes.add("Assunção");
        nomes.add("Lima");
        nomes.add("Negrão");
        nomes.add(0, "Alessandra");
        Collections.sort(nomes);
        for (String nome : nomes) {
            System.out.println(nome);
        }

        List<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(1.3);
        numeros.add(1.9);
        numeros.add(2d);
        Collections.sort(numeros);
        for (Double numero : numeros) {
            System.out.println(numero);
        }

    }
}