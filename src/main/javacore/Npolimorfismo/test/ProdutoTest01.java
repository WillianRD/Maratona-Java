package main.javacore.Npolimorfismo.test;

import main.javacore.Npolimorfismo.dominio.Computador;
import main.javacore.Npolimorfismo.dominio.Tomate;
import main.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("APPLE M1",7000);
        Tomate tomate = new Tomate("Tomate siciliano",10);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
