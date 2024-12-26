package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = Tudo que não for digitos
        // \s = Espaços em brancos
        // \S = Todos os caracteres excluindo os brancosa
        // \w = a-ZA-ZA, digitos
        // \W = tudo o que não é incluso

        String regex ="0[xX][0-9a-fA-F]";
//        String texto = "ababa";
        String texto2 = "12 0x 0X 0xFFABC 0x109 ox1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto " + texto2);
        System.out.println("Indice 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
