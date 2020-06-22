package maratonajava.javacore.pt06_modificadorestatico.classes;

public class Cliente {
    /*
O caminho da compilação até chegar ao construtor e criar um objeto
    1 - Bloco de inicialização estático é executado quando a JVM carregar a classe (é executado apenas 1 vez)
    2 - Alocado espaço na memoria para o objetto que será criado
    3 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    4 - Bloco de inicialização é executado
    5 - O construtor é executado
     */
    private static int[] parcelas;

    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;// ??
        }
    }

    public Cliente() {
    }

    public static int[] getParcelas() {
        return parcelas;
    }
}