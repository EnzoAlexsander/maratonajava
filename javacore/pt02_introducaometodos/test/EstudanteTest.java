package maratonajava.javacore.pt02_introducaometodos.test;

import maratonajava.javacore.pt02_introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Abigo Baldo Costa");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{10, 10, 3});
        estudante.print();
        estudante.tirarMedia();
        System.out.println("Aprovado? " + estudante.isAprovado());
    }
}