package academy.devdojo.exeception.error.test.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExeceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException, ArithmeticException, IllegalArgumentException ");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RunTimeExeception");
        }

        try {
            talvezLanceExeception();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceExeception() throws SQLException, FileNotFoundException, IOException {

    }
}
