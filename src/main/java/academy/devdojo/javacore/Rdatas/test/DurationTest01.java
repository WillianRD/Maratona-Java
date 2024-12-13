package academy.devdojo.javacore.Rdatas.test;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinutes7Hours = LocalTime.now().plusMinutes(7);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timeMinutes7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(20);
        Duration d6 = Duration.of(3, ChronoUnit.HOURS);

        System.out.println(d1); // Saída PT7M0.000011517S
        System.out.println(d2); // Saída PT7M0.000011517S
        System.out.println(d3); // Saída PT16M40.000001209S
        System.out.println(d4); // Saída PT480H
        System.out.println(d5); // Saída PT20M
        System.out.println(d6); // Saída PT3H


    }
}
