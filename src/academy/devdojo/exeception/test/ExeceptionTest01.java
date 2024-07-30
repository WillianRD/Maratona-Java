package academy.devdojo.exeception.test;

import java.io.File;
import java.io.IOException;

public class ExeceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste2.txt");

        try{
            boolean iscriado = file.createNewFile();
            System.out.println("Arquivo criado " + iscriado);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
