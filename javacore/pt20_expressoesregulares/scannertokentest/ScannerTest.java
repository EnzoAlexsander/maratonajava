package maratonajava.javacore.pt20_expressoesregulares.scannertokentest;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("1 true 100 oi");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        System.out.println("-----------------------------------------");
        Scanner scanner2 = new Scanner("1 true 100 oi");
        while(scanner2.hasNext()){
            if(scanner2.hasNextInt()) {
                int inteiro = scanner2.nextInt();
                System.out.println("int "+inteiro);
            } else if (scanner2.hasNextBoolean()){
                boolean booleano = scanner2.nextBoolean();
                System.out.println("boolean "+booleano);
            } else{
                System.out.println(scanner2.next());
            }
        }

    }
}
