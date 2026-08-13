package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeGorjeta {
    public static void main(String[] args) {
        //TODO: Descubrir o valor da gorjeta.
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("==== Descubra o valor da Gorjeta =====\n");

        System.out.print("Digite o valor total da conta: ");
        double valorTotalDaConta = input.nextDouble();

        System.out.print("Digite o percentual da gorjeta(0 a 10): ");
        double percentualDaGorjeta = input.nextDouble();

        System.out.print("Digite o total de pessoas da mesa: ");
        int totalDePessoas = input.nextInt();

        double valorDaGojeta = calcularGorjeta(valorTotalDaConta, percentualDaGorjeta);
        double valorTotal = valorTotalDaConta + valorDaGojeta;
        double valorIndividual = valorTotal / totalDePessoas;


        System.out.printf("%nValor da gorjeta: R$ %.2f%n",
                valorDaGojeta);

        System.out.printf("Valor total: %.2f%n",
                valorTotal);

        System.out.printf("Valor individual por pessoa: R$ %.2f%n",
                valorIndividual);

        input.close();
    }

    public static double calcularGorjeta(
            double valorTotalDaConta, double percentualDeGorjeta){
        return valorTotalDaConta * (percentualDeGorjeta / 100.0);

    }
}
