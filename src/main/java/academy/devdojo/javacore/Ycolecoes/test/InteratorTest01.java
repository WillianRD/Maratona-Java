package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(1L, "Attack on titan", 19.9D, 0));
        mangas.add(new Manga(1L, "Bersek", 19.9D, 0));
        mangas.add(new Manga(2L, "Berserk", 12.55D, 0));
        mangas.add(new Manga(3L, "Pokemon", 15.6D, 0));
        mangas.add(new Manga(5L, "Dragon Ball Z", 10.5D, 0));

//        Iterator<Manga> mangaInterator = mangas.iterator();
//        while (mangaInterator.hasNext()) {
//            Manga manga = mangaInterator.next();
//            if (manga.getQuantidade() == 0) {
//                mangaInterator.remove();
//                    System.out.println(manga);
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
        if (mangas.size()<= 0) {
            throw new RuntimeException("Mangas sem quantidade");
        }

    }
}
