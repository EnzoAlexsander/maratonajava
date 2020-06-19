package maratonajava.javacore.pt03_sobrecargametodos.test;

import maratonajava.javacore.pt03_sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.init("Xica da Silva", "012.345.678-90", 4500, "3.333.333");
        funcionario.imprime();

        System.out.println();
    }
}
