package academy.devdojo.javacore.JmodificadorFinal.domimio;

public class Comprador {
    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Comprador{" + "nome='" + nome + '\'' + '}';
    }
}