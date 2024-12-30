package academy.devdojo.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = Tudo que não for digitos
        // \s = Espaços em brancos
        // \S = Todos os caracteres excluindo os brancosa
        // \w = a-ZA-ZA, digitos
        // \W = tudo o que não é incluso
        // [] -
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () - Agrupamento
        // | ou (v|o) enconte v ou o
        // $ - fim da linha

        String regex ="([a-zA-Z0-9._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "willian@gmail.com, 123joao@gmail.com, @#zoro@mail.com, teste@gmail.com.br";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Email válido");
        System.out.println("zoro@mail.com".matches(regex));

        System.out.println("Mostrando todos os emails cadastrados: "+ "\n" + Arrays.toString(texto.split(",")) + "\n");
        System.out.println("Email especifico " + texto.split(",")[1].trim());
        System.out.println("\n");
        System.out.println("Texto " + texto);
        System.out.println("Indice 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+'\n');
        }
    }
}

