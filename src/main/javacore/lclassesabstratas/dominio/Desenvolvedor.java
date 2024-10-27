package main.javacore.lclassesabstratas.dominio;

public final class Desenvolvedor extends Funcionario{
    private int quantidadeDeProjetos;
    private String linguagensDeProgramacao;

    public Desenvolvedor(String nome, double salario, int quantidadeDeProjetos, String linguagensDeProgramacao){
        super(nome,salario);
        this.quantidadeDeProjetos = quantidadeDeProjetos;
        this.linguagensDeProgramacao = linguagensDeProgramacao;
    }

    @Override
    public void calcularBonus(){
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "Nome='" + nome + '\'' +
                "Salario=" + salario +
                "quantidadeDeProjetos=" + quantidadeDeProjetos +
                ", linguagensDeProgramacao='" + linguagensDeProgramacao + '\'' +
                '}';
    }
}
