package maratonajava.javacore.pt23_nio.teste;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest {
    public static void main(String[] args) {
        // C:\Users\enzoa\IdeaProjects\JavaOnline
        Path path1 = Paths.get("C:\\Users\\enzoa\\IdeaProjects\\JavaOnline\\Arquivo.txt");
        Path path2 = Paths.get("C:\\Users\\enzoa\\IdeaProjects\\JavaOnline","Arquivo.txt");
        Path path3 = Paths.get("C:","Users\\enzoa\\IdeaProjects\\JavaOnline","Arquivo.txt");
        Path path4 = Paths.get("C:","Users","enzoa","IdeaProjects","JavaOnline","Arquivo.txt");
        System.out.println(path4.toAbsolutePath());
        File file = path4.toFile();
        Path path = file.toPath();


    }
}
