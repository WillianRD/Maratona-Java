package academy.devdojo.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fw = new FileReader(file);
             BufferedReader br = new BufferedReader(fw)) {
            String linha;
            while ((linha = br.readLine()) != null){ // Ler todas as linha do arquivo
                System.out.println(linha);
            }
            br.readLine(); // Ler todas as linha do arquivo

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
