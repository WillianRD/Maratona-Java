package academy.devdojo.javacore.Npolimorfismo.servico;

import academy.devdojo.javacore.Npolimorfismo.dominio.Produto;

public class CalculadoraImposto {

//    public static void calcularImpostoComputador(Computador computador){
//        System.out.println("Relatorio de imposto do Computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador: " + computador.getNome());
//        System.out.println("Imposto a ser pago: " + imposto);
//    }
//    public static void calcularImpostoTomate(Tomate tomate){
//        System.out.println("Relatorio de imposto do Tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate: " + tomate.getNome());
//        System.out.println("Imposto a ser pago: " + imposto);
//    }

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " +produto.getValor());
        System.out.println("Imposto a ser pago: " + produto.calcularImposto());
    }
}
