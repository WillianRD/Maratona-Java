package main.java.academy.devdojo.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader{

    @Override
    public void load(){
        System.out.printf("Carregando dados de um arquivo");
    }
}
