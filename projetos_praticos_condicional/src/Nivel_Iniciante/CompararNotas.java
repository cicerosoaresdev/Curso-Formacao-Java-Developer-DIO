package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class CompararNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //TODO:Fazer a comparação de duas notas de dois alunos.

        System.out.println("Digite a nota a nota de Maria: ");
        double notaMaria = input.nextDouble();

        System.out.println("Digite a nota a nota de João: ");
        double notaJoao = input.nextDouble();

        System.out.println("\n--- Resultado ---");

        // Comparação das notas
        if (notaMaria > notaJoao){
            System.out.println("Maria obteve a melhor nota");
        }else if (notaJoao > notaMaria){
            System.out.println("João obteve a melhor nota");
        }else {
            System.out.println("Maria e João estão empatados");
        }

        // Verificação da média mínima de Maria
        if (notaMaria < 6.0){
            System.out.println("Maria está abaixo média da minima");
        }else {
            System.out.println("Maria atingiu a média mínima.");
        }



        input.close();
    }
}
