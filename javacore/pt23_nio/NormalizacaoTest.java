package maratonajava.javacore.pt23_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTest {
    public static void main(String[] args) {
        String diretorioProjeto = "\\JavaOnline\\home\\enzo\\dev";
        String gangTxt = "..\\..\\gang.txt";
        Path p1 = Paths.get(diretorioProjeto, gangTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());

        Path p2 = Paths.get("home/./enzo/./dev");
        System.out.println(p2);
        System.out.println(p2.normalize());
    }
}
