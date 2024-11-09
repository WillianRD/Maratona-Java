package academy.devdojo.javacore.Npolimorfismo.dominio;

public abstract class Produto implements Taxavel {
   protected String nome;
   protected double valor;

    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double calcularImposto(){
        return 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }
}
