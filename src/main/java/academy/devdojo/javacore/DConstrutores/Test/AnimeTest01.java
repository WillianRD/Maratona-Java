package academy.devdojo.javacore.DConstrutores.Test;

import academy.devdojo.javacore.DConstrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball","Toppo ","A","shounen" , "SP");
        Anime anime1 = new Anime("Leide","Desevolvedora Front-End ","aa",
                "Mulher" , "Tentando " + "não matar o Yuri & Will");
        anime.imprime();
        anime1.imprime();


    }
}
