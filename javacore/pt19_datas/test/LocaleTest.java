package maratonajava.javacore.pt19_datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        // ISO 639 - pt = Portugues/ BR = Brazil / en = Ingles / us = Estados Unidos
        Locale locItaly = new Locale("it");
        Locale locSuica = new Locale("it", "CH");
        Locale locJapao = new Locale("ja");
        Locale locIndia = new Locale("hi", "IN");

        Calendar c = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locJapao);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locIndia);

        System.out.println("Italia "+df.format(c.getTime()));
        System.out.println("Suiça "+df2.format(c.getTime()));
        System.out.println("Japão "+df3.format(c.getTime()));
        System.out.println("India "+df4.format(c.getTime()));

        System.out.println(locItaly.getDisplayLanguage(locJapao));
        System.out.println(locJapao.getDisplayLanguage(locItaly));

        System.out.println(locSuica.getDisplayCountry(locItaly));
    }
}