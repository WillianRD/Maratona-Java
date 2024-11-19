package academy.devdojo.javacore.Ycolecoes.test;

import java.util.*;

public class ListTest03 {
    public static void main(String[] args) {
        ListTest03 ls = new ListTest03();
        ls.listaComNomesTipados();

    }

    public void listSemTipagem() {
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
    }

    public void listaComNomesTipados() {
        List<String> enumA = new ArrayList<>(16);
        enumA.add("WIll");
        enumA.add("WIll");
        enumA.add("Coda Fofo");
        enumA.add("Yuri Marçal");
        enumA.add("Leide");
        enumA.add("Guanabara");
        enumA.add("Guanabara da Shoppe");

        Collections.sort(enumA);
        System.out.println(enumA);

        System.out.println("Listando todos os nomes");

        // Lista sem duplicidade de nomes
        Set<String> semDuplicidade = new HashSet<>(enumA);

        // Voltando para lista
        List<String> convertendoParaLista = new ArrayList<>(semDuplicidade);

        Collections.sort(convertendoParaLista);
        System.out.println("Alterando Duplicidade: " + convertendoParaLista);

        for (String o : enumA) {
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

    }


    public void listInteger() {
        System.out.println("Lista de Integer");
        List<Integer> num = new ArrayList<>(2);
        num.add(1);
        num.add(2);

        for (Integer i : num) {
            System.out.println(i);
        }

    }
}
