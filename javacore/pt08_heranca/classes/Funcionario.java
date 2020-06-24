package maratonajava.javacore.pt08_heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    {
        System.out.println("Bloco de inicialização de funcionario 1");
    }

    {
        System.out.println("Bloco de inicialização de funcionario 2");
    }

    static {
        System.out.println("Bloco de inicialização static de funcionario 1");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
