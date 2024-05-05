package academy.devdojo;

public class Aula05EstruturaCondicionais06 {
    public static void main(String[] args) {
        // Utilizando Switch e dados os valores de 1 a 7, imprima se é o dia útil ou final de semana
        // Considerando 1 como domingo

        byte dias = 5;
        switch (dias){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia últi");
                break;

            default:
                System.out.println("Opção Invalida");
                break;
        }
    }
}
