package maratonajava.javacore.pt10_modificadorfinal.test;

import maratonajava.javacore.pt10_modificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Yohan Cruyff");
        System.out.println(c.getComprador());
    }
}