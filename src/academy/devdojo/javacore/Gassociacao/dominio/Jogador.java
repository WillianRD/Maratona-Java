package academy.devdojo.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Jogador Brasileiro: " + this.nome);
        System.out.println("Teste");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
