package academy.devdojo.javacore.Oexeception.test;

import java.io.File;
import java.io.IOException;

public class ExeceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste3.txt");

        try {
            boolean iscriado = file.createNewFile();
            System.out.println("Arquivo criado " + iscriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }finally {
            System.out.println("ACABOOU");
        }
    }
}