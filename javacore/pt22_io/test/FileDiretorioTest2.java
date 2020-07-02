package maratonajava.javacore.pt22_io.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest2 {
    public static void main(String[] args) {

        // Renomeando arquivos e diretorios

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
        File arquivoNovoNome = new File(diretorio,"arquivo_renomeado.txt");
        boolean renomear = arquivo.renameTo(arquivoNovoNome);
        System.out.println("Renomeado "+renomear);

        File diretorioNovoNome = new File("folder2");
        boolean diretorioRenomeado =  diretorio.renameTo(diretorioNovoNome);
        System.out.println("diretorio renomeado: "+diretorioRenomeado);
    }
}