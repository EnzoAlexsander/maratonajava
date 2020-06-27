package maratonajava.javacore.pt15_exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e) {
            System.out.println("Dentro do Runtimeexception");
        }
        try {
            talvezLanceException();
        } catch (SQLException e){

        } catch (IOException e){

        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
