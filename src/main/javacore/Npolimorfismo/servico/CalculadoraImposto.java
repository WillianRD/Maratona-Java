package main.javacore.Npolimorfismo.servico;

import main.javacore.Npolimorfismo.dominio.Computador;
import main.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Imposto a ser pago: " + imposto);
    }
    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
