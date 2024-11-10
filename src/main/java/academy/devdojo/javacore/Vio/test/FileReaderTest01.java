package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileReader fileReader = new FileReader(file)) {
            char [] in = new char[1];
            fileReader.read(in);
            for (char c : in){
                System.out.println(c);
            }
            System.out.println((fileReader.read()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

