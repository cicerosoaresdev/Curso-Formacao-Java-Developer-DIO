package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

    public class CalculadoraDeDesconto {
    public static void main(String[] args) {
        //TODO: Calular o desconto do produto.
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== Calculadora de Desconto ===\n");

        System.out.print("Digite o preço do produto: ");
        double precoProduto = input.nextDouble();

        System.out.print("Digite o percentual do desconto (0 a 100): ");
        double percentualDesconto = input.nextDouble();

        double precoFinal = calcularDesconto(precoProduto, percentualDesconto);

        System.out.printf("%nPreço original: R$ %.2f%n",
                precoProduto);

        System.out.printf("Desconto aplicado: %.2f%%%n",
                percentualDesconto);

        System.out.printf("Preço final do produto: R$ %.2f%n",
                precoFinal);


        input.close();

    }

    public static double calcularDesconto(
            double precoProduto, double percentualDesconto){

        double valorDoDesconto = precoProduto * (percentualDesconto / 100.00);
        return precoProduto - valorDoDesconto;
    }

}
