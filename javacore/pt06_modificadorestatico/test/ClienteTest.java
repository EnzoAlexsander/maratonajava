package maratonajava.javacore.pt06_modificadorestatico.test;


import maratonajava.javacore.pt06_modificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possíveis");
/*        for(int parcela : c.getParcelas()) {
            System.out.println(parcela + " ");
        }*/
        System.out.println("tamanho: "+ Cliente.getParcelas().length);
    }
}
