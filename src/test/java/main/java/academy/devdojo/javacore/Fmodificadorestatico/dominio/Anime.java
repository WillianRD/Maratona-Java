package main.java.academy.devdojo.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.print("Bloco de Inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int ep : Anime.episodios){
            System.out.print(ep + " ");
        }
        System.out.println();
    }


    public String getNome(){
        return this.nome = nome;
    }

    public int [] getEpisodios(){
        return this.episodios;
    }

}

