package maratonajava.javacore.pt15_exception.customexceptions.test;

import maratonajava.javacore.pt15_exception.customexceptions.classes.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        String usuarioBancoDeDados = "123";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";
        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)) {
            throw new LoginInvalidoException();
        }else {
            System.out.println("Logado");
        }
    }
}
