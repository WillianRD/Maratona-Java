package academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AeroportoSingletonEager {
//  Cria se um Objeto com o mesmo nome da classe,nome do objeto = INSTANCIA = novo objeto
//    Eager Inicialização
    private static final AeroportoSingletonEager INSTANCIA = new AeroportoSingletonEager("787-900");
    private final Set<String> asentos = new HashSet<>();
    private final String nome;

    //    Contrutor da classe
    public AeroportoSingletonEager(String nome){
        this.nome = nome;
    }
    {
//        Adicionando assentos na lista
//        Bloco de inicialização
        asentos.add("1A");
        asentos.add("1A");
    }
//    Getter estatico com o mesmo nome da Classe, Nome: getInstance
    public static AeroportoSingletonEager getInstance(){
//        Retorna a Instancia crianda na linha 8
        return INSTANCIA;
    }
    // metodo boolean, retorna o valor da lista, e remove da lista
    public boolean comprandoAssentos(String assentos){
        return asentos.remove(assentos);
    }
}
