package main.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, " Pessoa Fisica"),
    PESSOA_JURIDICA(2, " Pessoa Juridica");

    public int valor;
    public String nomeRelatorio;

    //    Contrutor da classe Enum
    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor(){
        return valor;
    }

    public String getNomeRelatorio(){
        return nomeRelatorio;
    }

}
