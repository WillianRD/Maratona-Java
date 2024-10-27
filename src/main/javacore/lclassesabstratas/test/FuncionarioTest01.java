package main.javacore.lclassesabstratas.test;

import main.javacore.lclassesabstratas.dominio.Desenvolvedor;
import main.javacore.lclassesabstratas.dominio.Fundador;
import main.javacore.lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Yuri", 8000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Leide", 16000,10,"Python, Java");
        Fundador fundador = new Fundador("Willian", 50000,"CEO",14,3,700);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        System.out.println(fundador);
    }
}
