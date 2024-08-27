package academy.devdojo.maratonajava.javacore.interfac.interfa.teste;

import academy.devdojo.maratonajava.javacore.interfac.interfa.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.interfac.interfa.DataLoader;
import academy.devdojo.maratonajava.javacore.interfac.interfa.FileLoader;


public class DataLoader01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();
        dataBaseLoader.retriveMaxDataSize();

    }

}
