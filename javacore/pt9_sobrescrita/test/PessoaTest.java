package maratonajava.javacore.pt9_sobrescrita.test;

import maratonajava.javacore.pt9_sobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Paul Nedved");
        p.setIdade(47);
        System.out.println(p);
        System.out.println("-----------------------");
        Pessoa p2 = new Pessoa();
        p2.setNome("Dennis Bergkamp");
        p2.setIdade(51);
        System.out.println(p2);
    }
}
