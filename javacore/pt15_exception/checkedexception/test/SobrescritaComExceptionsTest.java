package maratonajava.javacore.pt15_exception.checkedexception.test;

import maratonajava.javacore.pt15_exception.checkedexception.classes.Funcionario;
import maratonajava.javacore.pt15_exception.checkedexception.classes.Pessoa;

/* Opções para fazer a sobrescrita
1- não declara nada
public class Funcionario extends Pessoa{
   public void salvar() {
   }

2- declara qualquer classe que seja Runtime ou subclasses de RuntimeException
3- declara as mesmas classes ou subclasses das exceções
*/

public class SobrescritaComExceptionsTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        f.salvar();
    }
}
