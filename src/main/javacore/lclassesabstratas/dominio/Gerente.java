package main.javacore.lclassesabstratas.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario){
        super(nome,salario);
    }

    @Override
    public String toString() {
        return "Gerente: " +
                "Nome='" + nome + '\'' +
                ", Salário: " + salario +
                '}';
    }
}
