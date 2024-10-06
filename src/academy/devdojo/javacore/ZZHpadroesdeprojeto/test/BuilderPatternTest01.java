package academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firsname("Willian")
                .lastname("Rodrigues")
                .username("Will")
                .email("Willianrodrigues@gmail.com")
                .build();
        System.out.println(build);
    }
}
