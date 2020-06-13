package maratonajava.javacore.pt2_introducaometodos.test;

import maratonajava.javacore.pt2_introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5,5);
        System.out.println("divisao de dois numeros");
        double result = calc.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println("imprimindo dois numeros divididos");
        calc.imprimeDoisNumerosDivididos(20,5);
        System.out.println("Continuando a exec");

        int [] numeros = new int[] {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }

}
