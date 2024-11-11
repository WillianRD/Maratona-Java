package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("folder");
        boolean isDiretorioCriado = fileDiretorio.mkdir(); // Criar pastas
        System.out.println("Pasta criada com sucesso: " + isDiretorioCriado);

        File fileArquivo = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivo.createNewFile();
        System.out.println("Arquivo criado com sucesso: " + isFileCreated);

        File fileCreatedDirectoy = new File("Directory");
        boolean isCreated = fileCreatedDirectoy.mkdir();
        if (isCreated != false) {
            System.out.println("Pasta Criada: " + isCreated);
        } else {
            System.out.println("Não foi possivel criar a pasta, verifique se tem outra pasta com esse nome");
        }

        File fileCreatedFile2 = new File(fileCreatedDirectoy, "Leide.txt");
        boolean isCreatedFile = fileCreatedFile2.createNewFile();
        String name = "Leide";
        if (isCreatedFile != false) {
            System.out.println("Arquivo do (a)" + name + " foi criado com sucesso");
        }

        System.out.println("-----------");

        File fileArquivo2 = new File("Teste11.txt");
        if (fileArquivo2 == null) return;
        System.out.println("Arquivo Criado com sucesso");

        boolean isFile = fileArquivo2.createNewFile();
        System.out.println("Arquivo criado com sucesso: " + isFile);

        File fileRenamed = new File(fileCreatedDirectoy, "ArquivoDaSuperLeidee.txt"); // Nome do arquivo
        boolean isFileRename = fileCreatedFile2.renameTo(fileRenamed); // renameTo(); - Para renomear um arquivo;
        System.out.println(isFileRename);

        File fileNewDirectory = new File("Paste"); // Criando um diretorio
        boolean isDirectoryRename = fileDiretorio.renameTo(fileNewDirectory); // renameTo(); - Para renomear um Diretorio;
        System.out.println(isDirectoryRename);
    }
}
