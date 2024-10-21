package academy.devdojo.javacore.EstuturaDeDados.teste;

import academy.devdojo.javacore.EstuturaDeDados.dominio.Vetor;

public class VetorTest01 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);
            vetor.adicionarElemento("Elemento 1");
            vetor.adicionarElemento("Elemento 2");
        System.out.println(vetor.toString());
    }
}
