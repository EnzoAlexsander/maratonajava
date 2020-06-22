package maratonajava.javacore.pt07_associacao.test;

import maratonajava.javacore.pt07_associacao.classes.Aluno;
import maratonajava.javacore.pt07_associacao.classes.Local;
import maratonajava.javacore.pt07_associacao.classes.Professor;
import maratonajava.javacore.pt07_associacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Enzo Alexsander", 22);
        Aluno aluno2 = new Aluno("Alessandra Duarte", 23);

        Seminario sem = new Seminario("Casamento Blindado");

        Professor prof = new Professor("Zlatan Ibrahimovic", "Fazer golaço no casamento");

        Local local = new Local("Ourinhos", "Santa Rita de Cassia-BA");


        aluno.setSeminario(sem);
        aluno2.setSeminario((sem));

        sem.setAlunos(new Aluno[]{aluno, aluno2});

        sem.setProfessor(prof);
        sem.setLocal(local);

        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        sem.print();
        prof.print();
    }
}
