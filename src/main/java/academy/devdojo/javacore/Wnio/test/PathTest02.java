package academy.devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Locale;

public class PathTest02 {
    public static void main(String[] args) throws IOException {

        // Para criar diretorios
        Path path = Paths.get("Teste");
        if (Files.notExists(path)){
            Path path1 = Files.createDirectory(path);
        }

        // Para criar sub pasta
        Path subPastaPath = Paths.get("Leide/leide");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);

        // Para Criar arquivos
        Path filePath = Paths.get(subPastaPath.toString(),"file.txt");

        if (Files.notExists(filePath)){
            Path filePath1 = Files.createFile(filePath);
        }
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(),"fileDoYuri.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
