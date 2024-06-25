package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante Estudante = new Estudante();
        Estudante Estudante2 = new Estudante();

        Estudante.nome = "Saaaa";
        System.out.println(Estudante.idade);
        System.out.println(Estudante.sexo);
        System.out.println(Estudante.nome);
        System.out.println("------------------------------------");

        System.out.println(Estudante2.idade);
        System.out.println(Estudante2.sexo);
        System.out.println(Estudante2.nome);
    }
}
