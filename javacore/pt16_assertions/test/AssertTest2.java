package maratonajava.javacore.pt16_assertions.test;

public class AssertTest2 {
    public static void main(String[] args) {
        diasDaSemana(9);
    }
    //Exemplo 2
    public static void diasDaSemana(int dia) {
        switch (dia) {
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default: assert false: "Os dias da semana são de 1 a 7. Voce digitou: "+dia;
        }
    }
}
