package academy.devdojo.javacore.ZZBcomportamente.test;

import academy.devdojo.javacore.ZZBcomportamente.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
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
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("Red");
//            }
//        });
//        System.out.println(greenCars);
        int ano = 2020;
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> redCarsFilter = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> filterYearsCar = filter(cars,car -> car.getYear() < ano);

        System.out.println("Exibindo carro da cor Green: " + greenCars + "\n");
        System.out.println("Exibindo carro da cor Green: " + redCarsFilter + "\n");
        System.out.println("Exibindo carros do ano " + ano + filterYearsCar);

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10,11);
        System.out.println(filter(nums, num -> num % 2 == 0));
        System.out.println(filter(nums, num -> num % 2 == 1));
    }


    private static <T> List<T> filter (List<T> list,Predicate<T> predicate){
        List<T> filterRedList = new ArrayList<>();
        for (T e: list){
            if (predicate.test(e)){
                filterRedList.add(e);
            }
        }
        return filterRedList;
    }
}