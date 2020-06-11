package maratonajava.introducao.controlefluxo;

public class ExercicioSwitch {
    public static void main(String[] args) {
        /*
        Crie um switch que dado um valor de 1 a 7
        Considerando 1 domingo imprima se é dia util ou final de semana
         */
        byte dia = 0;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}
