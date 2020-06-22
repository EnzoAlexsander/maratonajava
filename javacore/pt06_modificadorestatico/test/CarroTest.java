package maratonajava.javacore.pt06_modificadorestatico.test;

import maratonajava.javacore.pt06_modificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Lamborghini", 300);
        Carro c3 = new Carro("Ferrari Enzo", 320);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("*******************************");

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
