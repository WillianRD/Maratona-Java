package main.javacore.Ycolecoes.test;

import main.javacore.Ycolecoes.dominio.Consumidor;
import main.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTeste02{
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Will");
        Consumidor consumidor2 = new Consumidor("Willian");
//        System.out.println(consumidor);
//        System.out.println(consumidor2);

        Manga manga = new Manga(2L,"Attack of Titan",20.3,1);
        Manga manga2 = new Manga(2L,"Naruto",20.1,4);
        Manga manga3 = new Manga(2L,"Goku",20.99,5);
        Manga manga4 = new Manga(2L,"Pokemon",211.22,12);

        Map<Consumidor,Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor,manga);
        consumidorManga.put(consumidor2,manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " +entry.getValue().getNome());
        }
    }
}
