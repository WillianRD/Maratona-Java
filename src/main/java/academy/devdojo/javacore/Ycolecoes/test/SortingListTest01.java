package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(-10L, "Attack on titan", 19.9D, 2));
        mangas.add(new Manga(0L, "Hellsing Ultimate", 21.99D, 5));
        mangas.add(new Manga(2L, "Berserk", 12.55D, 5));
        mangas.add(new Manga(3L, "Pokemon", 15.6D, 2));
        mangas.add(new Manga(5L, "Dragon Ball Z", 10.5D, 2));

        Collections.sort(mangas);
        System.out.println(mangas);
        System.out.println("---------------------------------");
        for (Manga i : mangas){
            System.out.println(i);
        }

    }
}