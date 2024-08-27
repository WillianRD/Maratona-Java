package academy.devdojo.HHeranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

//    Contrutor da Classe Funcionario
    public Funcionario(String nome) {
       super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioDePagamento() {
        System.out.println("Eu " + this.nome + " Recebi o sálario de: " + this.salario);
    }

    public double getSalario() { return salario; }

    public void setSalario(double salario) { this.salario = salario; }
}
