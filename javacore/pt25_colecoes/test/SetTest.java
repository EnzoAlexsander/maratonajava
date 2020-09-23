package maratonajava.javacore.pt25_colecoes.test;

import maratonajava.javacore.pt25_colecoes.classes.Produto2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Produto2 produto1 = new Produto2("123", "Laptop Lenovo", 2000.0, 0);
        Produto2 produto2 = new Produto2("321", "Picanha", 26.4, 10);
        Produto2 produto3 = new Produto2("879", "Teclado Razer", 1000.0, 5);
        Produto2 produto4 = new Produto2("012", "Samsung galaxy S7 64Gb", 3250.5, 0);
        Produto2 produto5 = new Produto2("999", "Samsung galaxy S6 64Gb", 3250.5, 0);
        Set<Produto2> produtoSet = new LinkedHashSet<>();
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);
        for (Produto2 p : produtoSet) {
            System.out.println(p);
        }
    }
}