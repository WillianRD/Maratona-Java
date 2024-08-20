package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Pessoa {
    // Variaveis que são usadas para guardar informações da classe Pessoa
    private String nome, sexo, cpf, cabelo, suaCorFavorita, ImovelPessoal, temCarroOuMoto, corDosOlgos;
    private int idade, verificarQuantidadeDeVeiculos;
    private double altura;

    //    Método setter que busca o nome da pessoa e faz uma validação caso se for menor
//    que três caracteres, ele imprime uma menssagem de erro
    public void setNome(String nome) {
        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            System.out.println("ERRO: Formato do nome e menor que três");
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

    // Caso a altura nãao seja informada, mostra um print na tela de Erro
    public void setAltura(double altura) {
        if (altura > 1) {
            this.altura = altura;
        } else {
            System.out.println("ERRO: Altura não informada");
        }
    }

    //    Validaçãoa do sexo da class Pessoa, se a
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

    public void setSuaCorFavorita(String suaCorFavorita) {
        String[] CorFavorita = new String[11];
        CorFavorita[0] = "Vermelho";
        CorFavorita[1] = "Azul";
        CorFavorita[2] = "Preto";
        CorFavorita[3] = "Marrom";
        CorFavorita[4] = "Laranja";
        CorFavorita[5] = "Amarelo";
        CorFavorita[6] = "Verde";
        CorFavorita[7] = "Cinza";
        CorFavorita[8] = "Branco";
        CorFavorita[9] = "Rosa";
        CorFavorita[10] = "Roxo";
        for (String coresFavoritas : CorFavorita) {
            if (coresFavoritas.equals(suaCorFavorita)) {
                this.suaCorFavorita = suaCorFavorita;
                break;
            }
        }
}

    public void setCorDosOlgos(String corDosOlgos) {
        String[] CorDosOlhos = new String[8];
        CorDosOlhos[0] = "Castanhos Escuros";
        CorDosOlhos[1] = "Castanhos Claro";
        CorDosOlhos[2] = "Verde Claro";
        CorDosOlhos[3] = "Verde Escuro";
        CorDosOlhos[4] = "Azul Claro";
        CorDosOlhos[5] = "Azul Escuro";
        CorDosOlhos[6] = "Avalã";
        CorDosOlhos[7] = "Preto";
        for (String coresOlhos : CorDosOlhos) {
            if (coresOlhos.equals(corDosOlgos)) {
                this.corDosOlgos = corDosOlgos;
                break;
            }
            if (!CorDosOlhos.equals(corDosOlgos)) {
                System.out.println("COR DOS OLHOS: Erro ao adicionar a cor dos olhos");
                break;
            }
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
        return this.corDosOlgos;
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