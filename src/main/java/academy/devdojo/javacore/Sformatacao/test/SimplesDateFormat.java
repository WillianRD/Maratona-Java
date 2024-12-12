package academy.devdojo.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimplesDateFormat {
    public static void main(String[] args) {
        String pattern = "'São Paulo' dd, 'de' MMM 'de' yyyy";
        SimpleDateFormat simplesDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simplesDateFormat.format(new Date()));
//  Saída
//  São Paulo--quarta-feira, 11 dez. de 2024
// Horário de brasilia 21:12:44

        try {
            System.out.println(simplesDateFormat.parse("São Paulo 11, de dez. de 2024"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // Saídaa
//         Wed Dec 11 00:00:00 GMT-03:00 2024 -- Retorna o valor padrão

    }
}
