package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = Tudo que não for digitos
        // \s = Espaços em brancos
        // \S = Todos os caracteres excluindo os brancosa
        // \w = a-ZA-ZA, digitos
        // \W = tudo o que não é incluso

        String regex = "\\W";
        String texto = "ababa";
        String texto2 = "aa@_l2213Lw wassd san";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto " + texto2);
        System.out.println("Indice 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() +"\n");
        }
    }
}
