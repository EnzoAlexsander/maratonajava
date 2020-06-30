package maratonajava.javacore.pt18_strings.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Enzo";
        nome = nome.concat(" Alexsander"); //<=> nome += " Alexsander";
        String nome2 = "Enzo";
        String nome3 = new String ("Assunção");//1 variavel de referencia, 2 um objeto do tipo String, 3 uma String no pool de String

        String teste = "Goku";
        String teste2 = "          aaaaOooo";
        String teste3 = "0123456789";
        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste2.replace('a', 'o'));
        System.out.println(teste2.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste3.substring(0,5));
        System.out.println(teste2.trim());
    }
}