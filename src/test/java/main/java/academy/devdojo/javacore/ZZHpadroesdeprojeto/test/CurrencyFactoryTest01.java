package main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.Country;
import main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.CurrecnyFactory;
import main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.Currency;


public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrecnyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
