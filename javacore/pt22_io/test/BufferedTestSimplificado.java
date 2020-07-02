package maratonajava.javacore.pt22_io.test;

import java.io.*;

public class BufferedTestSimplificado {
    public static void main(String[] args) {
        // Essa classe tem o mesmo resultado da classe BufferedTest.java
        // Porém, ela ocupa menos linhas

        File file = new File("Arquivo.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            bufferedWriter.write("Escrevendo uma mensagem no arquivo");
            bufferedWriter.newLine();
            bufferedWriter.write("Pulando uma linha");
            bufferedWriter.flush();
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}