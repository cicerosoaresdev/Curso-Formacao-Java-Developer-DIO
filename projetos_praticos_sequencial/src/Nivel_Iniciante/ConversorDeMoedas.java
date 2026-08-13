package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        //TODO:Converte um valor em reais para dólares e euros.

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Conversor de Moedas\n");

        System.out.print("Digite o valor em reais para a conversão: ");
        double valorEmReal = input.nextDouble();

        System.out.print("Digite a cotação do dólar atual: ");
        double cotacaoDolar = input.nextDouble();

        System.out.print("Digite a cotação do euro atual: ");
        double cotacaoEuro = input.nextDouble();

        double valorEmDolares = converterParaDolares(valorEmReal, cotacaoDolar);
        double valorEmEuros = converterParaEuro(valorEmReal, cotacaoEuro);

        System.out.println("\nResultado da Conversão\n");

        System.out.printf("O valor de R$ %.2f em dólares é igual a US$ %.2f%n",
                valorEmReal,
                valorEmDolares);

        System.out.printf("O valor de R$ %.2f em euros é igual a EUR %.2f%n",
                valorEmReal,
                valorEmEuros);




        input.close();
    }

    public static double converterParaDolares(double valorEmReal, double cotacaoDolar){
        return valorEmReal / cotacaoDolar;
    }

    public static double converterParaEuro(double valorEmReal, double cotacaoEuro){
        return valorEmReal / cotacaoEuro;
    }


}
