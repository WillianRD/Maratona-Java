package main.javacore.Kenum.test;

import main.javacore.Kenum.dominio.Clientes;
import main.javacore.Kenum.dominio.TipoCliente;
import main.javacore.Kenum.dominio.TipoDePagamento;

public class ClientesTest01 {
    public static void main(String[] args){
        Clientes cliente1 = new Clientes("WIllian", TipoCliente.PESSOA_FISICA, TipoDePagamento.DEBITO);
        Clientes clientes2 = new Clientes("Leide", TipoCliente.PESSOA_JURIDICA, TipoDePagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(clientes2);
        System.out.println(TipoDePagamento.DEBITO.calcularDesconto(100));
    }
}
