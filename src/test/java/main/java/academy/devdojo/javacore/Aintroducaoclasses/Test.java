package main.java.academy.devdojo.javacore.Aintroducaoclasses;

public class Test {
    public static void main(String[] args) {
        int idade = 15;
        String timeDoCoracao = "São Paulo Futebol Club";
        String nome = "Leide";
        String rival = "Palmeiras";
        double salario = 50000;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Time: " + timeDoCoracao);
        System.out.println("Time: " + rival);
        System.out.println("Salário: " + salario);

        if (idade >= 18 || idade >= 120) { System.out.println("Maior de idade"); }
        if (idade >0 && idade < 18){ System.out.println("Menor de idade"); }
        if (idade <= 0){ System.out.println("Idade não pode ser negativa");}
        if (salario > 5000){ System.out.println("Ganhando muito bem");}
        if(salario < 5000){    System.out.println("Ganhando pouco");}

    }
}
//        CTRL + SHIFT + F10 - EXECUTAR
