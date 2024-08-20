package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ana");
        pessoa.setIdade(1);
        pessoa.setCpf("123456789-00");
        pessoa.setAltura(190);
        pessoa.setSexo("Feminino");
        pessoa.setCabelo("Ruiva");
        pessoa.setSuaCorFavorita("Vermelho");
        pessoa.setCorDosOlhos("Castanhos Claro");
        pessoa.setImovelPessoal("Sim");
        pessoa.setTemCarroOuMoto("Carro");
        pessoa.setVerificarQuantidadeDeVeiculos(5);

        System.out.println("--------------------------------");
        System.out.println("Registro de Pessoa");
        System.out.println("Seu nome: "+pessoa.getNome() + "\n" +"Sua idade: "+pessoa.getIdade() + "\n" + "Seu CPF: "+pessoa.getCpf());
        System.out.println("Sua Altura é: "+pessoa.getAltura() + "\n" + "Seu sexo: " +pessoa.getSexo());
        System.out.println("Seu tipo de cabelo é: " +pessoa.getCabelo() + "\n" + "Sua cor Favorita é: "+pessoa.getSuaCorFavorita() );
        System.out.println("Sua cor dos olhos é: "+pessoa.getCorDosOlgos() + "\n" + "Você tem imovel:" + pessoa.getImovelPessoal() + "\n" + "Você tem Carro ou Moto: ");
        System.out.println("Quantidade De Veículos: "+pessoa.getVerificarQuantidadeDeVeiculos());
    }
}