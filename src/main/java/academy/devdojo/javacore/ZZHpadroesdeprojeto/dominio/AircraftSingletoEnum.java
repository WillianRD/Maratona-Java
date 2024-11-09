package academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletoEnum {
    INSTANCIA;
    private final Set<String> asentos;

    AircraftSingletoEnum(){
        this.asentos = new HashSet<>();
        this.asentos.add("1A");
        this.asentos.add("1B");
    }

    public boolean comprandoAssentos(String assentos){
        return asentos.remove(assentos);
    }
}
