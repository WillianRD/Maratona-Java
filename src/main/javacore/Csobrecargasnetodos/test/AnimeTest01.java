package main.javacore.Csobrecargasnetodos.test;

import main.javacore.Csobrecargasnetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akuma", "TV",29);
        anime.imprime();
        System.out.println("---------------------");
        anime.init("Naruto & Goku","YouTube",29,"Aventura");
        anime.imprime();
    }
}
