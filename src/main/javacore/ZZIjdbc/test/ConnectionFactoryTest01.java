package main.javacore.ZZIjdbc.test;

import main.javacore.ZZIjdbc.dominio.Producer;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer.ProducerBuilder producer = Producer.ProducerBuilder.builder()
                .name("Willian");
    }
}
