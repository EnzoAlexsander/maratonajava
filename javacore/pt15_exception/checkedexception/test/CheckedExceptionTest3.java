package maratonajava.javacore.pt15_exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest3 {
    public static void main(String[] args) throws IOException {
        try {
            criarArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void criarArquivo() throws IOException {
        File file = new File("Teste.txt");
        System.out.println("Arquivo criado? : " + file.createNewFile());
        System.out.println("Arquivo criado");
    }
}

