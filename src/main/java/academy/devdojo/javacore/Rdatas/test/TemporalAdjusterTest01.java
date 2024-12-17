package academy.devdojo.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

 class obterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dAyOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDay;
        switch (dAyOfWeek) {
            case THURSDAY:
                addDay = 4;
                break;
            case FRIDAY:
                addDay = 3;
                break;
            case SATURDAY:
                addDay = 2;
                break;
            default:
                addDay = 1;
        }
        return temporal.plus(addDay, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println("Proximo dia útil " + now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(15).with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(16).with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(17).with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
