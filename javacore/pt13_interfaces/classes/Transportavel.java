package maratonajava.javacore.pt13_interfaces.classes;

public interface Transportavel {
    // Sempre tentar dar nomes a interfaces como adjetivo (terminando em vel ou algo do tipo)
    // Não sendo possível, sempre colocar um I antes do nome para ser facilmente identificado.
    // Na interface todos os métodos são abstratos, publicos e estáticos por padrão
    // Ou seja, não é necessário usar "public abstratic", "public static". O IntelliJ vai falar que é redundante
    // E sendo abstrato, nunca terá corpo
    // Assim como no exemplo abaixo.

    public abstract void calculaFrete();
}
