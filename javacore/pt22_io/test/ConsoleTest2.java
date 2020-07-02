package maratonajava.javacore.pt22_io.test;

import java.io.Console;

public class ConsoleTest2 {
    public static void main(String[] args) {

        Console c = System.console();
        char[] password = c.readPassword("%s","password: ");
        for(char pass : password) {
            c.format("%c ", pass);
        }
        c.format("\n");
        String texto;
        while(true){
            texto = c.readLine("%s", "Digite: ");
            c.format("esse texto %s foi digitado", retorno(texto));
        }
    }

    public static String retorno(String arg1) {
        return arg1;
    }
}