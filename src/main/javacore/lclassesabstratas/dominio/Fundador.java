package main.javacore.lclassesabstratas.dominio;

public class Fundador extends Funcionario {
    private String funcao;
    private double cargaHoraria;
    private int quantidadeDeEmpresas, quantidadeDeFuncionario;


    public Fundador(String nome, double salario, String funcao, double cargaHoraria, int quantidadeDeEmpresas, int quantidadeDeFuncionario){
        super(nome, salario);
        this.funcao = funcao;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeDeEmpresas = quantidadeDeEmpresas;
        this.quantidadeDeFuncionario = quantidadeDeFuncionario;
    }

    @Override
    public String toString() {
        return "Fundador{" +
                ", nome='" + nome + '\'' +
                ", Salario=" + salario +
                "Funcao='" + funcao + '\'' +
                ", Carga Horaria=" + cargaHoraria +
                ", Quantidade de Empresas=" + quantidadeDeEmpresas +
                ", Quantidade de Funcionario=" + quantidadeDeFuncionario +
                '}';
    }
}
