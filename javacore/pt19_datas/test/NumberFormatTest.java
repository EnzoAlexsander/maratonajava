package maratonajava.javacore.pt19_datas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 123.4567f;
        Locale locJP = new Locale("JP");
        Locale locFR = new Locale("FR");
        Locale locIT = new Locale("IT");
        NumberFormat[] numberformatarray = new NumberFormat[8];
        numberformatarray[0] = NumberFormat.getInstance();
        numberformatarray[1] = NumberFormat.getInstance(locJP);
        numberformatarray[2] = NumberFormat.getCurrencyInstance();
        numberformatarray[3] = NumberFormat.getCurrencyInstance(locJP);

        numberformatarray[4] = NumberFormat.getInstance(locFR);
        numberformatarray[5] = NumberFormat.getCurrencyInstance(locFR);

        numberformatarray[6] = NumberFormat.getInstance(locIT);
        numberformatarray[7] = NumberFormat.getCurrencyInstance(locIT);


        for(NumberFormat numberFormat : numberformatarray) {
            System.out.println(numberFormat.format(valor));
        }
        NumberFormat numberFormat = NumberFormat.getInstance();
        System.out.println(numberFormat.getMaximumFractionDigits());
        numberFormat.setMaximumFractionDigits(5);
        System.out.println(numberFormat.format(valor));
        String valorString = "123,4567";
        try {
            System.out.println(numberFormat.parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}