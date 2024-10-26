/*
Class Calculadora, realizar calculos com adição, subtração, multiplicacação e divisão
Isso e para mostrar meu conhecimento em Java, com classs, atributos, métodos modificadores de acesso
 */
package main.java.academy.devdojo.javacore.PegandoOJeito;

import java.util.Scanner;

public class Operadores {
    private static int num1;
    private static int num2;
    private static int resultado;
    private static byte usuarioAdicionarValor;
    private static  Scanner in = new Scanner(System.in);

    public static void calcularSoma() {
        System.out.println("Você solicitou a função Soma");

        System.out.println("Digite um número para a Soma");
        num1 = in.nextInt();

        System.out.println("Digite um segundo número para a Soma");
        num2 = in.nextInt();

        resultado = num1 + num2;
        System.out.println("O valor inserido da soma é " + num1  + " + " +  num2 + " : " + resultado);
    }

    public static void calcularSubtracao() {
        System.out.println("Você solicitou a função subtração");

        System.out.println("Digite um número para a Subtração");
        num1 = in.nextInt();

        System.out.println("Digite o segundo número para a Subtração");
        num2 = in.nextInt();

        resultado = num1 - num2;
        System.out.println("O valor inserido para a subtração é " + num1 + " - " + num2 + " : " + resultado);
    }

    public static void calcularDivisao() {
        System.out.println("Você solicitou a função divisão");

        System.out.println("Digite um número para calcular a divisão");
        num1 = in.nextInt();

        System.out.println("Digite o segundo número para a divisão");
        num2 = in.nextInt();

        resultado = num1 / num2;
        System.out.println("O valor inserido para a divisão é: " + num1 + " ÷ " + num2 + " : " + resultado);

    }

    public static void calcularMultiplicacao() {
        System.out.println("Você solicitou a função multiplicação");

        System.out.println("Digite um número para a multiplicação");
        num1 = in.nextInt();

        System.out.println("Digite o segundo número para a multiplicação");
        num2 = in.nextInt();

        resultado = num1 * num2;
        System.out.println("O valor inserido para a multiplicação é: " + num1 + " x " + num2 + " : " + resultado);
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("--------------");
            System.out.println(
                    "Faça a escolha da sua Operação Matématica " + "\n"
                    + "1. Soma " + "\n"
                    + "2. Sub " + "\n"
                    + "3. Divisão " + "\n"
                    + "4. Multiplicação" + "\n"
                    + "5. Sair" + "\n");

            usuarioAdicionarValor = in.nextByte();

            switch (usuarioAdicionarValor) {
                case 1:
                    calcularSoma();
                    break;
                case 2:
                    calcularSubtracao();
                    break;
                case 3:
                    calcularDivisao();
                    break;
                case 4:
                    calcularMultiplicacao();
                    break;
                case 5:
                        System.out.println("Saindo...");
                        return;
                default:
                    System.out.println("Por favor, faça a escolha conforme solicitado pelo sistema:");
            }

        }
    }
}