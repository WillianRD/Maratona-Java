package academy.devdojo.javacore.JmodificadorFinal.domimio;

public class Carro {
    private String nome;
    public final static double VELOCIDADE_LIMITE = 250;
    public  final Comprador COMPRADOR = new Comprador(); //CAPS LOCKS -> UpCase para váriaveis Constantes

//    static{
//        VELOCIDADE_LIMITE = 200;
//    }

    public void imprime(){
        System.out.println(this.nome);
    }

    public String getNome(String nome) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
