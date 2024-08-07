package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Willian");
        pessoa.setIdade(20);
        pessoa.setCpf(401);
        pessoa.setAltura(120);
        pessoa.sexo('M');
        //  pessoa.Imprime();
        System.out.println("Seu nome: " +pessoa.getNome());
        System.out.println("Sua idade: " +pessoa.getIdade());
        System.out.println("Seu CPF: " +pessoa.getCpf());
        System.out.println("Sua Altura: " +pessoa.getAltura());
        System.out.println("Seu sexo é: "+pessoa.getSexo());
    }
}