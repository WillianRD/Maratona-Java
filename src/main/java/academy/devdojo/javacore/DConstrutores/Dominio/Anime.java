package academy.devdojo.javacore.DConstrutores.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String episodios;
    private String genero;
    private String estudio;

    //    Construtor com Inicialização
    public Anime(String nome, String tipo, String episodios, String genero) {
//        System.out.println("Dentro do Construtor");
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;

    }

    //    Contrutor
    public Anime(String nome, String tipo, String episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    //    Construtor sem Inicialização
    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println("Nome do Anime: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodio: " + this.episodios);
        System.out.println("Genêro: " + this.genero);
        System.out.println("Estúdio " + this.estudio);
    }
}
