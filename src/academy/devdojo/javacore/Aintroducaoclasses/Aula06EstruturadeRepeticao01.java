package academy.devdojo.javacore.Aintroducaoclasses;

public class Aula06EstruturadeRepeticao01 {
    public static void main(String[] args) {
        // while, do-while, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }
        count = 0;
        do {
            System.out.println("dentro do do-while " + count);
            count++;
        } while (count < 10);

        for(int i=0;i<10;i++){
            System.out.println("For "+i);
        }
    }
}