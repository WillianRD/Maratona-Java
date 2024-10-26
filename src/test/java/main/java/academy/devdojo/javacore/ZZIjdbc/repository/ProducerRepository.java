package main.java.academy.devdojo.javacore.ZZIjdbc.repository;

import main.java.academy.devdojo.javacore.ZZIjdbc.conn.ConnectionFactory;
import main.java.academy.devdojo.javacore.ZZIjdbc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
//    chamando a class Producer, atribuindo um valor para chamar ela de: producer
    public static void save(Producer producer) {
//        Inserindo dados
        String url = "INSERT INTO `produtos`.`producer` (`ID`, `name`, `sobrenome`) VALUES ('', 'Will', 'Rodrigues');";
        try(Connection conn = ConnectionFactory.getConnection();
            Statement statement = conn.createStatement()){
            int rowAffected = statement.executeUpdate(url);
            System.out.println(rowAffected);
    } catch(SQLException e){
        e.printStackTrace();
    }
}
}
