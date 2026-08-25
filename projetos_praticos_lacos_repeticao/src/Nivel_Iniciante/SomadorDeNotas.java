package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class SomadorDeNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a quantidade de alunos da turma: ");
        if (!input.hasNextInt()){
            System.out.println("Erro: Digite apenas numero inteiro!");
            input.close();
            return;
        }
        int qtdeAlunos = input.nextInt();

        System.out.println("----- Recebendo as notas dos Alunos -----");

        double soma = 0;

        for (int i = 1; i <= qtdeAlunos; i++){
            System.out.print("Nota do "+i+"º aluno: ");
            double nota = input.nextDouble();
            soma += nota;

        }
        double media = soma / qtdeAlunos;
        System.out.printf("A média da turma é igual: %.2f%n", media);

        if (media >= 7.0){
            System.out.println("Turma forte!");
        }else if (media >= 5.0){
            System.out.println("Turma regular!");
        }else{
            System.out.println("Turma fraca!");
        }










        input.close();

    }
}
