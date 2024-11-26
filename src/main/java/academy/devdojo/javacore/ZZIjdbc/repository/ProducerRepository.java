package academy.devdojo.javacore.ZZIjdbc.repository;

import academy.devdojo.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.javacore.ZZIjdbc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer) {
//        Inserindo dados
        String url = "INSERT INTO `produtos`.`producer` (`ID`, `name`, `sobrenome`) VALUES ('%s);".formatted(producer.getName(""));

        try (Connection conn = ConnectionFactory.getConnection();

             Statement statement = conn.createStatement()) {
            int rowAffected = statement.executeUpdate(url); // Executa o comando da variavel url
            System.out.println(rowAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
