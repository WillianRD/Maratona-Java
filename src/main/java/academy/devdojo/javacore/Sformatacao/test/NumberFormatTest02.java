package academy.devdojo.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args){
        Locale localeDefault = Locale.getDefault();
        Locale localePt = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat [] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance(localeJP);
        nf[2] = NumberFormat.getCurrencyInstance(localePt);
        nf[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 100_000_000.2130;

        for (NumberFormat numberFormat : nf){
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

    }
}
