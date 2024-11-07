package main.javacore.Ycolecoes.dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private long id;
    private String name;

    public Consumidor(String name){
        this.id = ThreadLocalRandom.current().nextLong(0,1000000);
        this.name = name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    public String getName(){
        return name;
    }
}
