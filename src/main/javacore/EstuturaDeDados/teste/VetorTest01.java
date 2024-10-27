package main.javacore.EstuturaDeDados.teste;

import main.javacore.EstuturaDeDados.dominio.Vetor;

public class VetorTest01 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(100);
            vetor.adicionarElemento("Willian ");
            vetor.adicionarElemento("Leide");
            vetor.adicionarElemento("Yuri");
        System.out.println(vetor.toString());
    }
}
