package Nivel_Intermediario;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeSeguro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        // TODO: Calcule o seguro o valor do seguro.

        System.out.print("Digite o valor do bem: R$ ");
        double valorDoBem = input.nextDouble();

        System.out.print("Digite a taxa do seguro(3% a 10%): ");
        double taxaDoSeguro = input.nextDouble();

        System.out.print("Digite a taxa administrativas(10% a 20%): ");
        double taxaAdministrativa = input.nextDouble();

        System.out.print("Digite o valor da franquia: R$ ");
        double valorDaFranquia = input.nextDouble();

        double valorDoSeguro = valorDoBem * (taxaDoSeguro / 100.0);
        double valorDaTaxaAdministrativa = valorDoBem * (taxaAdministrativa / 100.0);
        double premioDoSeguro = valorDoSeguro + valorDaTaxaAdministrativa;

        double custoTotalDaContratacao = premioDoSeguro
                + valorDaFranquia;

        System.out.println("\n=== Informações sobre o seguro ===");
        System.out.println("===============================================");
        System.out.println("Descrição\t\tValor");
        System.out.println("-----------------------------------------------");

        System.out.printf(
                "Valor do bem\t\tR$ %.2f%n",
                valorDoBem
        );

        System.out.printf(
                "Valor do seguro\tR$ %.2f%n",
                valorDoSeguro
        );

        System.out.printf(
                Locale.US,
                "Taxa administrativa\tR$ %.2f%n",
                valorDaTaxaAdministrativa
        );

        System.out.printf(
                "Valor da franquia\tR$ %.2f%n",
                valorDaFranquia
        );

        System.out.println("===============================================");

        System.out.printf(
                "Prêmio do seguro\tR$ %.2f%n",
                premioDoSeguro
        );

        System.out.printf(
                "Custo total da contratação: R$ %.2f%n",
                custoTotalDaContratacao
        );

        System.out.println("===============================================\n");
    }
}

