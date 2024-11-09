package academy.devdojo.javacore.lclassesabstratas.test;

import academy.devdojo.javacore.lclassesabstratas.dominio.Chefe;
import academy.devdojo.javacore.lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.javacore.lclassesabstratas.dominio.Fundador;
import academy.devdojo.javacore.lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Yuri", 8000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Leide", 16000, 10, "Python, Java");
        Fundador fundador = new Fundador("Willian", 50000, "CEO", 14, 3, 700);
        Chefe chefe = new Chefe("Joh", 5200, "Produção", 10, "Atua como");

        gerente.imprime();
        System.out.println("---------------");

        desenvolvedor.imprime();
        System.out.println("---------------");

        fundador.imprime();
        System.out.println("---------------");

        chefe.imprime();
        System.out.println("---------------");

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        System.out.println(fundador);
        System.out.println(chefe);
    }
}
