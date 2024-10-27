package main.javacore.HHeranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    //  Construtor da classe Pessoa
    public Pessoa(String nome) { //String nome = Argumento
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome; // Retorna o valor para a Class Funcionario
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.endereco.getRua("") + " " + "CEP " + this.endereco.getCep());
        System.out.println(this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}