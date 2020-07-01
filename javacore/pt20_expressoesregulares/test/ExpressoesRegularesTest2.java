package maratonajava.javacore.pt20_expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest2 {
    public static void main(String[] args) {
        /* \d - procura todos os digitos numericos no texto
           \D - procura tudo o que não for digito
           \s - espaços em branco \t \n \f \r
           \S - caractere que não é branco
           \w - caractere de palavras a-z, A-Z, digitos e _
           \W - tudo o que não for caractere de palavra*/

        /*String regex = "\\d"; //EXEMPLO \d
        String texto = "@hab12₢7abbvhgsa02121";*/

        /*String regex = "\\D"; //EXEMPLO \D
        String texto = "@hab12₢7abbvhgsa02121";*/

        /*String regex = "\\s";  //EXEMPLO \s
        String texto = "₢@hab1278 \r";*/

        /*String regex = "\\S";  //EXEMPLO \S
        String texto = "₢@hab1278 \r";*/

        /*String regex = "\\w";  //EXEMPLO \w
        String texto = "₢@hab1278 \t_";*/

        String regex = "\\W";  //EXEMPLO \W
        String texto = "₢@hab1278 \t_";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("indice: 012345678901234567");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start()+" ");
        }
    }
}
