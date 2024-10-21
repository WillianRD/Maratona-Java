package academy.devdojo.javacore.EstuturaDeDados.dominio;

public class Vetores {
    public static void main(String[] args) {
        double [] temperaturas = new double[365];
        temperaturas[0] = 22.5;
        temperaturas[1] = 23.7;
        temperaturas[2] = 24.0;
        temperaturas[3] = 22.5;
        temperaturas[4] = 22.5;
        temperaturas[5] = 22.5;
        temperaturas[6] = 22.5;


        System.out.println("Atualmente a temperatura é " + temperaturas[1]);
        System.out.println("Tamanho do Arraay é " + temperaturas.length);

        for(int i = 0; i < temperaturas.length; i++){
            System.out.println("o valor da temperatura do dia é " + (i+1) + " e " + temperaturas[1]);
        }

        for(double temp: temperaturas){
            System.out.println(temp);
        }

    }
}
