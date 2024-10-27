package main.javacore.Ycolecoes.test;

import main.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Attack on titan", 19.9D));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 21.99D));
        mangas.add(new Manga(2L, "Berserk", 12.55D));
        mangas.add(new Manga(3L, "Pokemon", 15.6D));
        mangas.add(new Manga(5L, "Dragon Ball Z", 10.5D));
        for(Manga manga : mangas){
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("_________________________________________________");
        for( Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
