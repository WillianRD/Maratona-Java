package main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AirCraft {
    private final Set<String> avaliableSeats = new HashSet<>();
    private final String name;

    public AirCraft(String name){
        this.name = name;
    }

    {
        avaliableSeats.add("1A");
        avaliableSeats.add("1B");
    }

    public boolean bookSeat(String seat){
        return avaliableSeats.remove(seat);
    }

    public String getName() {
        return avaliableSeats.toString(); //Atualizar
    }
}
