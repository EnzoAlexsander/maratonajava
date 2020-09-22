package maratonajava.javacore.pt25_colecoes.test;

import maratonajava.javacore.pt25_colecoes.classes.Produto2;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {

        List<Produto2> produtos = new LinkedList<>();
        Produto2 produto1 = new Produto2("123", "Laptop Lenovo", 2000.0, 0);
        Produto2 produto2 = new Produto2("321", "Picanha", 26.4, 10);
        Produto2 produto3 = new Produto2("879", "Teclado Razer", 1000.0, 5);
        Produto2 produto4 = new Produto2("012", "Samsung galaxy S7 64Gb", 3250.5, 0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Iterator<Produto2> produto2Iterator = produtos.iterator();
        //hasNext(); // next();

        while (produto2Iterator.hasNext()) {
            if (produto2Iterator.next().getQuantidade() == 0) {
                produto2Iterator.remove();
            }
        }
        System.out.println(produtos.size());
    }
}