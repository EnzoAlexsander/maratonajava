package maratonajava.javacore.pt15_exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

// No java 7 pode fazer multiplos catchs dentro de um mesmo catch separando-os por um pipe |
// Esse exemplo abaixo tem o mesmo resultado do exemplo na classe MultiplasRuntimeExceptionTest.java

public class MultiplasRuntimeExceptionTest2 {
    public static void main(String[] args) {
        try{
            throw new IndexOutOfBoundsException();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }
        System.out.println("final do programa");

        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {

        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {
    }
}