package maratonajava.javacore.pt22_io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha");
            fileWriter.flush();
            fileWriter.close();

            FileReader fileReader = new FileReader(file);
            char[] in = new char[500];
            int size = fileReader.read(in);
            System.out.println("tamanho "+size);
            for(char c: in) {
                System.out.print(c);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}