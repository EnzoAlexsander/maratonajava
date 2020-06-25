package maratonajava.javacore.pt12_classesabstratas.test;

import maratonajava.javacore.pt12_classesabstratas.classes.Gerente;
import maratonajava.javacore.pt12_classesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Ale", "257854", 5000);
        Vendedor v = new Vendedor("Joao Felix", "038494", 4000,5000);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(g);
        System.out.println("----------------------");
        System.out.println(v);
    }
}
