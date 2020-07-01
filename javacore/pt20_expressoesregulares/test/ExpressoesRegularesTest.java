package maratonajava.javacore.pt20_expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// As expressões regulares geralmente não reutilizam um caractere que ja foi utilizado

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abaababab";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start()+" ");
        }
    }
}