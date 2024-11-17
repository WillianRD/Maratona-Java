package academy.devdojo.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texts = "Leide, Yuri, Will";
        String [] names = texts.split(",");
        for (String name : names){
            System.out.println(name.trim());
        }
    }
}
