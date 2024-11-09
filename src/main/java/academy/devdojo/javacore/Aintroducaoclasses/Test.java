package academy.devdojo.javacore.Aintroducaoclasses;

public class Test {
    public static void main(String[] args) {
        int idade = 123;
        String timeDoCoracao = "São Paulo Futebol Club";
        String nome = "Leide";
        String rival = "Palmeiras";
        double salario = 50000;
        int nota = 70;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Time: " + timeDoCoracao);
        System.out.println("Time: " + rival);
        System.out.println("Salário: " + salario);

        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 100.");
        } else if (nota >= 90) {
            System.out.println("Classificação: Excelente");
        } else if (nota >= 70) {
            System.out.println("Classificação: " + (nota >= 80 ? "Muito Bom" : "Bom"));
        } else if (nota >= 50) {
            System.out.println("Classificação: " + (nota >= 60 ? "Satisfatório" : "Regular"));
        } else {
            System.out.println("Classificação: Insuficiente");
        }

    }
}
//        CTRL + SHIFT + F10 - EXECUTAR
