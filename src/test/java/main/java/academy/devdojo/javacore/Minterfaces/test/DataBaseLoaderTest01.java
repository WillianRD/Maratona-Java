package main.java.academy.devdojo.javacore.Minterfaces.test;

import main.java.academy.devdojo.javacore.Minterfaces.dominio.DataBaseLoader;
import main.java.academy.devdojo.javacore.Minterfaces.dominio.DataLoader;
import main.java.academy.devdojo.javacore.Minterfaces.dominio.FileLoader;

public class DataBaseLoaderTest01 {
    public static void main(String[] args) {
        DataLoader dataLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataLoader.load();
        fileLoader.load();
    }

}
