package main.javacore.Ycolecoes.test;

import main.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("2200F" , "SAMSUNG");
        Smartphone s2 = new Smartphone("220F" , "SAMSUNG");
        System.out.println(s1.equals(s2));

    }
}
