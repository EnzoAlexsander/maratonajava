package maratonajava.javacore.pt15_exception.checkedexception.test;

import java.io.*;

// Forma de fazer até o JAVA 6

public class TryWithResourcesTest {
    public static void main(String[] args) {

    }

    public static void lerArquivo(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}