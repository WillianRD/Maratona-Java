package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "ababa";
        String texto2 = "abababa";

        String procurarEmail = "@gmail.com";
        String email = "Willian@gmail.com";

        Pattern pattern1 = Pattern.compile(procurarEmail);
        Matcher matcherRegexEmail = pattern1.matcher(email);

        System.out.println(email);
        System.out.println(procurarEmail);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto " + texto2);
        System.out.println("Indice 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");

        while (matcherRegexEmail.find()){
            System.out.print(matcherRegexEmail.start() + " " + matcherRegexEmail.group() + "\n");
        }
    }
}
