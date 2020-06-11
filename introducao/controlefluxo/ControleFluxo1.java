package maratonajava.introducao.controlefluxo;

public class ControleFluxo1 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade <= 18 juvenil
        // idade >= 18 adulto

        int idade = 15;
        String categoria;
/* sem a String categoria, ↓
        if(idade < 15) {
            System.out.println("categoria infantil");
        }
        else if (idade >= 15 && idade <= 18){
            System.out.println("categoria juvenil");
        }else {
            System.out.println("categoria adulto");
        }

 */
        if(idade < 15) {
            categoria = "infantil";
        }
        else if (idade >= 15 && idade <= 18){
            categoria = "juvenil";
        }else {
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
