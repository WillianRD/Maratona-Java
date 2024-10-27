package main.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Bloco de Inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int ep : this.episodios){
            System.out.println(ep + " ");
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

