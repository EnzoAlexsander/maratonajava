package maratonajava.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        // Valores de inicialização dos arrays
        // byte, short, int, long, float, double = 0
        // char = '\u0000' ' '
        // boolean = false;
        // String = reference null

        String [] nomes = new String[5];
        nomes[0] = "Messi";
        nomes[1] = "CR7";
        nomes[2] = "Lucas Moura";
        nomes[3] = "Ibrahimovic";
        nomes[4] = "Rogerio Ceni";

        for(int i=0; i<nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
