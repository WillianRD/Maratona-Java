package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carros;

public class CarroTest {
    public static void main(String[] args) {
        Carros carros = new Carros();
        Carros carros2 = new Carros();

        carros.Nome = "Fiat Uno";
        carros.Modelo = "Strada";
        carros.Ano =  2024;

        carros2.Nome = "Mustang";
        carros2.Modelo = "GT 500";
        carros2.Ano =  2020;


        System.out.println(carros.Nome);
        System.out.println(carros.Modelo);
        System.out.println(carros.Ano);

        System.out.println("\n Carro 2");
        System.out.println(carros2.Nome);
        System.out.println(carros2.Modelo);
        System.out.println(carros2.Ano);
    }
}
