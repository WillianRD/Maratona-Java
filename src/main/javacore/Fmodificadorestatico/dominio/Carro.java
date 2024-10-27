package main.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String carro, proprietarioDoCarro;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
    private String texto = "Como dizia meus amigos, só que mel ?";

    public Carro(String dono,String carro, double velocidadeMaxima){
        this.proprietarioDoCarro = dono;
        this.carro = carro;
        this.velocidadeMaxima = velocidadeMaxima;

        if(velocidadeMaxima > 350.99){
            System.out.println("---------------------------");
            System.out.println("Parece que temos um ganhador aqui\n" +
                    "Em primeira posição e ele " + this.proprietarioDoCarro + "\n"
                    + "com sua atual " + this.carro + "\n" +"Fez a corrida parece Easy " + "\n" +
                    "mas seu rivais não gostaram nem um pouco," + "\n" + "não e mesmo: " + this.proprietarioDoCarro + ":" + "\n" +
                    this.texto);
        }
    }
    public void imprime(){
        System.out.println("-----------------------");
        System.out.println("Dono do Carro: " + this.proprietarioDoCarro);
        System.out.println("Carro: " + this.carro);
        System.out.println("Velocida Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public double velocidade (){
        if (velocidadeMaxima > velocidadeLimite){
            System.out.println(this.proprietarioDoCarro + "Estar voando na frente");
        }
        return velocidade();
    }

    public String getProprietarioDoCarro(){
        return this.proprietarioDoCarro;
    }

    public void setProprietarioDoCarro(String proprietarioDoCarro){
        this.proprietarioDoCarro = proprietarioDoCarro;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return Carro.getVelocidadeLimite();
    }

    public String getCarro(){
        return this.carro;
    }

    public void setNome(String carro){
        this.carro = carro;
    }

    public double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }


}