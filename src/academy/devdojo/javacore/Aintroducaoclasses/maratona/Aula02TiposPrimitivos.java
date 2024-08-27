package academy.devdojo.javacore.Aintroducaoclasses.maratona;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //in, double, float, char, byte, short, lang, boolean
        int idade = (int) 10000000L;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = (float )2500.0D;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "will";

        System.out.println("A idade é "+ idade +" anos");
        System.out.println(falso);
        System.out.println("char "+ caractere);
        System.out.println(numeroGrande);
        System.out.println("Oii, meu nome é, "+ nome);

    }
}
