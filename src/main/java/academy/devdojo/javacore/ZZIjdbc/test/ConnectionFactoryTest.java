package academy.devdojo.javacore.ZZIjdbc.test;

import academy.devdojo.javacore.ZZIjdbc.conn.ConnectionFactory;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.getConnection();
    }
}
