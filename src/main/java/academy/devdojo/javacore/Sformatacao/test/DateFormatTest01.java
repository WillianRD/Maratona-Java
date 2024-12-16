package academy.devdojo.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat [] dateFormats = new DateFormat[7];

        //Teste
        dateFormats[0] = DateFormat.getInstance(); // Formatação simples de acordo com o SO (10/12/2024 05:38)
        dateFormats[1] = DateFormat.getDateInstance(); // Retorna a data (10 de dez. de 2024)
        dateFormats[2] = DateFormat.getDateTimeInstance(); // Retorna a data & hora (10 de dez. de 2024 05:38:49)
        dateFormats[3] = DateFormat.getDateInstance(DateFormat.SHORT); // Retorna a data (10/12/2024)
        dateFormats[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); // Retorna a data (10 de dez. de 2024)
        dateFormats[5] = DateFormat.getDateInstance(DateFormat.LONG); // Retorna a data (10 de dezembro de 2024)
        dateFormats[6] = DateFormat.getDateInstance(DateFormat.FULL); // Retorna a data (terça-feira, 10 de dezembro de 2024)

        for (DateFormat dateFormat : dateFormats){
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
