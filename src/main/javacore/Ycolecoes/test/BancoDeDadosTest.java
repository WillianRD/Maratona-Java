package main.javacore.Ycolecoes.test;

import main.javacore.Ycolecoes.dominio.BancoDeDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoDeDadosTest {
    public static void main(String[] args) {
        List<BancoDeDados> dadosUser = new ArrayList<>(20);
        dadosUser.add(new BancoDeDados(1L,"Ana",2000F));
        dadosUser.add(new BancoDeDados(2L,"João",2222));
        dadosUser.add(new BancoDeDados(5L, "Leide", 10000));
        dadosUser.add(new BancoDeDados(10L,"Yuri", 50000));
        dadosUser.add(new BancoDeDados(3L, "Willian", 100000));
        dadosUser.add(new BancoDeDados(4L, "Pedro", 2000));
        dadosUser.add(new BancoDeDados(6L, "Pietro", 1000));
        dadosUser.add(new BancoDeDados(7L,"Kaique", 50));
        dadosUser.add(new BancoDeDados(8L, "Vitor", 2000));
        dadosUser.add(new BancoDeDados(9L,"Marcos", 700000000F));

        for(BancoDeDados dados : dadosUser){
            System.out.println(dados);
        }
        System.out.println("_______________________________________");
        Collections.sort(dadosUser);
        for (BancoDeDados user : dadosUser){
            System.out.println(user);
        }
    }
}
