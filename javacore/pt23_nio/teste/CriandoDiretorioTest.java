package maratonajava.javacore.pt23_nio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoDiretorioTest {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta");
        Path path2 = Paths.get("pasta\\subpasta\\subsubpasta");
        try {
            //if(Files.notExists(path1))
            //    Files.createDirectory(path1);  = Para criar apenas um diretório

            if(Files.notExists(path2))
            Files.createDirectories(path2); // = Para criar dois ou mais diretorios
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
