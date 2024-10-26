package main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AeroportoSingletonLazy {
    //  Cria se um Objeto com o mesmo nome da classe
    private static AeroportoSingletonLazy INSTANCIA;
    private final Set<String> asentos = new HashSet<>();
    private final String name;

    //    Contrutor da classe
    public AeroportoSingletonLazy(String name) {
        this.name = name;
    }

    {
//        Adicionando assentos na lista
//        Bloco de inicialização
        asentos.add("1B");
        asentos.add("1B");
    }

    //    Getter estatico com o mesmo nome da Classe, Nome: getInstance
    public static AeroportoSingletonLazy getInstance() {
        if (INSTANCIA == null) {
            synchronized (AeroportoSingletonLazy.class) {
                if (INSTANCIA == null) {
                    INSTANCIA = new AeroportoSingletonLazy("787-900");
                }
            }

        }
//        Retorna a Instancia
        return INSTANCIA;
    }

    // metodo boolean, retorna o valor da lista, e remove da lista
    public boolean comprandoAssentos(String assentos) {
        return asentos.remove(assentos);
    }
}
