package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Will");
        pessoa.setIdade(20);
//        pessoa.Imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}