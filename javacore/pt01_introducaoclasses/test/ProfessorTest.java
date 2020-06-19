package maratonajava.javacore.pt01_introducaoclasses.test;

import maratonajava.javacore.pt01_introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "332.342.948-98";
        prof.nome = "Marcos Quezado";
        prof.rg = "3.345.424";
        prof.matricula = "2927";

        Professor prof2 = new Professor();
        prof2.cpf = "456.234.878-45";
        prof2.nome = "Abigobaldo Lacerda";
        prof2.rg = "3.567.236";
        prof2.matricula = "8956";

        System.out.println(prof.cpf);
        System.out.println(prof.nome);
        System.out.println(prof.rg);
        System.out.println(prof.matricula);
        System.out.println("------------------------------------------");
        System.out.println(prof2.cpf);
        System.out.println(prof2.nome);
        System.out.println(prof2.rg);
        System.out.println(prof2.matricula);
    }
}
