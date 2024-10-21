package academy.devdojo.javacore.ZZIjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //    Importando a biblioteca Connection do Java
    public static Connection getConnection() throws SQLException {

//        Atributo UR, realiza a captura do banco de dados usanto a sintaxe: jdbc:(nomeDoBancoDeDados:)
//        onde estar o meu banco?(//localhost:) na porta :3306/ qual nome do bancoDeDados:produtos
        String url = "jdbc:mysql://localhost:3306/produtos";
//        usuarioLogin
        String username = "root";
//        senhaUsuario
        String password = "root";
        return DriverManager.getConnection(url, username, password);

    }

}