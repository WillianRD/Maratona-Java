package academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.Country;
import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.CurrecnyFactory;
import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.Currency;


public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrecnyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
