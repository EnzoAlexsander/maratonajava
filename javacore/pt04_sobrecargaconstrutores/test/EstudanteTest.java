package maratonajava.javacore.pt04_sobrecargaconstrutores.test;

import maratonajava.javacore.pt04_sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("12212", "Carlitos", new double[] {5,7,9}, "20/10/1997");
        est.imprime();
    }
}
