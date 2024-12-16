package academy.devdojo.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String [] args) {
        LocalTime time = LocalTime.of(22,14,22);
        LocalTime timeNow = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String pattern = timeNow.format(dateTimeFormatter);

        System.out.println("Horário: " + pattern);

        System.out.println(time);
        System.out.println(timeNow);

        System.out.println(timeNow.getHour());
        System.out.println(timeNow.getMinute());
        System.out.println(timeNow.getSecond());
        System.out.println(timeNow.get(ChronoField.HOUR_OF_DAY));

        System.out.println("Minimo: " + LocalTime.MIN);
        System.out.println("Máximp: " + LocalTime.MAX);
    }
}
