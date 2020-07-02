package maratonajava.javacore.pt22_io.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) {
        File diretorio = new File("folder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Diretorio criado "+mkdir);
        File arquivo = new File(diretorio, "arquivo.txt");
        try {
            boolean newFile = arquivo.createNewFile();
            System.out.println("Arquivo criado "+newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}