package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearcheTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(4);
        numbers.add(5);
        // (-(ponto de inserção)-1)
        // index 0,1,2,3,4
        // value 1,2,4,5,7

        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(Collections.binarySearch(numbers, 10));
    }
}
