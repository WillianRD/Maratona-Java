package academy.devdojo.javacore.ZZClambdas.test;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;


public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Will", "Leide", "Yuri");
        List<Integer> integers = List.of(1, 2, 3, 4, 6, 7, 8, 5, 10, 122, 19);

        forEach(strings, (String s) -> System.out.println(s));
        forEach(integers, (Integer i) -> System.out.println(i));
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
