package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
//        Chamando a bibilioteca File
        File file = new File("file.txt");

//        Tratamento de erro obrigátorio
        try{
            boolean isDelete = file.delete(); //            Para deletar um arquivo
            System.out.println("Arquivo deletado! " + file.delete());

            boolean isCreateFile = file.createNewFile(); //            Para criar um novo arquivo
            System.out.println("Arquivo criado com sucesso: " + isCreateFile + "\n"
            + "Verifique o caminho: " + file.getAbsolutePath());

            System.out.println("Diretorio: " + file.isDirectory());
            System.out.println("Arquivo sem diretorio:: " + file.isFile());
            System.out.println("Arquivo oculto:: " + file.isHidden());
            System.out.println("Última vez que foi modificado: " + new Date(file.lastModified()));

            boolean exits = file.exists(); //       Para verificar se existe um arquivo
            if (exits == true){
//                boolean isDeleteArquivo = file.delete();
                System.out.println("Arquivo deletado com sucesso!" + file.delete());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
