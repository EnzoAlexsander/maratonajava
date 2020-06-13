package maratonajava.javacore.pt2_introducaometodos.test;


import maratonajava.javacore.pt2_introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "332.342.948-98";
        prof.matricula = "2927";
        prof.nome = "Marcos Quezado";
        prof.rg = "3.345.424";


        Professor prof2 = new Professor();
        prof2.cpf = "456.234.878-45";
        prof2.nome = "Abigobaldo Lacerda";
        prof2.rg = "3.567.236";
        prof2.matricula = "8956";

        prof.imprime();
        prof2.imprime();
    }
}
