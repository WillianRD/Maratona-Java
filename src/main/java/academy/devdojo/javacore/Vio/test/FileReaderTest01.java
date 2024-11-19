package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fileReader = new FileReader(file)) {
//            char[] ler = new char[1000];
//            int size = fileReader.read(ler);
//            System.out.println("Quantidade de Caracteres: " + size);
//
//            for (char in : ler){
//                System.out.println(in);
//                if( in == 0) return;
////                break;
//            }



            int i;
            while ((i = fileReader.read()) != -1) {
//                Lendo posição por posição
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

