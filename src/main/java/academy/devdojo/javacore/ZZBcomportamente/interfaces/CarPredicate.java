package academy.devdojo.javacore.ZZBcomportamente.interfaces;

import academy.devdojo.javacore.ZZBcomportamente.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test (Car car);
}
