package main.javacore.Aintroducaoclasses;

public class Aula07Arraays02 {
    public static void main(String[] args) {
        //  byte, short, int, long, float e double 0
        // char '\u0000 ' ' '
        // boolean false
        // String null

        String [] nomes = new String[3];
        nomes [0] = "Goku";
        nomes [1] = "Sah";
        nomes [2] = "Will";

        for (int i = 0;i < nomes.length;i++){
            System.out.println(nomes[i]);
        }
    }
}
