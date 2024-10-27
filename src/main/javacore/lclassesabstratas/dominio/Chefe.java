package main.javacore.lclassesabstratas.dominio;

public class Chefe extends Funcionario {
    private String setor;
    private int quantidadeDeFuncionario;
    private String descDaFuncao;

    @Override
    public String toString() {
        return "Chefe{" +
                "setor='" + setor + '\'' +
                ", quantidadeDeFuncionario=" + quantidadeDeFuncionario +
                ", descDaFuncao='" + descDaFuncao + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public Chefe(String nome, double salario, String setor, int quantidadeDeFuncionario, String descDaFuncao){
        super(nome,salario);
        this.setor = setor;
        this.quantidadeDeFuncionario = quantidadeDeFuncionario;
        this.descDaFuncao = descDaFuncao;


    }
}
