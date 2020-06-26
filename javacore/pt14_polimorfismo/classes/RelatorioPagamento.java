package maratonajava.javacore.pt14_polimorfismo.classes;

public class RelatorioPagamento {
/*    public void relatorioPagamentoGerente(Gerente gerente){
        System.out.println("Gerando relatorio de pagamento para a gerencia");
        gerente.calcularPagamento();
        System.out.println("Nome: "+gerente.getNome());
        System.out.println("Salário desse mês: "+gerente.getSalario());
    }

    public void relatorioPagamentoVendedor(Vendedor vendedor){
        System.out.println("Gerando relatorio de pagamento para os vendedores");
        vendedor.calcularPagamento();
        System.out.println("Nome: "+vendedor.getNome());
        System.out.println("Salário desse mês: "+vendedor.getSalario());
    }*/
    // Com o polimorfismo, esse código abaixo esse equivale a todas essas linhas acima

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatorio de pagamento para os vendedores");
        funcionario.calcularPagamento();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Salário desse mês: "+funcionario.getSalario());
        if(funcionario instanceof Gerente){
            Gerente g = (Gerente)funcionario;
            System.out.println("Participação nos lucros: "+g.getPnl());
        }
        if(funcionario instanceof Vendedor){
            System.out.println("Total vendas: "+((Vendedor) funcionario).getTotalVendas());
        }
    }
}
