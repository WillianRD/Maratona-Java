package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class InteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Attack on titan", 19.9D,0));
        mangas.add(new Manga(1L, "Bersek", 19.9D,0));
        mangas.add(new Manga(2L, "Berserk", 12.55D,5));
        mangas.add(new Manga(3L, "Pokemon", 15.6D,2));
        mangas.add(new Manga(5L, "Dragon Ball Z", 10.5D,1));

//        Iterator<Manga> mangaInterator = mangas.iterator();
//        while (mangaInterator.hasNext()){
//            Manga manga = mangaInterator.next();
//            if(manga.getQuantidade() == 0){
//                mangaInterator.remove();

//        remova-se manga.getQuantidade for == 0
//        manga é uma variavel de refêrencia
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
        }

    }
