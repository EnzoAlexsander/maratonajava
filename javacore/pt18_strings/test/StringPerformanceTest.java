package maratonajava.javacore.pt18_strings.test;

// Pensando em performance o melhor é o StringBuilder
// A diferença do StringBuilder para o StringBuffer é que o StringBuffer tem os métodos sincronizados e o StrinBuilder não

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(500000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String "+ (fim-inicio) + " milisegundos");

        inicio = System.currentTimeMillis();
        concatStringBuilder(30000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder "+ (fim-inicio) + " milisegundos");

        inicio = System.currentTimeMillis();
        concatStringBuffer(30000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer "+ (fim-inicio) + " milisegundos");
    }

    private static void concatString(int tam) {
        String string = "";
        for(int i=0; i < tam; i++) {
            string += i;
        }
    }

    private static void concatStringBuilder(int tam) {
        StringBuilder sb = new StringBuilder(tam);
        for(int i=0; i < tam; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tam) {
        StringBuffer sb = new StringBuffer(tam);
        for(int i=0; i < tam; i++) {
            sb.append(i);
        }
    }
}
