package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1222", "Lg");
        Smartphone s2 = new Smartphone("222" , "Xiaomi");
        Smartphone s3 = new Smartphone("1111" , "Iphone");
        Smartphone s4 = new Smartphone("11121","Iphone");

        List<Smartphone> smartphones= new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);

        for(Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }

        System.out.println(smartphones.contains(s4));
        int indexSmartphoneS4 = smartphones.indexOf(s2);
        System.out.println(smartphones.get(indexSmartphoneS4));
    }
}
