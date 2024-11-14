package academy.devdojo.javacore.Ycolecoes.test;


import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {

        List<String> number = new ArrayList();
        number.add("String");

        ArrayList<String> newArrays = new ArrayList<>();
        newArrays.add("isso é um arrays");
        newArrays.add("Arrays");

        for (String numberSelection : number){
            System.out.println(numberSelection);
        }

        for (String arrayList : newArrays){
            System.out.println(arrayList);
        }
    }
}
