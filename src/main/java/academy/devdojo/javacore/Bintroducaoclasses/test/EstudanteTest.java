package academy.devdojo.javacore.Bintroducaoclasses.test;

import academy.devdojo.javacore.Bintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        academy.devdojo.javacore.Bintroducaoclasses.dominio.Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
