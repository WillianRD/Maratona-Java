package main.javacore.Minterfaces.test;

import main.javacore.Minterfaces.dominio.DataBaseLoader;
import main.javacore.Minterfaces.dominio.DataLoader;
import main.javacore.Minterfaces.dominio.FileLoader;

public class DataBaseLoaderTest01 {
    public static void main(String[] args) {
        DataLoader dataLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataLoader.load();
        fileLoader.load();
    }

}
