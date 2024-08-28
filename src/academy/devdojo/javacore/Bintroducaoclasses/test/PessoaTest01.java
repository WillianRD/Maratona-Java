package academy.devdojo.javacore.Bintroducaoclasses.test;

import academy.devdojo.javacore.Bintroducaoclasses.dominio.Carros;
import academy.devdojo.javacore.Bintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Will", "Masculino" , "Ruiva" , "Vermelho" , "Sim" , "Carro" ,
                "Azul" , 20 , 10 , 220);
        System.out.println(pessoa.toString());
//        pessoa.setNome("Will");
//        pessoa.setIdade(99);
//        pessoa.setCpf("12345678900");
//        pessoa.setAltura(220);
//        pessoa.setSexo("Feminino");
//        pessoa.setCabelo("Ruiva");
//        pessoa.setSuaCorFavorita("Vermelho");
//        pessoa.setCorDosOlhos("Azul Claro");
//        pessoa.setImovelPessoal("Sim");
//        pessoa.setTemCarroOuMoto("Carro");
//        pessoa.setVerificarQuantidadeDeVeiculos(5);

        // Herança com a Class Pessoa, Utilizando a class Carros
//        Carros carros = new Carros();
//        carros.setAno(2021);

        System.out.println("--------------------------------");
        System.out.println("Registro de Pessoa");
        System.out.println("Seu nome: "+pessoa.getNome() + "\n" +"Sua idade: "+pessoa.getIdade() + "\n" + "Seu CPF: "+pessoa.getCpf());
        System.out.println("Sua Altura é: "+pessoa.getAltura() + "\n" + "Seu sexo: " +pessoa.getSexo() + "\n" + "Seu tipo de cabelo é: "+pessoa.getCabelo());
        System.out.println("Sua cor Favorita é: "+pessoa.getSuaCorFavorita() + "\n" + "Sua cor dos olhos é: "+pessoa.getCorDosOlhos());
        System.out.println("Você tem imovel:" + pessoa.getImovelPessoal() + "\n" + "Você tem Carro ou Moto: " +pessoa.getTemCarroOuMoto());
        System.out.println("Quantidade De Veículos: "+pessoa.getVerificarQuantidadeDeVeiculos());

//        System.out.println("---------------");
//        System.out.println("Modelo Do Carro " + carros.getAno());
    }
}