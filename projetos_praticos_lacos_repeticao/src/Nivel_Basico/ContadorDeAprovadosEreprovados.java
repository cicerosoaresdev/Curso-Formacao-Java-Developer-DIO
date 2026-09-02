package Nivel_Basico;

import java.util.Locale;
import java.util.Scanner;

public class ContadorDeAprovadosEreprovados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        final double NOTA_APROVACAO = 7.0;
        final double NOTA_RECUPERACAO = 5.0;
        final double NOTA_MINIMA = 0.0;
        final double NOTA_MAXIMA = 10.0;

        System.out.println("\n-------- Relatório da Turma --------\n");
        System.out.print("Informe a quantidade de alunos: ");
        if (!input.hasNextInt()) {
            System.out.println("Erro: informe uma quantidade inteira.");
            input.close();
            return;
        }
        int quantidadeDeAlunos = input.nextInt();


        if (quantidadeDeAlunos <= 0) {
            System.out.println("Erro: a quantidade de alunos deve ser maior que zero.");
            input.close();
            return;
        }

        int aprovados = 0;
        int alunosEmRecuperacao = 0;
        int reprovados = 0;
        double somaDasNotas = 0;

        for (int i = 1; i <= quantidadeDeAlunos; i++){
            System.out.print("Digite a nota do "+ i +"º Aluno: ");
            if (!input.hasNextDouble()) {
                System.out.println("Erro: a nota deve ser um número.");
                input.close();
                return;
            }
            double notaDoAluno = input.nextDouble();

            if (notaDoAluno < NOTA_MINIMA || notaDoAluno > NOTA_MAXIMA) {
                System.out.println("Erro: a nota deve estar entre 0 e 10.");
                input.close();
                return;
            }
            if (notaDoAluno >= NOTA_APROVACAO){
                aprovados++;
            } else if (notaDoAluno >= NOTA_RECUPERACAO) {
                alunosEmRecuperacao++;

            }else {
                reprovados++;
            }

            somaDasNotas += notaDoAluno;

        }

        double mediaDaTurma = somaDasNotas / quantidadeDeAlunos;
        double percentualDeAprovados = aprovados * 100.0 / quantidadeDeAlunos;

        System.out.println("\n------- Resultado Geral da Turma -------\n");
        System.out.printf("Total de alunos aprovados: %d.%n", aprovados);
        System.out.printf("Total de alunos em recuperação: %d.%n", alunosEmRecuperacao);
        System.out.printf("Total de alunos reprovados: %d.%n", reprovados);
        System.out.printf("Média da turma: %.2f%n", mediaDaTurma);
        System.out.printf("Percentual de aprovados: %.2f%%%n", percentualDeAprovados);

        input.close();

    }
}
