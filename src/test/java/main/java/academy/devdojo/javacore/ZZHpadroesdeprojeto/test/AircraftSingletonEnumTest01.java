package main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletoEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        compraAssentos("1A");
        compraAssentos("1A");
    }

    private static void compraAssentos(String assentos) {
        System.out.println(AircraftSingletoEnum.INSTANCIA.hashCode()); //Check
        AircraftSingletoEnum instancia = AircraftSingletoEnum.INSTANCIA;
        System.out.println(instancia.comprandoAssentos(assentos));
    }
}
