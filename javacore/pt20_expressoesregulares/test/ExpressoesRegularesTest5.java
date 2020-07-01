package maratonajava.javacore.pt20_expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest5 {
    public static void main(String[] args) {

        // .  coringa 1.3 = 123,133, 1A3, 1#3, 1 3
        // validar email

        int hex = 0x1;
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // <=> "([\\w\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "zlatan@hotmail.com, messi@yahoo.com, cr7@gmail.com.br";
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
