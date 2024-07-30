package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Pessoa {
    private String nome;
    private int idade;


    public void Imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        if(nome.length() <= 3){
            System.out.println("Seu usuário tem que ter no minimo três caracteres ");
            return;
        }
        this.nome = nome;
    }
// Setar uma idade + validação do método
    public void setIdade(int idade){
        if(idade <= 0){
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = idade;
    }
//    Retornando o valor do nome
    public String getNome(){
        return this.nome;
    }

    //    Retornando o valor da idade
    public int getIdade(){
        return this.idade;

    }
}
