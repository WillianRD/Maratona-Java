package academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio;

public class CurrecnyFactory {
    public static Currency newCurrency(Country country) {
        switch (country){
            case USA: return new UsDollar();
            case BRAZIL: return new Real();
            default: throw new IllegalArgumentException("No currency");
        }

    }
}