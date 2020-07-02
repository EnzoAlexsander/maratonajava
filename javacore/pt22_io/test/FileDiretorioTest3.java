package maratonajava.javacore.pt22_io.test;

import java.io.File;

public class FileDiretorioTest3 {
    public static void main(String[] args) {
        buscarArquivos();
    }
    public static void buscarArquivos(){
        File file = new File("C:\\Users\\enzoa\\IdeaProjects\\JavaOnline");
        String[] list = file.list();
        for(String arquivo: list) {
            System.out.println(arquivo);
        }
    }
}