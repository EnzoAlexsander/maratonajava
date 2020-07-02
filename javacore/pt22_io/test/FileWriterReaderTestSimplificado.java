package maratonajava.javacore.pt22_io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTestSimplificado {
    // Essa classe tem o mesmo resultado da classe FileWriterReaderTest.java
    // Porém, ela ocupa menos linhas
    public static void main(String[] args) {
        File file = new File("ArquivoSimplificado.txt");
        try(FileWriter fileWriter = new FileWriter(file);
            FileReader fileReader = new FileReader(file)) {

            fileWriter.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha");
            fileWriter.flush();
            char[] in = new char[500];
            int size = fileReader.read(in);
            System.out.println("tamanho " + size);
            for (char c : in) {
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}