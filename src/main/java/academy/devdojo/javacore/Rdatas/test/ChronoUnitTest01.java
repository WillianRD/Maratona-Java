package academy.devdojo.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime aniversario = LocalDateTime.of(1988, Month.AUGUST, 6, 12, 0, 0);
        System.out.println(ChronoUnit.DAYS.between(aniversario, now) + " dias");
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now) + " semanas");
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now) + " Meses");
        System.out.println(ChronoUnit.YEARS.between(aniversario, now) + " Anos");

    }
}
