package maratonajava.javacore.pt22_io.test;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Escrevendo uma mensagem no arquivo");
            bufferedWriter.newLine();
            bufferedWriter.write("Pulando uma linha");
            bufferedWriter.flush();
            bufferedWriter.close();

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string = null;
            while ((string = bufferedReader.readLine()) != null) {
                System.out.println(string);
            }
            char[] in = new char[500];
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}