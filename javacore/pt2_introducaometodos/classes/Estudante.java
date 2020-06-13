package maratonajava.javacore.pt2_introducaometodos.classes;

/*
Crie uma classe estudante com os seguintes atributos
nome
idade
notas // tres notas
crie um método para imprimir os dados e tirar a média desse aluno
caso a média seja maior que 6, imprimir aprovado, senão reprovado
 */
public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.notas != null) {
            for (double nota : this.notas) {
                System.out.print(nota + " ");
            }
        }
    }

    public void tirarMedia() {
        if (this.notas == null) {
            System.out.println("Esse aluno não possui notas");
            return;
        }
        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / this.notas.length;

        if (media > 6) {
            this.aprovado = true;
            System.out.println("\nA média é: " + media + " Situação: Aprovado");
        } else {
            this.aprovado = false;
            System.out.println("\nA média é: " + media + " Situação: Reprovado");
        }
    }

    //getters and setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }
    public boolean isAprovado() {
        return this.aprovado;
    }

}
