package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        System.out.println("LISTA DE ERROS");

        pessoa.setNome("ana");
        pessoa.setIdade(1);
        pessoa.setCpf("123456789-00");
        pessoa.setAltura(1.83);
        pessoa.setSexo("Masculino");
        pessoa.setCabelo("Ruiva");

        System.out.println("---------------------------");
        System.out.println("Seu nome: "+pessoa.getNome());
        System.out.println("Sua idade: "+pessoa.getIdade());
        System.out.println("Seu CPF: "+pessoa.getCpf());
        System.out.println("Sua Altura é: "+pessoa.getAltura());
        System.out.println("Seu sexo: " +pessoa.getSexo());
        System.out.println("Seu tipo de cabelo é: "+pessoa.getCabelo());
    }
}