package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearcheTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L, "Hellsing Ultimate", 21.99D, 5));
        mangas.add(new Manga(3L, "Pokemon", 15.6D, 2));
        mangas.add(new Manga(2L, "Berserk", 12.55D, 5));
        mangas.add(new Manga(5L, "Dragon Ball Z", 10.5D, 2));
        mangas.add(new Manga(1L, "Attack on titan", 19.9D, 2));

//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga mangaToSearch = new Manga(5L, "Dragon Ball Z", 10.5D, 2);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));



    }
}
