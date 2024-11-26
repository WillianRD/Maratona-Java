package academy.devdojo.javacore.ZZIjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {  //    Importando a biblioteca Connection do Java
//        Atributo URL, realiza a captura do banco de dados usanto a sintaxe: jdbc:(nomeDoBancoDeDados:)
//        onde estar o meu banco?(//localhost:) na porta :3306/ qual nome do bancoDeDados:produtos

        String url = "jdbc:mysql://localhost:3306/produtos";
        String username = "root"; //        usuarioLogin
        String password = "root"; //        senhaUsuario
        return DriverManager.getConnection(url, username, password);

    }

}