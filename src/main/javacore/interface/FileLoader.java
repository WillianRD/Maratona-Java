package academy.devdojo.maratonajava.javacore.interfac.interfa;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Checkando as permissões  no arquivo");
    }
}
