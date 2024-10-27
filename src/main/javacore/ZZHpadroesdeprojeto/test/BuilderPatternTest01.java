package main.javacore.ZZHpadroesdeprojeto.test;

import main.javacore.ZZHpadroesdeprojeto.dominio.Person;

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
