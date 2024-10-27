package main.javacore.Bintroducaoclasses.dominio;

import java.util.Arrays;

public class Pessoa {
    private String nome, sexo, cpf, cabelo, imovelPessoal, temCarroOuMoto, suaCorFavorita, corDosOlhos;
    private int idade, verificarQuantidadeDeVeiculos;
    private double altura;  

    public void setNome(String nome) {
        if (nome.length() >= 2) {
            this.nome = nome;
        } else {
            throw new RuntimeException("Verificação de Login Inválida");
        }
    }

    public void setIdade(int idade) throws IllegalArgumentException {
        if (idade <= 0 || idade < 128) {
            this.idade = idade;
        } else {
            throw new RuntimeException("Idade Inválida");
        }
    }

    public void setCpf(String cpf) throws IllegalArgumentException {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            throw new RuntimeException("O campo CPF é obrigatório.");
        }
    }

    public void setAltura(double altura) {
        if (altura > 10F || altura <= 2.55) {
            this.altura = altura;
        } else {
            throw new RuntimeException("Altura ultrapassou do limite ou altura não informada!");
        }
    }

    public void setSexo(String sexo) {
        switch (sexo) {
            case "Masculino":
                this.sexo = sexo;
                break;
            case "Feminino":
                this.sexo = sexo;
                break;
            default:
                System.out.println("O campo 'sexo' é obrigatório. Por favor, selecione uma opção");
        }
    }

    public void setCabelo(String cabelo) {
        switch (cabelo) {
            case "Cabelo Liso":
                this.cabelo = cabelo;
                break;
            case "Cabelo Ondulado":
                this.cabelo = cabelo;
                break;
            case "Cabelo Cacheado":
                this.cabelo = cabelo;
                break;
            case "Cabelo Crespo":
                this.cabelo = cabelo;
                break;
            default:
                System.out.println("Por favor, selecione uma opção de tipo de cabelo.");
        }
    }

    public void setCorDosOlhos(String corDosOlhos) {
        String[] coresDosolhos = new String[]{
                "Castanho Escuros", "Castanhos Claro", "Verde Claro", "Azul Claro", "Azul Escuro", "Avelã", "Preto"
        };
        if (Arrays.asList(coresDosolhos).contains(corDosOlhos)) {
            this.corDosOlhos = corDosOlhos;
        } else {
          throw new IllegalArgumentException("Desculpe, a cor dos olhos não existe");
        }

    }

    public void setSuaCorFavorita(String suaCorFavorita) {
        String[] corFavorita = {"Vermelho", "Azul", "Preto", "Marrom", "Roxo", "Azul Bêbê", "Verde", "Amarelo"
        };
        if (Arrays.asList(corFavorita).contains(suaCorFavorita)) {
            this.suaCorFavorita = suaCorFavorita;
        } else {
          throw new IllegalArgumentException("Não foi possível redefinir a cor. Insira uma cor válida antes de tentar novamente");
        }
    }

    public void setimovelPessoal(String ImovelPessoal) {
        switch (ImovelPessoal) {
            case "Sim":
                this.imovelPessoal = ImovelPessoal;
                break;
            case "Não":
                this.imovelPessoal = ImovelPessoal;
                break;
            default:
                System.out.println("Escolha entre 'Sim' & 'Não' ");
        }
    }

    public void setTemCarroOuMoto(String temCarroOuMoto) {
        switch (temCarroOuMoto) {
            case "Carro":
                this.temCarroOuMoto = temCarroOuMoto;
                break;
            case "Moto":
                this.temCarroOuMoto = temCarroOuMoto;
                break;
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
            System.out.println("\"Erro: A quantidade não pode ser nula ou negativa. Por favor, insira uma quantidade válida.");
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

    public String getCorDosOlhos() {
        return this.corDosOlhos;
    }

    public String getImovelPessoal() {
        return this.imovelPessoal;
    }

    public String getTemCarroOuMoto() {
        return this.temCarroOuMoto;
    }

    public int getVerificarQuantidadeDeVeiculos() {
        return this.verificarQuantidadeDeVeiculos;
    }
}