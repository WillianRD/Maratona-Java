package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest06 {
    public static void main(String[] args) {
        String telefone = "123-456-7890";
        String regex = "[0-9]{3}-[0-9]{3}-[0-9]{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        System.out.println(pattern);
        System.out.println(matcher);

    }
}
