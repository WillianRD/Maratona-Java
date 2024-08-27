package academy.devdojo.javacore.test;

import academy.devdojo.javacore.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        academy.devdojo.javacore.dominio.Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
