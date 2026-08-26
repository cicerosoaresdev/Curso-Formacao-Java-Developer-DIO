package Nivel_Basico;

import java.util.Locale;
import java.util.Scanner;

public class PotenciaBibliotMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a base: ");
        if (!input.hasNextDouble()) {
            System.out.println("Erro: a base deve ser um número.");
            input.close();
            return;
        }
        double base = input.nextDouble();

        System.out.print("Digite um expoente inteiro não negativo: ");
        if (!input.hasNextInt()) {
            System.out.println("Erro: o expoente deve ser um número inteiro.");
            input.close();
            return;
        }
        int expoente = input.nextInt();

        if (expoente < 0) {
            System.out.println("Erro: o expoente não pode ser negativo.");
            input.close();
            return;
        }

        double resultado = 1.0;
        double quadrado = 1.0;
        double cubo = 1.0;
        double acumulador = 1.0;

        if (expoente == 0) {
            resultado = 1.0;
        }

        int limiteDoLaco = Math.max(expoente, 3);

        for (int i = 1; i <= limiteDoLaco; i++) {
            acumulador *= base;

            if (i == expoente && expoente > 0) {
                resultado = acumulador;
            }

            if (i == 2) {
                quadrado = acumulador;
            }

            if (i == 3) {
                cubo = acumulador;
            }
        }

        System.out.printf("%nBase: %.2f%n", base);
        System.out.printf("Expoente: %d%n", expoente);
        System.out.printf("Potência: %.2f%n", resultado);
        System.out.printf("Base ao quadrado: %.2f%n", quadrado);
        System.out.printf("Base ao cubo: %.2f%n", cubo);

        input.close();
    }
}

