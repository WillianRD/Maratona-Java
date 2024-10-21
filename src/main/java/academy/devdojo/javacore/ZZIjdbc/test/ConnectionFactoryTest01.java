package academy.devdojo.javacore.ZZIjdbc.test;

import academy.devdojo.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder()
                        .name("Will").build();
        ProducerRepository.save();

    }
}
