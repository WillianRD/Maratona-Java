package academy.devdojo.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args){
        Locale localeDefault = Locale.getDefault();
        Locale localePt = new Locale("pt","BR");
        Locale localeUs = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat [] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getNumberInstance(localeUs);
        nf[1] = NumberFormat.getNumberInstance(localeJP);
        nf[2] = NumberFormat.getNumberInstance(localePt);
        nf[3] = NumberFormat.getNumberInstance(localeIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nf){
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.2130";
        try {
            System.out.println(nf[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
