package main.javacore.Kenum.dominio;

public class Clientes {
    private String nome;
    private TipoCliente tipoCliente;

    // Forçando o construtor da classe, passar um tipo da minha classe TipoCliente
    public Clientes(String nome, TipoCliente tipoCliente){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public TipoCliente getTipoCliente(){
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente){
        this.tipoCliente = tipoCliente;
    }

}
