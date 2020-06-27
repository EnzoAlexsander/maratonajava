package maratonajava.javacore.pt15_exception.checkedexception.test;

public class CheckedExceptionTest4 {
    public static void main(String[] args) {
        abrirArquivo();
    }

    public static void abrirArquivo() {
        try {
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitura do arquivo");
            //throw new Exception();
            System.out.println("Escrevendo no arquivo");
        } catch (Exception e) {
            System.out.println("Dentro do catch");
            e.printStackTrace();
        } finally {
            System.out.println("Fechar o arquivo");
        }
    }

}