package main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.AeroportoSingletonEager;

public class AeroportoSingletonTest01 {
    public static void main(String[] args) {
        compraAssentos("1A");
        compraAssentos("1A");
        AeroportoTest01.compraAssentos("1A");

    }
// Metodo estatico
    private static void compraAssentos(String assentos){
        System.out.println(AeroportoSingletonEager.getInstance());
        //        Criando um Objeto
        AeroportoSingletonEager aeroportoSingletonEager = AeroportoSingletonEager.getInstance();
        System.out.println(aeroportoSingletonEager.comprandoAssentos(assentos));
    }
}
