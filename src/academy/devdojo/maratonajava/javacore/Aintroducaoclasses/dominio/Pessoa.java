package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

import java.util.Arrays;

public class Pessoa {
    // Variaveis que são usadas para guardar informações da classe Pessoa
    private String nome, sexo, cpf, cabelo, suaCorFavorita, ImovelPessoal, temCarroOuMoto, corDosOlhos;
    private int idade, verificarQuantidadeDeVeiculos;
    private double altura;

    //    Método setter que busca o nome da pessoa e faz uma validação caso se for menor
    public void setNome(String nome) {
        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            System.out.println("Erro: Formato do nome");
        }
    }

    //    Método para verificar a idade, se for < || = o print mostra o erro
    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade Inválida");
        }
    }

    //    Método para verificar o CPF, caso seja menor que 11 da um print na tela de erro
    public void setCpf(String cpf) {
        if (cpf.length() >= 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF Inválido");
        }
    }

    // Caso a altura não seja informada, mostra um print na tela de Erro
    public void setAltura(double altura) {
        if (altura > 10 && altura < 220) {
            this.altura = altura;
        } else {
            System.out.println("Altura ultrapassou do limite ou altura não informada!");
        }
    }

    public void setSexo(String sexo) {
        switch (sexo) {
            case "Masculino":
                this.sexo = sexo;
            case "Feminino":
                this.sexo = sexo;
                break;
            default:
                System.out.println("ERRO: Sexo invalido");
        }

    }

    public void setCabelo(String cabelo) {
        switch (cabelo) {
            case "Morena":
                this.cabelo = cabelo;
                break;
            case "Loira":
                this.cabelo = cabelo;
                break;
            case "Ruiva":
                this.cabelo = cabelo;
                break;
            default:
                System.out.println("ERRO: Nenhum tipo de cabelo definido");
        }
    }

    public void setCorDosOlhos(String corDosOlhos) {
        String[] CorDosOlhos = new String[]{
                "Castanho Escuros", "Castanhos Claro", "Verde Claro", "Azul Claro", "Azul Escuro", "Avelã", "Preto"
        };
        if (Arrays.asList(CorDosOlhos).contains(corDosOlhos)) {
            this.corDosOlhos = corDosOlhos;
        } else {
            System.out.println("Desculpe, a cor dos olhos não existe");
        }
    }

    public void setSuaCorFavorita(String suaCorFavorita) {
        String[] corFavorita = new String[]{
                "Vermelho", "Azul", "Preto", "Marrom", "Roxo", "Azul Bêbê", "Verde", "Amarelo"
        };
        if (Arrays.asList(corFavorita).contains(suaCorFavorita)) {
            this.suaCorFavorita = suaCorFavorita;
        } else {
            System.out.println("Desculpe, a cor  não é uma opção válida.");
        }
    }

    public void setImovelPessoal(String ImovelPessoal) {
        switch (ImovelPessoal) {
            case "Sim":
                this.ImovelPessoal = ImovelPessoal;
                break;
            case "Não":
                this.ImovelPessoal = ImovelPessoal;
                break;
            default:
                System.out.println("Não reconheci a escolha entre 'Sim' & 'Não' ");
        }
    }

    public void setTemCarroOuMoto(String temCarroOuMoto) {
        switch (temCarroOuMoto) {
            case "Carro":
                this.temCarroOuMoto = temCarroOuMoto;
            case "Moto":
                this.temCarroOuMoto = temCarroOuMoto;
            case "Não Tenho":
                this.temCarroOuMoto = temCarroOuMoto;
                break;
            default:
                System.out.println("Aguardando uma resposta ");
        }
    }

    public void setVerificarQuantidadeDeVeiculos(int verificarQuantidadeDeVeiculos) {
        if (verificarQuantidadeDeVeiculos > 0) {
            this.verificarQuantidadeDeVeiculos = verificarQuantidadeDeVeiculos;
        } else {
            System.out.println(" Quantidade: O valor não pode ser < ou = 0");
        }
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

    public String getSuaCorFavorita() {
        return this.suaCorFavorita;
    }

    public String getCorDosOlgos() {
        return this.corDosOlhos;
    }

    public String getImovelPessoal() {
        return this.ImovelPessoal;
    }

    public String getTemCarroOuMoto() {
        return this.temCarroOuMoto;
    }

    public int getVerificarQuantidadeDeVeiculos() {
        return this.verificarQuantidadeDeVeiculos;
    }
}