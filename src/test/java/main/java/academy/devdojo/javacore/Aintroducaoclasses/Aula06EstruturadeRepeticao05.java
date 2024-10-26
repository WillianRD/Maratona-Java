package main.java.academy.devdojo.javacore.Aintroducaoclasses;

public class Aula06EstruturadeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcelaa >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela =(int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " +parcela+ " R$ " + valorParcela);
        }
    }
}
