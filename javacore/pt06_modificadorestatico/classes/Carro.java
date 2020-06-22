package maratonajava.javacore.pt06_modificadorestatico.classes;

public class Carro {
    //Velocidade limite deve ser de 240km/h
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;
    //static public double velocidadeLimite = 240; Forma diferente de fazer

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("--------------------------------");
        System.out.println("Carro: " + this.nome);
        System.out.println("Velocidade maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + velocidadeLimite);
    }
    public Carro() {
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
