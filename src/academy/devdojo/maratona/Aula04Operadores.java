package academy.devdojo.maratona;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero2 = 20;
        double resultado = numero01 / (double) numero2;
        System.out.println(resultado);

        //%
        int resto = 21 % 7;
        System.out.println(resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezResultado = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezResultado: " + isDezResultado);
        System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);

        //Operadores lógicos
        // && (AND) || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrintaa = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;
        System.out.println("isDentroDaLeiMaiorQueTrintaa " + isDentroDaLeiMaiorQueTrintaa);
        System.out.println("isDentroDaLeiMenorQueTrinta" + isDentroDaLeiMenorQueTrinta);

        //Or
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlastation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlastation || valorTotalContaPoupanca > valorPlastation;
        System.out.println("isPlaystationCincoCompravel "+ isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador +=1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);

    }
}
