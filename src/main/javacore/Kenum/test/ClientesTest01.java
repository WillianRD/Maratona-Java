package main.javacore.Kenum.test;

import main.javacore.Kenum.dominio.Clientes;
import main.javacore.Kenum.dominio.TipoCliente;

public class ClientesTest01 {
    public static void main(String[] args){
        Clientes cliente = new Clientes("Will", TipoCliente.PESSOA_FISICA);
        Clientes cliente2 = new Clientes("Yuri",TipoCliente.PESSOA_JURIDICA);
        Clientes cliente3 = new Clientes("Leide", TipoCliente.PESSOA_JURIDICA);
        Clientes cliente4 = new Clientes("Wiu",TipoCliente.PESSOA_FISICA);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
