package maratonajava.javacore.pt25_colecoes.test;

import maratonajava.javacore.pt25_colecoes.classes.Consumidor;
import maratonajava.javacore.pt25_colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {

        Consumidor consumidor = new Consumidor("Enzo Alex", "123");
        Consumidor consumidor2 = new Consumidor("Ale Duarte", "321");
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
        Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5);

        Map<Consumidor, List<Produto>> map = new HashMap<>();

        List<Produto> produtosConsumidor1 = new ArrayList<>();
        produtosConsumidor1.add(produto1);
        produtosConsumidor1.add(produto2);

        List<Produto> produtosConsumidor2 = new ArrayList<>();
        produtosConsumidor2.add(produto3);
        produtosConsumidor2.add(produto4);

        map.put(consumidor, produtosConsumidor1);
        map.put(consumidor2, produtosConsumidor2);

        for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Produto produto : entry.getValue()) {
                System.out.println(produto.getNome());
            }
        }
    }
}