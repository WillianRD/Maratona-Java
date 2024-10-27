package main.java.academy.devdojo.javacore.JmodificadorFinal.domimio;

public class Carro {
    private String nome;
    public final static double VELOCIDADE_LIMITE = 250;

//    static{
//        VELOCIDADE_LIMITE = 200;
//    }

    public String getNome(String nome) {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

}
