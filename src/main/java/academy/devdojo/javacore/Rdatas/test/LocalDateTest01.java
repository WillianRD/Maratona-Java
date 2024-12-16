package academy.devdojo.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, Month.OCTOBER,8);
        LocalDate now = LocalDate.now();

        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        System.out.println("Year: " + localDate.getYear() + " month "
                + localDate.getMonth() + " Day " + localDate.getMonthValue());

        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.lengthOfMonth());
        System.out.println("O ano e bissexto? " + localDate.isLeapYear());
        System.out.println(localDate.get(ChronoField.YEAR));
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
        System.out.println("Date person: " + localDate);
        System.out.println("Now: " + now);

        System.out.println("Date Max: " + localDate.MAX);
        System.out.println("Date Min: " + localDate.MIN);
    }
}
