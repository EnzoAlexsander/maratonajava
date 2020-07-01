package maratonajava.javacore.pt20_expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest4 {
    public static void main(String[] args) {
        // numero hexadecimal
        // Quantificadores
            // ? zero ou uma
            // * zero ou mais
            // + uma ou mais
            // {n,m} de n ate m
            // ( )
            // |
            // $

        int hex = 0x1;
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0x01FFABC 0x10G 0x1";
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
