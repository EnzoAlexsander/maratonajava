package maratonajava.introducao.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        /*
        && = e
        || = ou
         */
        int idade = 18;
        float salario = 1000f;

        System.out.println(idade >= 18 && salario >= 2000);
        System.out.println(idade >= 18 || salario >= 2000);
    }
}
