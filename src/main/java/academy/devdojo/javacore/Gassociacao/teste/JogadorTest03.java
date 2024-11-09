package academy.devdojo.javacore.Gassociacao.teste;

import academy.devdojo.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Willian");
        Jogador jogador1 = new Jogador("Leide");
        Jogador jogador2 = new Jogador("Yuri");

        Time time = new Time("Brasil");
        Time timeSP = new Time("São Paulo - Futebol Club");
        Time time1 = new Time("Palmeiras");

        Jogador[] jogadores = {jogador, jogador1, jogador2};

        jogador.setTime(time);
        time.setJogadores(jogadores);
        jogador.imprime();

        jogador1.setTime(timeSP);
        timeSP.setJogadores(jogadores);
        jogador1.imprime();

        jogador2.setTime(time1);
        time1.setJogadores(jogadores);
        jogador2.imprime();
    }
}
