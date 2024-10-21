package academy.devdojo.javacore.Bintroducaoclasses.test;

import academy.devdojo.javacore.Bintroducaoclasses.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divedeDoisNumeros(20,2);
        System.out.println(resultado);
    }
}
