package maratonajava.javacore.pt23_nio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMathcherTest {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("pasta/subpasta/subsubpasta");
        Files.walkFileTree(path1, new AcharTodosOsBkp());
    }
}