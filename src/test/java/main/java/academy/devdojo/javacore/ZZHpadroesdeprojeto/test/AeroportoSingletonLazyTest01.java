package main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.AeroportoSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AeroportoSingletonLazyTest01 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        compraAssentos("1B");
        compraAssentos("1B");
        System.out.println(AeroportoSingletonLazy.getInstance());
        System.out.println(AeroportoSingletonLazy.getInstance());
        Constructor<AeroportoSingletonLazy> declarandoContrutor = AeroportoSingletonLazy.class.getDeclaredConstructor(String.class);
        declarandoContrutor.setAccessible(true);
        AeroportoSingletonLazy AeroportoSingletonLazy = declarandoContrutor.newInstance("787-900");
        System.out.println(AeroportoSingletonLazy);
    }

    // Metodo estatico
    private static void compraAssentos(String assentos) {
        System.out.println(AeroportoSingletonLazy.getInstance());
        //        Criando um Objeto
        AeroportoSingletonLazy aeroportoSingletonLazy = AeroportoSingletonLazy.getInstance();
        System.out.println(aeroportoSingletonLazy.comprandoAssentos(assentos));
    }
}
