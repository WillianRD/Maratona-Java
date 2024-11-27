package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest02 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(1L, "Attack on titan", 19.9D,2));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 21.99D,5));
        mangas.add(new Manga(2L, "Berserk", 12.55D,5));
        mangas.add(new Manga(3L, "Pokemon", 15.6D,2));
        mangas.add(new Manga(5L, "Dragon Ball Z", 10.5D,2));
        mangas.add(new Manga(5L, "Dragon Ball Z", 10.5D,2));

        for (Manga ma : mangas){
            System.out.println(ma);
        }
    }
}
