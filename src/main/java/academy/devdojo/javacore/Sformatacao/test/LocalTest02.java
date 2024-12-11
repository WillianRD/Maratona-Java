package academy.devdojo.javacore.Sformatacao.test;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String [] isCountries = Locale.getISOCountries();
        String [] isLanguages = Locale.getISOLanguages();

        for (String isCountriesT : isCountries){
            System.out.print(isCountriesT + " ");
        }
        System.out.println();

        for (String isLanguagens : isLanguages){
            System.out.print(isLanguagens + " ");
        }
    }
}
