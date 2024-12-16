package academy.devdojo.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now,localDate);
        Period p2 = Period.ofDays(7);
        Period p3 = Period.ofMonths(10);
        Period p4 = Period.ofWeeks(58);
        Period p5 = Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("São " + p3 + " semanas");
        System.out.println(p4);
        System.out.println(p5);
    }
}
