package academy.devdojo.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant instant = Instant.now(); // Instant trabalha com nanos segundos
        System.out.println(instant);
        System.out.println(LocalDateTime.now());

        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
        System.out.println(Instant.ofEpochSecond(3));
    }
}
