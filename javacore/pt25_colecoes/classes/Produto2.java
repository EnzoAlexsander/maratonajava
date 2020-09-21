package maratonajava.javacore.pt25_colecoes.classes;

import java.util.Objects;

public class Produto2 implements Comparable<Produto2> {

    private String serialNumber;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto2(String serialNumber, String nome, double preco) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto2(String serialNumber, String nome, double preco, int quantidade) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto2 produto = (Produto2) o;
        return Objects.equals(serialNumber, produto.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "Produto2{" +
                "serialNumber='" + serialNumber + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto2 outroObjeto) {
        //negativo se thisObject < outroObjeto
        //Zero se thisObjetct == outroObjeto
        //Positivo se thisObjetct > outroObjeto
        return this.serialNumber.compareTo(outroObjeto.getSerialNumber());
    }
}