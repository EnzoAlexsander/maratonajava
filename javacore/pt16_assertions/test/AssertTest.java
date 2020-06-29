package maratonajava.javacore.pt16_assertions.test;

//Para ativar um assert faça o seguinte caminho
//Clique em Run na barra superior da tela
//Clique em Edit Configurations...
//Em VM options, digite (-ea)
//Clique em Apply e depois em ok.

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-1000);
    }
    //Exemplo 1
    private static void calculaSalario(double salario) {
        // Utilizar o assert apenas quando for privado (private)
        assert (salario > 0): "O salario não deve ser menor do que zero, o salario veio: "+salario;
        // calculo do salario
    }

}