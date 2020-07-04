package maratonajava.javacore.pt23_nio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoArquivoTest {
    public static void main(String[] args) {

        Path path2 = Paths.get("pasta\\subpasta\\subsubpasta");
        Path arquivo = Paths.get("pasta\\subpasta\\subsubpasta\\file.txt");

        try {
            if(Files.notExists(arquivo))
            Files.createFile(arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path source = Paths.get("folder2\\arquivo.txt");
        Path target = Paths.get(path2.toString() +"\\arquivoCopiado.txt");
        try {
            Files.copy(source, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}