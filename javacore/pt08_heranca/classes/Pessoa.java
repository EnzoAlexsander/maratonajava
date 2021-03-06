package maratonajava.javacore.pt08_heranca.classes;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    static {
        System.out.println("Bloco de inicialização estático de pessoa");
    }

    {
        System.out.println("Bloco de inicialização de pessoa 1");
    }

    {
        System.out.println("Bloco de inicialização de pessoa 2");
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }


    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + ", " + this.endereco.getBairro());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
