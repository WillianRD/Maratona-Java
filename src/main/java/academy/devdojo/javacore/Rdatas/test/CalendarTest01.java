package academy.devdojo.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        if (c.getFirstDayOfWeek() == Calendar.DECEMBER){
            System.out.println("A segundaa :(");
        }

        System.out.println("Dia da semana: " + c.get(DAY_OF_WEEK));
        System.out.println("Dia do mês: " + c.get(DAY_OF_MONTH));
        System.out.println("Dia do ano: " + c.get(DAY_OF_YEAR));
        System.out.println("Dia da semana no mês: " + c.get(DAY_OF_WEEK_IN_MONTH));

        c.add(DAY_OF_MONTH,2); // Para adicionar dias a mais
        c.add(HOUR,5); // Para adicionar horas a mais

        Date date = c.getTime();
        System.out.println(date);
    }
}
