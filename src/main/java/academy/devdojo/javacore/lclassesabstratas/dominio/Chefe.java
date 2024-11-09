package academy.devdojo.javacore.lclassesabstratas.dominio;

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

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Setor: " + this.setor);
        System.out.println("Quantidade de Funcionario que lidera: " + this.quantidadeDeFuncionario);
        System.out.println("Descrição da vaga de lider: " + this.descDaFuncao);
    }

    public Chefe(String nome, double salario, String setor, int quantidadeDeFuncionario, String descDaFuncao) {
        super(nome, salario);
        this.setor = setor;
        this.quantidadeDeFuncionario = quantidadeDeFuncionario;
        this.descDaFuncao = descDaFuncao;


    }
}
