package maratonajava.introducao.controlefluxo;

public class ExercicioWhileDoWhileFor {
    public static void main(String[] args) {
        //imprima todos os numeros impares de 0 ate 100000
        int valor = 100;
        for(int i=0; i<=valor; i++) {
            if(i%2!=0) {
                System.out.println(i);
            }
        }
    }
}
