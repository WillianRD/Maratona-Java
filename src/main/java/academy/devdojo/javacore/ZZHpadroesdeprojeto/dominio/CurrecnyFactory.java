package academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio;

import static academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.Country.BRAZIL;
import static academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.Country.USA;

public class CurrecnyFactory {
    public static Currency newCurrency(Country country) {
        switch (country){
            case USA: return new UsDollar();
            case BRAZIL: return new Real();
            default: throw new IllegalArgumentException("No currency");
        }

    }
}