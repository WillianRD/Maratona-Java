package academy.devdojo.maratona;

import java.util.Scanner;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {

        //CRIANDO VARIAVEL PARA UMA PRINT

        String nome = "Will";
        String endereco = "Av Paulista";
        double salario = 2421.22;
        String recebimento = "20/12/2022";
        //String relatorio = "Eu "+nome+" morando no "+endereco+" confirmo que recebi o salário de "+salario+" na data "+dataRecebimentoSalario;
            //System.out.println(relatorio);
        //System.out.println("Agora vem a outra parte");

        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nome = in.nextLine();

        System.out.println("Digite seu endereço");
        endereco = in.nextLine();

        System.out.println("Digite seu salário");
        salario = in.nextDouble();

        //Consumir uma nova linha para o usuário colocar a sua mensagem
        recebimento = in.nextLine();

        System.out.println("Digite a última data de recebimento de seu sálario");
        recebimento = in.nextLine();

        String relatorio2 = "Eu "+nome+" morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+" na últina data informada "+recebimento;
        System.out.println(relatorio2);

        //Capturaçaõ de dados do scanner
            Scanner texto = new Scanner(System.in);
            String str;
        System.out.println("Entre com seu nome");
        str = texto.nextLine(); // nextline e uma forma de texto
        System.out.println("bem-vindo "+ str);

        System.out.println("Digite um número");
        int numero = texto.nextInt();
        System.out.println("O numero digitado foi: "+ numero);
        texto.close();
    }
}
