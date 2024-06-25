package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Will";
        professor.idade = 20;
        professor.sexo = 'M';

        System.out.println(" Nome do Professor: " + professor.nome + " Idade : " + professor.idade + " Sexo do Professor: " + professor.sexo);
    }
}
