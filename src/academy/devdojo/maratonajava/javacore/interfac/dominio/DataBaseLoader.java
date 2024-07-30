package academy.devdojo.maratonajava.javacore.interfac.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");

    }

    @Override
    public void remove() {
        System.out.println("Removendo do dados do banco de dados");
    }
    @Override
    public void checkPermission(){
        System.out.println("Checkando as permissões  no banco de dados ");
    }
    public  static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }

}
