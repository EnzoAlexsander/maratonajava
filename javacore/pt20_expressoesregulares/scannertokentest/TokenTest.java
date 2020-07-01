package maratonajava.javacore.pt20_expressoesregulares.scannertokentest;

public class TokenTest {
    public static void main(String[] args) {
        String string = "Enzo, Ale, Lena, Amadeu, Fred, Jo, Jesus";
        String[] tokens = string.split(",");
        for(String array: tokens){
            System.out.println(array.trim()); // Lembrando! - .trim() elimina os espaços em branco
        }
    }
}
