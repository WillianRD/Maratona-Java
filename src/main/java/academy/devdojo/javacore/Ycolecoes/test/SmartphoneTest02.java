package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SmartphoneTest02 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1222", "Lg");
        Smartphone s2 = new Smartphone("222", "Xiaomi");
        Smartphone s3 = new Smartphone("1111", "Iphone");

        List<Smartphone> smartphones = new ArrayList<>(10);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        List<String> strigList = new ArrayList<>(3);
        strigList.add("Will");
        strigList.add("Yuri");
        strigList.add("Coda Fofo");

        Collections.sort(strigList);
        System.out.println(strigList);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("1112221", "Iphone");

        System.out.println(smartphones.contains(s4));

        int indexSmartphoneS4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphoneS4);

        System.out.println(smartphones.get(2));

    }
}
