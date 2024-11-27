package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmaartphoneMarcaCompartor implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmaartphoneMarcaCompartor());
        Smartphone smartphone = new Smartphone("2221", "Iphone");
        set.add(smartphone);
        System.out.println(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(1L, "Attack on titan", 19.9D,2));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 21.99D,5));
        mangas.add(new Manga(2L, "Berserk", 12.55D,5));
        mangas.add(new Manga(3L, "Pokemon", 15.6D,2));
        mangas.add(new Manga(5L, "Dragon Ball Z", 10.5D,2));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
