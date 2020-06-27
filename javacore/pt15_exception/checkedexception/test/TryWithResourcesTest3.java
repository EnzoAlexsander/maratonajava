package maratonajava.javacore.pt15_exception.checkedexception.test;

import maratonajava.javacore.pt15_exception.checkedexception.classes.Leitor1;
import maratonajava.javacore.pt15_exception.checkedexception.classes.Leitor2;

// Dessa maneira não é necessário usar o catch, nesse caso deve ser chamado no método

public class TryWithResourcesTest3 {
    public static void main(String[] args) {
    lerArquivo();
    }
    public static void lerArquivo() {
        try (Leitor2 leitor2 = new Leitor2();
             Leitor1 leitor1 = new Leitor1()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
