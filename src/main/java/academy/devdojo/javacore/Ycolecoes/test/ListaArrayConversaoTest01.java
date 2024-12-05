package academy.devdojo.javacore.Ycolecoes.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer [] numerosToArrays = numeros.toArray(new Integer[0]);

        System.out.println("List: " + numeros);
        System.out.println("ArraysList: " + Arrays.toString(numerosToArrays));

        Integer[] numeroArray = new Integer[4];
        numeroArray[0] = 1;
        numeroArray[1] = 2;
        numeroArray[2] = 3;
        numeroArray[3] = 4;

        List<Integer> arraysToList = Arrays.asList(numeroArray);
        arraysToList.set(0,12);

        System.out.println("List To Integer: " + Arrays.toString(numeroArray));
        System.out.println("Arrays to List: " + arraysToList);

        System.out.println("--------------------------------------");

        // Criando uma nova lista pora realizar alteração/criar
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numeroArray));
        numerosList.add(15);

        System.out.println(numerosList);

        // Criando uma lista com valores direto, lista atual é imutável
        List<Integer> numerosNaLista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Numero criado direto na lista: " + numerosNaLista);
    }
}
