package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest03 {
    public static void main(String[] args) {
        List enumeros = new ArrayList(10);
        enumeros.add("Will");
        enumeros.add(22);
        enumeros.add(true);
        enumeros.add(22.3);
        enumeros.add(1);
        enumeros.add("Coda Fofo");
        enumeros.add("Marçal");

        System.out.println("Lista sem tipagem de tipo");
        for (Object o : enumeros) {
            System.out.println(o);
        }

        System.out.println("--------------------");
        List<String> enumA = new ArrayList<>(16);
        enumA.add("WIll");
        enumA.add("Coda Fofo");
        enumA.add("Yuri Marçal");
        enumA.add("Leide");
        enumA.add("Guanabara");
        enumA.add("Guanabara da Shoppe");

        System.out.println("Listando todos os nomes");
        for (String o : enumA){
            System.out.println(o);
        }

        System.out.println("Listando todos os nomes na posição :");
        for (int i = 0; i < 1; i++) {
            System.out.println(enumA.get(i));
        }
        System.out.println("-----------------------------");
        System.out.println("Listando tudo da lista");
        for (String thisListIsPerson : enumA) {
            System.out.println(thisListIsPerson);
        }
        System.out.println("----------------------------------");
        System.out.println("Lista de Integer");
        List<Integer> num = new ArrayList<>(2);
        num.add(1);
        num.add(2);

        for (Integer i : num) {
            System.out.println(i);
        }
    }
}
