package maratonajava.javacore.pt25_colecoes.test;

import maratonajava.javacore.pt25_colecoes.classes.Celular;
import maratonajava.javacore.pt25_colecoes.classes.Produto2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        Produto2 produto1 = new Produto2("123", "Laptop Lenovo", 2000.0, 0);
        Produto2 produto2 = new Produto2("321", "Picanha", 26.4, 10);
        Produto2 produto3 = new Produto2("879", "Teclado Razer", 1000.0, 5);
        Produto2 produto4 = new Produto2("012", "Samsung galaxy S7 64Gb", 3250.5, 0);
        Produto2 produto5 = new Produto2("023", "Samsung galaxy S6 64Gb", 1d, 0);
        NavigableSet<Produto2> produtoNavigableSet = new TreeSet<>();
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);
        for (Produto2 produto : produtoNavigableSet.descendingSet()) {
            System.out.println(produto);
        }
        System.out.println("------------------------");
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(produtoNavigableSet.lower(produto4));
    }
}