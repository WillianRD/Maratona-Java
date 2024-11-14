package academy.devdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PAthTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("home/will/IdeaProjects/maratona-java/Directory/ArquivoDaSuperLeidee.txt");
        Path path2 = Paths.get("/home/will/IdeaProjects/maratona-java/Directory", "ArquivoDaSuperLeidee.txt");
        Path path3 = Paths.get("home", "will/IdeaProjects/maratona-java/Directory", "ArquivoDaSuperLeidee.txt");
        Path path4 = Paths.get("home", "will", "IdeaProjects", "maratona-java", "Directory", "ArquivoDaSuperLeidee.txt");
        System.out.println(path1.getFileName().toFile());
        System.out.println(path2.getFileName().toFile());
        System.out.println(path3.getFileName().toFile());
        System.out.println(path4.getFileName().toFile());
    }
}
