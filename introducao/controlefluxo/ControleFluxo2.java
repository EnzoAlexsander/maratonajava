package maratonajava.introducao.controlefluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 17;
        String status;
        boolean ok = true;
        status = idade < 18 ? "nao adulto" : "adulto";
        System.out.println(status);
    }
}