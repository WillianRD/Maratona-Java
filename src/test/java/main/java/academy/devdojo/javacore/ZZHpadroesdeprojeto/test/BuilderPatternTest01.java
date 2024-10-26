package main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import main.java.academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firsname("Will")
                .lastname("Rodrigues")
                .username("Will")
                .email("Willianrodrigues@gmail.com")
                .build();
        System.out.println(build);
    }
}
