package academy.devdojo.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

// https://pt.wikipedia.org/wiki/ISO_3166-1_alfa-2 -- Lista de Paises and Language
// https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
public class LocaleTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeBrasil = new Locale(".br","BR");
        Locale localeCanada = new Locale("ca","CA");
        Locale localeUs = new Locale("en", "US");

        DateFormat dateFormatL1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormatL2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dateFormatL3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormatL4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dateFormatL5 = DateFormat.getDateInstance(DateFormat.FULL,localeBrasil);
        DateFormat dateFormatL6 = DateFormat.getDateInstance(DateFormat.FULL,localeCanada);
        DateFormat dateFormatL7 = DateFormat.getDateInstance(DateFormat.FULL,localeUs);

        System.out.println("Italia " + dateFormatL1.format(calendar.getTime())); // Saída Italia martedì 10 dicembre 2024
        System.out.println("Suiça " + dateFormatL2.format(calendar.getTime())); // Saída Suiça martedì, 10 dicembre 2024
        System.out.println("India " + dateFormatL3.format(calendar.getTime())); // Saída India मंगलवार, 10 दिसंबर 2024
        System.out.println("Japão " + dateFormatL4.format(calendar.getTime())); // Saída Japão 2024年12月10日火曜日
        System.out.println("Brasil " + dateFormatL5.format(calendar.getTime())); // Saída Brasil Tuesday, December 10, 2024
        System.out.println("Canád " + dateFormatL6.format(calendar.getTime())); // Saída Canád dimarts, 10 de desembre del 2024
        System.out.println("Estados  " + dateFormatL7.format(calendar.getTime())); // Saída Estados  Tuesday, December 10, 2024
        System.out.println("----------------------------------------------------");

        // Passando localeUs como parâmetro para imprimir o texto com a traduçaõ do Inglês
        System.out.println(localeItaly.getDisplayCountry(localeUs)); // Saída Itália
        System.out.println(localeCH.getDisplayCountry(localeUs)); // Saída Suíça
        System.out.println(localeIndia.getDisplayCountry(localeUs)); // Saída Índia
        System.out.println(localeJapao.getDisplayCountry(localeUs)); // Saída Japão
        System.out.println(localeItaly.getDisplayLanguage(localeUs)); // italiano
        System.out.println(localeCanada.getDisplayCountry(localeUs)); // Canadá
        System.out.println(localeUs.getDisplayCountry(localeUs)); // Estados Unidos
    }
}
