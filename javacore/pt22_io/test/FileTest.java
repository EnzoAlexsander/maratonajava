package maratonajava.javacore.pt22_io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            System.out.println(file.createNewFile());
            boolean exists = file.exists();
            System.out.println("Permissão de leitura? "+file.canRead());
            System.out.println("path "+file.getPath());
            System.out.println("path inteiro"+file.getAbsolutePath());
            System.out.println("diretorio? "+file.isDirectory());
            System.out.println("arquivo oculto? "+file.isHidden());
            System.out.println("Quando o arquivo foi modificado pela ultima vez? "+new Date(file.lastModified()));

            if(exists) {
                System.out.println("Deletado? "+file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
