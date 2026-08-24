package Nivel_Intermediario;

import java.util.Locale;
import java.util.Scanner;

public class SistemaDeMedia {
    //TODO: Sistema de média com recupração, este projeto exige duas camadas de decisão.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a primeira nota do aluno: ");
        double primeiraNota = input.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        double segundaNota = input.nextDouble();

        verificarSituacao(primeiraNota,segundaNota,input);


        input.close();
    }

    public static void verificarSituacao(
            double primeiraNota,
            double segundaNota,
            Scanner input
    ) {


        double mediaAritmetica = (primeiraNota + segundaNota) / 2;


        if (mediaAritmetica >= 7.0) {

            System.out.printf("Aluno aprovado direto. Sua média é: %.2f%n", mediaAritmetica);

        } else if (mediaAritmetica >= 4.0) {
            System.out.printf("Aluno em recuperação. Sua média é: %.2f%n", mediaAritmetica);
            System.out.print("Digite a nota da recuperação do aluno: ");
            double notaRecuperacao = input.nextDouble();
            double mediaFinal = (notaRecuperacao + primeiraNota + segundaNota) / 3.0;
            if (mediaFinal >= 7.0) {
                System.out.printf("Aluno aprovado após recuperação. Sua média final é: %.2f%n", mediaFinal);
            } else {
                System.out.printf("Aluno reprovado após a recuperação. Sua média final é: %.2f%n", mediaFinal);

            }
        } else {
            System.out.printf("Aluno reprovado direto. Sua média é: %.2f%n", mediaAritmetica);

        }

    }
}