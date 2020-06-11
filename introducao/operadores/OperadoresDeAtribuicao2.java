package maratonajava.introducao.operadores;

public class OperadoresDeAtribuicao2 {
    public static void main(String[] args) {
        // =, -=, +=, *=, /=, %=
        int salario = 1800;
        int numero = 11;
        numero = numero % 2;
        numero %= 2;
        System.out.println(numero);
    }
}