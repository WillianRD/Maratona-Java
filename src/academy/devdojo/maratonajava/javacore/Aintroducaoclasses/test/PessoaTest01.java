package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ana");
        pessoa.setIdade(20);
        pessoa.setCpf("123456789-00");
        pessoa.setAltura(1.83);
        pessoa.setSexo("Feminino");
        pessoa.setCabelo("Ruiva");
        pessoa.setSuaCorFavorita("Azul");
        pessoa.setCorDosOlgos("Castanhos Escuros");
        pessoa.setImovelPessoal("Sim");
        pessoa.setTemCarroOuMoto("Carro");
        pessoa.setVerificarQuantidadeDeVeiculos(5);

        System.out.println("--------------------------------");
        System.out.println("Registro de Pessoa");
        System.out.println("Seu nome: "+pessoa.getNome() + "\n" +"Sua idade: "+pessoa.getIdade() + "\n" + "Seu CPF: "+pessoa.getCpf());
        System.out.println("Sua Altura é: "+pessoa.getAltura() + "\n" + "Seu sexo: " +pessoa.getSexo() + "\n" + "Seu tipo de cabelo é: "+pessoa.getCabelo());
        System.out.println("Sua cor Favorita é: "+pessoa.getSuaCorFavorita() + "\n" + "Sua cor dos olhos é: "+pessoa.getCorDosOlgos());
        System.out.println("Você tem imovel:" + pessoa.getImovelPessoal() + "\n" + "Você tem Carro ou Moto: " +pessoa.getTemCarroOuMoto() + "\n" + "Quantidade De Veículos: "+pessoa.getVerificarQuantidadeDeVeiculos());
    }
}