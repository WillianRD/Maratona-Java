package main.javacore.Kenum.dominio;

public class Clientes {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoDePagamento tipoDePagamento;

    public Clientes(String nome, TipoCliente tipoCliente, TipoDePagamento tipoDePagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoDePagamento = tipoDePagamento;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "Nome Cliente: '" + nome + '\'' +
                ", Tipo Cliente: " + tipoCliente.getNomeRelatorio() +
                ", Tipo ClienteInt: " + tipoCliente.getValor() +
                ", Tipo Pagamento: " + tipoDePagamento +
                '}';
    }
}
