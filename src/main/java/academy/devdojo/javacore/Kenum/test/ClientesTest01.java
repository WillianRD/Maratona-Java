package academy.devdojo.javacore.Kenum.test;

import academy.devdojo.javacore.Kenum.dominio.Clientes;
import academy.devdojo.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.javacore.Kenum.dominio.TipoDePagamento;

public class ClientesTest01 {
    public static void main(String[] args){
        Clientes cliente1 = new Clientes("WIllian", TipoCliente.PESSOA_FISICA, TipoDePagamento.DEBITO);
        Clientes clientes2 = new Clientes("Leide", TipoCliente.PESSOA_JURIDICA, TipoDePagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(clientes2);
        System.out.println(TipoDePagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoDePagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente2 = TipoCliente.porTipoClientePorNomeRelatorio(" Pessoa Juridica");
        System.out.println(tipoCliente2);

    }
}
