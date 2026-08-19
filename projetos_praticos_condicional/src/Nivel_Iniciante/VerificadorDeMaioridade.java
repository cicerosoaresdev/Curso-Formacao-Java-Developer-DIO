package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class VerificadorDeMaioridade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //TODO: Verifique se a pessoa é maior de idade.

        final int ANO_ATUAL = 2026;

        System.out.print("Digite o seu ano de nascimento: ");

        if (!input.hasNextInt()) {
            System.out.println("Entrada inválida! Digite apenas números.");
        } else {
            int anoDeNascimento = input.nextInt();

            if (anoDeNascimento <= 0 || anoDeNascimento > ANO_ATUAL) {
                System.out.println("Digite um ano entre 1 e " + ANO_ATUAL + "!");
            } else {
                int idade = ANO_ATUAL - anoDeNascimento;

                if (idade >= 18) {
                    System.out.println("Maior de Idade!");
                } else {
                    System.out.println("Menor de Idade!");
                }
            }
        }
        input.close();
    }
}
