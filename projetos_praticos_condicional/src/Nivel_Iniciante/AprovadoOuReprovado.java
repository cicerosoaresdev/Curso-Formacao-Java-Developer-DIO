package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //TODO: Verificando se o aluno está Aprovado, Reprovado ou de Recuperação.

        System.out.print("Digite a nota final do aluno: ");
        if (!input.hasNextDouble()){
            System.out.println("Entrada inválida! Digite apenas números.");
        }else {
            double notaFinal = input.nextDouble();

            if (notaFinal < 0 || notaFinal > 10){

                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");

            }else {

                if (notaFinal >= 7.0) {
                    System.out.println("Aluno Aprovado!");
                } else if (notaFinal >= 5.0) {
                    System.out.println("Aluno de Recuperação!");
                    } else {
                    System.out.println("Aluno Reprovado!");
                    }
            }

        }



        input.close();
    }
}
