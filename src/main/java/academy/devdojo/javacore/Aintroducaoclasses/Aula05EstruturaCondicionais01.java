package academy.devdojo.javacore.Aintroducaoclasses;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {

        int idade2 = 15;
        boolean isAutorizadoComprarBebida = idade2 >= 18;
        // !

        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
//            System.out.println("Não autorizado");
        }


        // ! = false se for falso ele dar um print na tela
        if (!isAutorizadoComprarBebida) {
//            System.out.println("Não autorizado");
        }

        boolean c = true;
        if (c == false) {
//            System.out.println("Dentro de algo que nunca deve ser feito");

        }
        int idade = 19;
        if (idade > 18) {
            System.out.println("Maior de idade");
        }

    }
}
