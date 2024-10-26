package main.java.academy.devdojo.javacore.Bintroducaoclasses.test;

import main.java.academy.devdojo.javacore.Bintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Wilian"); //Check
        pessoa.setIdade(50); // Check
        pessoa.setCpf("12345678900"); // Check
        pessoa.setAltura(2.37); // Check
        pessoa.setSexo("Masculino"); // Check
        pessoa.setCabelo("Cabelo Liso"); // Check
        pessoa.setSuaCorFavorita("Vermelho"); // Check
        pessoa.setCorDosOlhos("Azul Escuro"); // Check
        pessoa.setimovelPessoal("Sim");
        pessoa.setTemCarroOuMoto("Carro");
        pessoa.setVerificarQuantidadeDeVeiculos(5);

        System.out.println("--------------------------------");
        System.out.println("Registro de Pessoa");
        System.out.println("Seu nome: "+pessoa.getNome() + "\n" +"Sua idade: "+pessoa.getIdade() + "\n" + "Seu CPF: "+pessoa.getCpf());
        System.out.println("Sua Altura é: "+pessoa.getAltura() + "cm" + "\n" + "Seu sexo: " +pessoa.getSexo() + "\n" + "Seu tipo de cabelo é: "+pessoa.getCabelo());
        System.out.println("Sua cor Favorita é: "+pessoa.getSuaCorFavorita() + "\n" + "Sua cor dos olhos é: "+pessoa.getCorDosOlhos());
        System.out.println("Você tem imovel:" + pessoa.getImovelPessoal() + "\n" + "Você tem Carro ou Moto: " +pessoa.getTemCarroOuMoto());
        System.out.println("Quantidade De Veículos: "+pessoa.getVerificarQuantidadeDeVeiculos());
    }
}