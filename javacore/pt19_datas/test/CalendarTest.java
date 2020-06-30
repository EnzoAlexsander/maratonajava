package maratonajava.javacore.pt19_datas.test;

import java.util.Calendar;
import java.util.Date;

// Classes para trabalhar com numeros, datas e moedas
// NumberFormat, Locale, Calendar, Date, DateFormat

public class CalendarTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        date.setTime(date.getTime()+ 3_600_000L);

        Calendar c = Calendar.getInstance();
        //c.setTime(date);
        if(Calendar.SUNDAY == c.getFirstDayOfWeek()) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.add(Calendar.HOUR, 24);
        c.roll(Calendar.HOUR, 24);
        Date date2 = c.getTime();
        System.out.println(date2);
    }
}