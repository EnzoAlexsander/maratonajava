package maratonajava.javacore.pt14_polimorfismo.test;

import maratonajava.javacore.pt14_polimorfismo.classes.Funcionario;
import maratonajava.javacore.pt14_polimorfismo.classes.Gerente;
import maratonajava.javacore.pt14_polimorfismo.classes.RelatorioPagamento;
import maratonajava.javacore.pt14_polimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Pavel Nedved", 5000, 2000);
        Vendedor v = new Vendedor("Yohann Cruyff", 2000, 20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("-------------------------------");
//        relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("-------------------------------");
        relatorio.relatorioPagamentoGenerico(v);

    }
}
