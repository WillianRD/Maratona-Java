package academy.devdojo.javacore.Eblocosinicializacao.test;

import academy.devdojo.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One ");

        for (int episodiosAnime : anime.getEpisodios()) {
            System.out.println("Episodio " + episodiosAnime + " ");
        }
    }
}
