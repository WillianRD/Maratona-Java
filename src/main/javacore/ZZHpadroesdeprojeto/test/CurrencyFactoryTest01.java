package main.javacore.ZZHpadroesdeprojeto.test;

import main.javacore.ZZHpadroesdeprojeto.dominio.Country;
import main.javacore.ZZHpadroesdeprojeto.dominio.CurrecnyFactory;
import main.javacore.ZZHpadroesdeprojeto.dominio.Currency;


public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrecnyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
