package academy.devdojo.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Jogador: " + this.nome);
        if (time != null) {
            System.out.println("Time: " + time.getNome());
            System.out.println("-----");
        }
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTime (Time time){
        this.time = time;
    }

    public Time getTime(){
        return this.time;
    }
}
