package academy.devdojo.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texts = "Leide, Yuri, Will";
        Scanner in = new Scanner(texts);
        in.useDelimiter(",");

        while (in.hasNext()){
            System.out.println(in.next());
        }
        }
    }

