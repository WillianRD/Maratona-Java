package academy.devdojo.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20241219", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-12-19",DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-12-19", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse = LocalDateTime.parse("2024-12-19T05:51:27.820463314", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse);

        DateTimeFormatter dateTimeFormatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(dateTimeFormatterBr);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("19/12/2024",dateTimeFormatterBr);
        System.out.println(parseBR);

        DateTimeFormatter dateTimeFormatterGerman = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String localTimeGerman = LocalDate.now().format(dateTimeFormatterGerman);
        System.out.println(localTimeGerman);
        LocalDate parse4 = LocalDate.parse("19.Dezember.2024", dateTimeFormatterGerman);
        System.out.println(parse4);
    }
}
