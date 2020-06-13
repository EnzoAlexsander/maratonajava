package maratonajava.javacore.pt2_introducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num1 != 0) {
            return num1 / num2;
        }
        return 0;
    }
        //return só pode ser usado vazio sem nenhum tipo como no exemplo abaixo se estiver com metodos void
    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        } else {
            System.out.println("Não é possível dividir por 0");
        }
    }
    public void alteraDoisNumeros(int a, int b) {
        a = 30;
        b = 40;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("num1: "+a);
        System.out.println("num2: "+b);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs (int... numeros) {
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}

