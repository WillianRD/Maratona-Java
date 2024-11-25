package academy.devdojo.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List <String> names = List.of("Willian","Leide","Yuri");
        List<Integer> numbers = map(names,(String s) -> s.length());
        List<String> namesUpperCase = map(names,s -> s.toUpperCase());
        List<String> namesLowerCase = map(names,s -> s.toLowerCase());

        System.out.println(names);
        System.out.println(numbers);
        System.out.println(namesUpperCase);
        System.out.println(namesLowerCase);
    }

    public static <T,R> List<R> map (List<T> list, Function<T,R> function){
        List<R> resultado = new ArrayList<>();
        for (T e : list){
            R r = function.apply(e);
            resultado.add(r);
        }
        return resultado;
    }
}
