package academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.AeroportoSingletonEager;

public class AeroportoTest01 {
    public static void main(String[] args) {
        compraAssentos("1A");
        compraAssentos("1A");

    }

    // Metodo estatico
    static void compraAssentos(String assentos) {
        System.out.println(AeroportoSingletonEager.getInstance());
//        Criando um Objeto
//        Aeroporto aeroporto = new Aeroporto("788-900");
//        System.out.println(aeroporto.comprandoAssentos(assentos));
    }
}
