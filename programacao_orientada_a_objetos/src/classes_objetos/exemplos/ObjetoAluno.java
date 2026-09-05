package classes_objetos.exemplos;

public class ObjetoAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "Cicero";
        aluno.nota = 8.0;

        System.out.printf("O Aluno %s retirou uma nota %.2f%n", aluno.nome, aluno.nota);
        aluno.mostrarSituacao();



    }
}

