package main.javacore.Gassociacao.teste;

import main.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
    Jogador jogador = new Jogador("Pelé");
    Jogador jogador1 = new Jogador("Romario");
    Jogador jogador2 = new Jogador("Cafu");
    Jogador[] jogadors = {jogador, jogador1, jogador2};
    for (Jogador jogador3 : jogadors){
        jogador3.imprime();
    }
    }

}
