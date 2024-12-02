package academy.devdojo.javacore.Xserializacoa.test;

import academy.devdojo.javacore.Xserializacoa.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Willian", "123234");
        serializar(aluno);
    }

    public static void serializar(Aluno aluno) {
        Path path = Paths.get("/home/will/IdeaProjects/maratona-java/Paste/leide.ser");
        Path path2 = Paths.get("/home/will/IdeaProjects/maratona-java/Paste/yuri.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path2))) {
            oos.writeObject(aluno);
        } catch (IOException e){
            e.printStackTrace();
    }
}
}
