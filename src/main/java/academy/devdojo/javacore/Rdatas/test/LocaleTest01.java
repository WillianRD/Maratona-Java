package academy.devdojo.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

// https://pt.wikipedia.org/wiki/ISO_3166-1_alfa-2 -- Lista de Paises and Language
// https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
public class LocaleTest01 {
    public static void main(String[] args) {
        // PT-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeBrasil = new Locale(".br","BR");

        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormatL1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormatL2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dateFormatL3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormatL4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dateFormatL5 = DateFormat.getDateInstance(DateFormat.FULL,localeBrasil);

        System.out.println("Italia " + dateFormatL1.format(calendar.getTime())); // Saída Italia martedì 10 dicembre 2024
        System.out.println("Suiça " + dateFormatL2.format(calendar.getTime())); // Saída Suiça martedì, 10 dicembre 2024
        System.out.println("India " + dateFormatL3.format(calendar.getTime())); // Saída India मंगलवार, 10 दिसंबर 2024
        System.out.println("Japão " + dateFormatL4.format(calendar.getTime())); // Saída Japão 2024年12月10日火曜日
        System.out.println("Brasil " + dateFormatL5.format(calendar.getTime()));
        System.out.println("----------------------------------------------------");

        System.out.println(localeItaly.getDisplayCountry()); // Saída Itália
        System.out.println(localeCH.getDisplayCountry()); // Saída Suíça
        System.out.println(localeIndia.getDisplayCountry()); // Saída Índia
        System.out.println(localeJapao.getDisplayCountry()); // Saída Japão
        System.out.println(localeItaly.getDisplayLanguage(localeIndia));
    }
}
