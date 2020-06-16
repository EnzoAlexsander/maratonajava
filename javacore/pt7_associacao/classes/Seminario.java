package maratonajava.javacore.pt7_associacao.classes;

public class Seminario {
    /*
    Crie um sistema que gerencie seminários
    Deverá cadastrar os seminários, cadastrar os alunos, cadastrar os professores e cadastrar um local
    Um aluno poderá estar em apenas um seminario
    Um seminario poderá ter nenhum ou vários alunos
    Um professor poderá ministrar um ou vários seminários
    Um seminário só poderá ter um professor
    Um seminário deverá ter um local.
    Seminário: titulo
    Aluno: Nome e idade
    Professor: Nome e especialidade
    Local: Rua e bairro
     */
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print() {
        System.out.println("----------------Relatório de seminários----------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Professor palestrante: " + this.professor.getNome());
        if (this.professor != null) {
            System.out.println("Professor: " + this.professor.getNome());
        } else {
            System.out.println("Nenhum professor cadastrado para esse seminario");
        }
        if (this.local != null) {
            System.out.println("Local: Rua " + this.local.getRua() + ", " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadastrado para esse seminario");
        }
        if (alunos != null && alunos.length != 0) {
            System.out.println("Alunos participantes: ");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado");
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
