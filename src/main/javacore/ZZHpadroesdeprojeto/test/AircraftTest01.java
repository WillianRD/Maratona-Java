package main.javacore.ZZHpadroesdeprojeto.test;

import main.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getInstance());
//        AircraftSingletonEager airCraft = AircraftSingletonEager.getInstance();
//        System.out.println(airCraft.bookSeat(seat));
    }
}
