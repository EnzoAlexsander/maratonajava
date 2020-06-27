package maratonajava.javacore.pt15_exception.customexceptions.classes;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException(){
        super("Usuario ou senha invalidos");
    }
}
