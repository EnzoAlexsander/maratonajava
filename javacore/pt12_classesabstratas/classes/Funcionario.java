package maratonajava.javacore.pt12_classesabstratas.classes;
// Classes abstratas foram feitas exclusivamente para serem extends (estendidas)
// Portanto, não pode ter 'final'
// Uma classe abstrata pode não ter nenhum método abstrato que continua sendo abstrata
// Se em uma classe tiver pelo menos 1 método abstrato, toda classe se torna abstrata
// Quando é criado um método abstrato, obrigatoriamente é necessário sobrescrever esse método na classe filha

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected String clt;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    public abstract void calculaSalario(); // Metodo abstrato não tem corpo "{};"

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}