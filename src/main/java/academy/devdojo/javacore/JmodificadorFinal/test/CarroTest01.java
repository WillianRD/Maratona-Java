package academy.devdojo.javacore.JmodificadorFinal.test;

import academy.devdojo.javacore.JmodificadorFinal.domimio.Carro;
import academy.devdojo.javacore.JmodificadorFinal.domimio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
     Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("Capitão");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo Ferrari");
        ferrari.imprime();
    }
}
