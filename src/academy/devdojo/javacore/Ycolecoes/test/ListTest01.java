package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(0);
        List<String> nomes2 = new ArrayList<>(0);
        nomes.add("Will");
        nomes.add("DevDojo");
        nomes.add("Will");

        nomes.remove("Will");
        nomes.remove("DevDojo");

        nomes2.add("Willian");
        nomes2.add("Uaii");
        nomes2.add("Will");


        System.out.println(nomes.remove("Will"));
        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-----------");
        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("------------");
        List<Integer> numeros = new ArrayList<>(0);
        numeros.add(121);
        numeros.add(1);
        numeros.add(2);
        numeros.add(5);

        for (int numerosList : numeros) {
            System.out.println(numerosList);
        }

        System.out.println("----------");
        int size1 = numeros.size();
        for (int j = 0; j < size1; j++) {
            System.out.println(numeros.get(j));
        }
    }
}
