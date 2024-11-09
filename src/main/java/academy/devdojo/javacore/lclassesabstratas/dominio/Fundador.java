package academy.devdojo.javacore.lclassesabstratas.dominio;

public final class Fundador extends Funcionario {
    private String funcao;
    private double cargaHoraria;
    private int quantidadeDeEmpresas, quantidadeDeFuncionario;


    public Fundador(String nome, double salario, String funcao, double cargaHoraria, int quantidadeDeEmpresas, int quantidadeDeFuncionario){
        super(nome, salario);
        this.funcao = funcao;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeDeEmpresas = quantidadeDeEmpresas;
        this.quantidadeDeFuncionario = quantidadeDeFuncionario;
        calcularBonus();
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Carga Horária: " + this.cargaHoraria);
        System.out.println("Quantidade de Empresas: " + this.quantidadeDeEmpresas);
        System.out.println("Quantidade de Funcionario " + this.quantidadeDeFuncionario);
    }

    @Override
    public void calcularBonus(){
        this.salario = this.salario + this.salario * 0.14;
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
