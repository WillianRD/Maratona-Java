package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
//        return manga1.getID().compareTo(manga2.getID());
//        return manga1.getNome().compareTo(manga2.getNome());
        return Double.valueOf(manga1.getPreco()).compareTo(manga2.getPreco());
    }

}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L, "Hellsing Ultimate", 21.99D, 5));
        mangas.add(new Manga(3L, "Pokemon", 15.6D, 2));
        mangas.add(new Manga(2L, "Berserk", 12.55D, 5));
        mangas.add(new Manga(5L, "Dragon Ball Z", 10.5D, 2));
        mangas.add(new Manga(1L, "Attack on titan", 19.9D, 2));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        Collections.sort(mangas);
        System.out.println("_________________Collections________________________________");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas, new MangaByIdComparator());
        System.out.println("_________________________________________________");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
