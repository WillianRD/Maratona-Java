package main.javacore.Bintroducaoclasses.test;

import main.javacore.Bintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Will";
        professor.idade = 20;
        professor.sexo = 'M';

        System.out.println(" Nome do Professor: " + professor.nome + "\n"+ " Idade : " + professor.idade +"\n" + " Sexo do Professor: " + professor.sexo);
    }
}
