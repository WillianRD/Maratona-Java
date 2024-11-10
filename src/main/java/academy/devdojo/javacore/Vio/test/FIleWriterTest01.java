package academy.devdojo.javacore.Vio.test;
// File
// FileWriter
// FileReader
// BufferWriter
// BufferReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try( FileWriter fileWriter = new FileWriter(file,true)) {
            fileWriter.write(" Somente um arquivo para teste \n Continuando a melhor Saga de Linguagem de programação ");
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
