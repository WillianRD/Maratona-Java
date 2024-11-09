package academy.devdojo.javacore.Aintroducaoclasses;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        int idade = 10;

        if (idade < 15){
            System.out.println("Categoria infantil");
        } else if (idade >=15 && idade <18){
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");

        }
    }
}
