package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest03 {
    public static void main(String[] args) {
       Smartphone s1 = new Smartphone("11222","Iphone");
        List<Smartphone> smart = new ArrayList<>(16);
        smart.add(s1);

    }
}
