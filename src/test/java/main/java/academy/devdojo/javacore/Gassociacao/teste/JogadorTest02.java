package main.java.academy.devdojo.javacore.Gassociacao.teste;

import main.java.academy.devdojo.javacore.Gassociacao.dominio.Jogador;
import main.java.academy.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Leide");
        Time time = new Time("São Paulo Futebol Clube");
        jogador.setTime(time);
        jogador.imprime();
    }
}
