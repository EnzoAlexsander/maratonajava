package maratonajava.javacore.pt20_expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest6 {
    public static void main(String[] args) {

        // datas

        int hex = 0x1;
        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
        String texto = "20/10/1997 10/03/1997 11/11/0145 01/05/9534"; // dd/MM/yyyy
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("indice: 012345678901234567");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start()+" "+ matcher.group());
        }
    }
}
