package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    public char sexo;
    private int cpf;
    private int altura;
//    private int cabelo;
//    private String corDaPele;
//    private String olhos;

    public void Imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.cpf);
        System.out.println(this.altura);
        System.out.println(this.sexo);
    }

    public void setNome(String nome) {
        if (nome.length() < 3) {
            System.out.println("NOME: Seu usuário tem que ter no minimo três caracteres ");
            return;
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("IDADE: Idade Inválida");
            return;
        }
        this.idade = idade;
    }

    public void setCpf(int cpf) {
        if (cpf <= 11) {
            System.out.println("Seu CPF não pode estar vazio ");
        }
        this.cpf = 0;
    }

    public void setAltura(int altura) {
        if (altura == 0) {
            System.out.println("Altura não informada");
        }
        this.altura = 120;
    }

    public void setSexo(char sexo) {
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;

            default:
                System.out.println("Sexo invalido");
        }
        this.sexo = sexo;
    }

    public void setCabelo(byte cabelo) {
        switch (cabelo) {
            case 1:
                System.out.println("Morena");
                break;
            case 2:
                System.out.println("Loira");
                break;
            case 3:
                System.out.println("Ruiva");
                break;
            default:
                System.out.println("Nenhum definido");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public char getSexo() {
        return this.sexo;
    }

    public int getCpf() {
        return this.cpf;
    }

    public int getAltura() {
        return this.altura;
    }

    public char sexo(char m) {
        return this.sexo;
    }
}