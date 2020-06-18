package maratonajava.javacore.pt11_enumeracao.test;

import maratonajava.javacore.pt11_enumeracao.classes.Cliente;
import maratonajava.javacore.pt11_enumeracao.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Enzo", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(cliente);
    }
}
