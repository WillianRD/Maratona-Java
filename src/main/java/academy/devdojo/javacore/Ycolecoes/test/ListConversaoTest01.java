package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);

        Integer[] listToArray = number.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("-------------------------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;


        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(1, 10);

        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(10);
        System.out.println(numerosList);

        // Criando uma lista com valores utilizando o Arrays.asList();
        List<Integer> listTestArrays = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 255);

        for (Integer list : listTestArrays) {
            System.out.println(list);
        }


    }
}
