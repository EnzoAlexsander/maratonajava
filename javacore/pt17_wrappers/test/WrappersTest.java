package maratonajava.javacore.pt17_wrappers.test;

public class WrappersTest {
    public static void main(String[] args) {
        //Tipos primitivos
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10;
        float floatPrimitivo = 10;
        double doublePrimitivo = 10;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        // Wrappers dos tipos primitivos
        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer integerWrapper = 1;
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character characterWrapper = 'A';
        Boolean booleanWrapper = true;

        String valor = "10";
        Float f = Float.parseFloat(valor);
        System.out.println(f);

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetterOrDigit('#'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
    }
}
