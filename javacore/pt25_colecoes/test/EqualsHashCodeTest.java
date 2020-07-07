package maratonajava.javacore.pt25_colecoes.test;

import maratonajava.javacore.pt25_colecoes.classes.Celular;

public class EqualsHashCodeTest {
    public static void main(String[] args) {
        String nome1 = "Enzo Alexsander";
        String nome2 = new String ("Enzo Alexsander");
        Integer int1 = 5;
        Integer int2 = new Integer(5);
        System.out.println(nome1.equals(nome2));
        System.out.println(int1.equals(int2));

        Celular c1 = new Celular ("Iphone", "1234");
        Celular c2 = new Celular ("Iphone", "1234");
        System.out.println(c1.equals(c2));
    }
}