package classes_objetos.projetos.boletimEscolar;

public class Aluno {
    String nome;
    int matricula;
    String turma;

    public void mostrarDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Turma: "+this.turma);
    }

    public void alterarTurma(String novaTurma){

        this.turma = novaTurma;
    }
}
