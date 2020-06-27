package maratonajava.javacore.pt15_exception.runtimeexception.test;

public class RunTimeExceptionTest2 {
    public static void main(String[] args) {
        Object o = null;
        try{
            int[] a = new int[2];
            System.out.println(a[2]);
            System.out.println("Imprimindo depois da possível excecao");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Fora do bloco catch");
    }
}
