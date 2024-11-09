package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("APPLE M1",7000);
        Tomate tomate = new Tomate("Tomate siciliano",10);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("____________________________");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");

    }
}
