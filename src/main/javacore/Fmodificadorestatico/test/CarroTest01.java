package main.javacore.Fmodificadorestatico.test;

import main.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Willian","Ferrari SF90", 370.44);
        carro.imprime();
        Carro.setVelocidadeLimite(2421);
        Carro carro1 = new Carro("Yuri","Ferrari La",347.2);
        carro1.imprime();

        Carro carro2 = new Carro("Leide","Porsche 911",330.42);
        carro2.imprime();
    }
}
