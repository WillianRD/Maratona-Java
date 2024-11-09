package academy.devdojo.javacore.lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public abstract void calcularBonus();

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário " + this.salario);
    }
}
