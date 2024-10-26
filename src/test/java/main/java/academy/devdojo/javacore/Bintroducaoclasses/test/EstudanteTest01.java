package main.java.academy.devdojo.javacore.Bintroducaoclasses.test;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.Nome = "Will";
        estudante01.Idade = 20;
        estudante02.Sexo = 'F';

        System.out.println(estudante01.Nome);
        System.out.println(estudante01.Idade);
        System.out.println(estudante01.Sexo);

        System.out.println(estudante02.Sexo);
        System.out.println(estudante02.Sexo);
        System.out.println(estudante02.Sexo);
    }
}
