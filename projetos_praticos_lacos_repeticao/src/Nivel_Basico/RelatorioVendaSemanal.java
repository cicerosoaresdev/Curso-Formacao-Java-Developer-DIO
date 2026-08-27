package Nivel_Basico;

import java.util.Locale;
import java.util.Scanner;

public class RelatorioVendaSemanal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US).useLocale(Locale.US);

        final String DIAS_DA_SEMANA = "Segunda-feira, Terça-feira, Quarta-feira," +
                "Quinta-feira, Sexta-feira, Sábado, Domingo";

        System.out.println("\n---- Faturamento Semanal ----\n");
        System.out.println("Dias considerados: " + DIAS_DA_SEMANA);
        System.out.println();

        double faturamentoTotal = 0;
        double maiorFaturamento = 0;
        double menorFaturamento = 0;
        int indiceMelhorDia = 0;
        int indicePiorDia = 0;
        String nomeMelhorDia = "";
        String nomePiorDia = "";

        for (int i = 1; i <= 7; i++){
            String nomeDiaAtual;

            if (i == 1) {
                nomeDiaAtual = "Segunda-feira";
            } else if (i == 2) {
                nomeDiaAtual = "Terça-feira";
            } else if (i == 3) {
                nomeDiaAtual = "Quarta-feira";
            } else if (i == 4) {
                nomeDiaAtual = "Quinta-feira";
            } else if (i == 5) {
                nomeDiaAtual = "Sexta-feira";
            } else if (i == 6) {
                nomeDiaAtual = "Sábado";
            } else {
                nomeDiaAtual = "Domingo";
            }

            System.out.printf("Digite o faturamento de %s: ", nomeDiaAtual);
            double faturamentoDia = input.nextDouble();

            faturamentoTotal += faturamentoDia;

            if (i == 1) {
                maiorFaturamento = faturamentoDia;
                menorFaturamento = faturamentoDia;
                indiceMelhorDia = i;
                indicePiorDia = i;
                nomeMelhorDia = nomeDiaAtual;
                nomePiorDia = nomeDiaAtual;
            } else {
                if (faturamentoDia > maiorFaturamento) {
                    maiorFaturamento = Math.max(maiorFaturamento, faturamentoDia);
                    indiceMelhorDia = i;
                    nomeMelhorDia = nomeDiaAtual;
                }

                if (faturamentoDia < menorFaturamento) {
                    menorFaturamento = Math.min(menorFaturamento, faturamentoDia);
                    indicePiorDia = i;
                    nomePiorDia = nomeDiaAtual;
                }
            }
        }

        double amplitude = maiorFaturamento - menorFaturamento;

        System.out.println("\n---- Relatório Final ----");
        System.out.printf("Faturamento total: R$ %.2f%n", faturamentoTotal);
        System.out.printf("Melhor venda: %s (índice %d) - R$ %.2f%n",
                nomeMelhorDia, indiceMelhorDia, maiorFaturamento);
        System.out.printf("Pior venda: %s (índice %d) - R$ %.2f%n",
                nomePiorDia, indicePiorDia, menorFaturamento);
        System.out.printf("Amplitude: R$ %.2f%n", amplitude);

        input.close();
    }
}
