package academy.devdojo.maratonajava.javacore.interfac.dominio;

public interface DataLoader{
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void checkPermission(){
        System.out.println("checkPermission");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize");
    }
}