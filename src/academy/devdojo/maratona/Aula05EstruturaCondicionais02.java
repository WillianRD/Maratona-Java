package academy.devdojo.maratona;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 && categoria adulto
        int idade = 15;
        String categoria;

        if (idade < 15){
         categoria = "Categoria infantil";
        } else if (idade >=15 && idade <18){
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";

        }
        System.out.println(categoria);
    }
}
