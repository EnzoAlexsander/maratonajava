package maratonajava.javacore.pt15_exception.checkedexception.test;

import java.io.*;

// Forma de fazer a partir do JAVA 7
// Código atualizado da classe TryWithResourcesTest.java

public class TryWithResourcesTest2 {
    public static void main(String[] args) {
    }

    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("text.txt"))) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
