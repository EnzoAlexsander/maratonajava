package maratonajava.javacore.pt19_datas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// Mais opções de simpledateformat
//https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "'Brasília, ' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));
    }
}