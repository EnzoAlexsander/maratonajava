package maratonajava.javacore.pt15_exception.error.test;

// stack =

public class ErrorTest {
    public static void main(String[] args) {
        stackoverflowError();
    }
    public static void stackoverflowError() {
        stackoverflowError();
    }
}
