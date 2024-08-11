package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Pessoa {
    // Variaveis que são usadas para guardar informações da classe Pessoa
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;
    private double altura;
    private String cabelo;

    //    Criado o método para imprimir os valores
    public void Imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.cpf);
        System.out.println(this.altura);

    }

    //    Método setter que busca o nome da pessoa e faz uma validação caso se for menor
//    que três caracteres, ele imprime uma menssagem de erro
    public void setNome(String nome) {
        if (nome.length() < 3) {
            System.out.println("ERRO: Nome no formato errado");
            return;
        }
        this.nome = nome;
    }

    //    Método para verificar a idade, se for < || = o print mostra o erro
    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("ERRO: Idade Inválida");
            return;
        }
        this.idade = idade;
    }

    //    Método para verificar o CPF, caso seja menor que 11 da um print na tela de erro
    public void setCpf(String cpf) {
        if (cpf.length() < 12) {
            System.out.println("ERRO: Seu CPF não possui a quantidade de caracteres correta");
            return;
        }
        this.cpf = cpf;
    }

    // Caso a altura nãao seja informada, mostra um print na tela de Erro
    public void setAltura(double altura) {
        if (altura == 0) {
            System.out.println("ERRO: Altura não informada");
        }
        this.altura = altura;
    }

    //    Validaçãoa do sexo da class Pessoa, se a
    public void setSexo(String sexo) {
        switch (sexo) {
            case "Masculino":
            case "Feminino":
                break;
            default:
                System.out.println("ERRO: Sexo invalido");
                return;
        }
        this.sexo = sexo;
    }

    public void setCabelo(String cabelo) {
        switch (cabelo) {
            case "Morena":
            case "Loira":
            case "Ruiva":
                this.cabelo = cabelo;
                break;
            default:
                System.out.println("ERRO: Nenhum tipo de cabelo definido");
                return;
        }
        this.cabelo = cabelo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getAltura() {
        return this.altura;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String getCabelo() {
        return this.cabelo;
    }
}

