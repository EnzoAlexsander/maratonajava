package maratonajava.javacore.pt18_strings.test;

import java.awt.*;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(16);
        StringBuilder sb2 = new StringBuilder(16);
        sb.append("Uma frase comum");
        sb2.append("123456789");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb2.delete(0,2));
        System.out.println(sb2.insert(0,"012"));

    }
}
