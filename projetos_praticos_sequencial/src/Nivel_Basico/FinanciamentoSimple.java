package Nivel_Basico;

import java.util.Locale;
import java.util.Scanner;

public class FinanciamentoSimple {
    public static void main(String[] args) {
            //TODO: Calculadora de Financiamento Simples.
            Scanner input = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("\n==== Recebendo as informações do Cliente ====\n");

            System.out.print("Digite o nome do produto: ");
            String nomeProduto = input.nextLine();

            System.out.print("Digite o preço: R$ ");
            double precoProduto = input.nextDouble();

            System.out.print("Digite o valor da entrada: R$ ");
            double valorEntrada = input.nextDouble();

            System.out.print("Digite a quantidade de pracelas: ");
            int quantidadeDeParcelas = input.nextInt();

        System.out.print("Digite o percentual de juros(2% a 5%): ");
        int percentualJuros = input.nextInt();

            double valorFinanciado = precoProduto - valorEntrada;
            double totalComJuros = valorFinanciado + (valorFinanciado * percentualJuros / 100.0);
            double valorDaParcela = totalComJuros / quantidadeDeParcelas;


            System.out.println("\n============ Recibo do Financiamento ==========");
            System.out.println("================================================");
            System.out.printf("Produto\t\tPreço\t\tEntrada\t\tParcelas\tJuros%n");
            System.out.println("----------------------------------------");

            System.out.printf("%s\t\tR$ %.2f\t\tR$ %.2f\t\t%d\t\t%d%%%n",
                    nomeProduto,
                    precoProduto,
                    valorEntrada,
                    quantidadeDeParcelas,
                    percentualJuros
            );
            System.out.println("================================================");
            System.out.printf("Valor financiado: R$ %.2f%n", valorFinanciado);
            System.out.printf("Total com juros: R$ %.2f%n", totalComJuros);
            System.out.printf("Valor das parcelas: R$ %.2f%n", valorDaParcela);
            System.out.println("================================================");

            input.close();
        }


}

