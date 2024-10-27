package main.javacore.lclassesabstratas.dominio;

public final class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.20;
    }

    @Override
    public String toString() {
        return "Gerente: " +
                "Nome='" + nome + '\'' +
                ", Salário: " + salario +
                '}';
    }
}
