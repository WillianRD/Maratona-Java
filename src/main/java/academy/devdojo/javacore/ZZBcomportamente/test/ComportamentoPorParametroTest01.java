package academy.devdojo.javacore.ZZBcomportamente.test;

import academy.devdojo.javacore.ZZBcomportamente.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(
            new Car("Audi", "Audio R8", "Green", 2012),
            new Car("Marca", "Audio RS6", "Green", 2015),
            new Car("Ferrari", "Ferrari 920", "Red", 2020),
            new Car("Ferrari", "Ferrari 990", "Red", 2021),
            new Car("Ferrari", "Ferrari Spider", "Red", 2018),
            new Car("Peugeot", "Peugeot", "Yellow", 2012),
            new Car("BMW", "BMW M4", "Yellow", 2017),
            new Car("Fox", "Fox", "Red", 2009),
            new Car("Fiat", "Fiat", "Black", 1995),
            new Car("Bmw", "BMW M5", "Black", 2022));

    public static void main(String[] args) {
        System.out.println("Filtrando todos os carros da cor Green");
        System.out.println(filterGreenCar(cars));
        System.out.println("\n");

        System.out.println("Filtrando todos os carros daa cor Red");
        System.out.println(filterRedCar(cars));
        System.out.println("\n");

        System.out.println("Filtrando todos os carros da cor escolhida");
        System.out.println(filterByColor(cars, "Red"));
        System.out.println("\n");

        System.out.println("Filtrando todos os carros por ano:");
        System.out.println(filterByBefore(cars, 2015));
        System.out.println("\n");

        System.out.println("Filtrando todos os carros por Marca:");
        System.out.println(filterCarMarca(cars,"Ferrari"));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    //    Metodo static que possui uma lista de filterRedCar que vem da classe Car(
    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> redCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Red")) {
                redCar.add(car);
            }
        }
        return redCar;
    }

    //    Metodo static que possui uma lista de filterRedCar que vem da classe Car
    private static List<Car> filterByColor(List<Car> cars, String color) {
        List<Car> filterBy = new ArrayList<>(); // Criando uma nova lista
        for (Car car : cars) {
            if (car.getColor().equals("Red")) {
                filterBy.add(car);
            }
        }
        return filterBy;
    }

    private static List<Car> filterByBefore(List<Car> carrosFiltradoPorAno, int ano) {
        List<Car> filtarCarroAno = new ArrayList<>();
        for (Car car : carrosFiltradoPorAno) {
            if (car.getYear() <= ano) {
                filtarCarroAno.add(car);
            }
        }
        return filtarCarroAno;
    }

    private static List<Car> filterCarMarca(List<Car> cars, String marca) {
        List<Car> filterMarca = new ArrayList<>(); // Criando uma nova lista
        for (Car car : cars) {
            if (car.getMarca().equals("Ferrari")) {
                filterMarca.add(car);
            }
        }
        return filterMarca;
    }
}

