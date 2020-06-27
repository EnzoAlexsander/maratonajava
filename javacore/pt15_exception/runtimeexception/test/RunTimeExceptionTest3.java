package maratonajava.javacore.pt15_exception.runtimeexception.test;

public class RunTimeExceptionTest3 {
    public static void main(String[] args) {
        divisao(10,0);
    }

    private static void divisao(int num1, int num2) {
        if(num2 ==0){
            throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
        }
        int result = num1/num2;
        System.out.println(result);
    }
}
