package maratonajava.javacore.pt14_polimorfismo.classes;

public class Gerente extends Funcionario {
    private double pnl; // participação no lucro

    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + pnl;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }

}
