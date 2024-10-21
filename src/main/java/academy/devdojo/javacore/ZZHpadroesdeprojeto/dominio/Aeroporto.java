package academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

// Classe que não pode ser extendida
public final class Aeroporto {
//    Lista de assentos
//    Criaçãop do objeto Assentos
    private final Set<String> asentos = new HashSet<>();
    private final String nome;

//    Contrutor da classe
    public Aeroporto(String nome){
        this.nome = nome;
    }
    {
//        Adicionando assentos na lista
//        Bloco de inicialização
        asentos.add("1A");
        asentos.add("1A");
    }
// metodo boolean, retorna o valor da lista, e remove da lista
    public boolean comprandoAssentos(String assentos){
        return asentos.remove(assentos);
    }
}
