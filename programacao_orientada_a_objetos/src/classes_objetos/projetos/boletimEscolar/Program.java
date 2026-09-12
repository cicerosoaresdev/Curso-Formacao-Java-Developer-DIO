package classes_objetos.projetos.boletimEscolar;

public class Program {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Cicero";
        aluno.turma ="A";
        aluno.matricula = 52487;

        aluno.mostrarDados();

        Boletim boletim = new Boletim();
        boletim.aluno = aluno;
        boletim.nota1 = 8.25;
        boletim.nota2 = 6.65;
        boletim.nota3 = 9.44;

        boletim.mostrarResultado();

        aluno.alterarTurma("B");
        aluno.mostrarDados();


    }
}
