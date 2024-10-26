package main.java.academy.devdojo.javacore.HHeranca.test;

import main.java.academy.devdojo.javacore.HHeranca.dominio.Endereco;
import main.java.academy.devdojo.javacore.HHeranca.dominio.Funcionario;
import main.java.academy.devdojo.javacore.HHeranca.dominio.Pessoa;

public class HerancaTest01{
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Lucas");
        endereco.setCep("09882-050");

        Pessoa pessoa = new Pessoa("WIll");
        pessoa.setCpf("123456789-00");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("-------------------");

        System.out.println("Funcionario");
        Funcionario funcionario = new Funcionario("Will"); // Utilizando o construtor das clases
                                                            // passo o valor da String para o funcionario
        funcionario.setCpf("444444444");                    //Funcionario funcionario = new Funcionario();
        funcionario.setEndereco(endereco);
        funcionario.setSalario(22222);
        funcionario.relatorioDePagamento();
        funcionario.imprime();

    }
}
