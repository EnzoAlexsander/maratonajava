package maratonajava.javacore.pt22_io.test;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console c = System.console();
        char[] password = c.readPassword("%s","password: ");
        for(char pass : password) {
            c.format("%c ", pass);
        }
        c.format("\n");
    }
}