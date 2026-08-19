package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDescontoRegra {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
    //TODO:Verificar se o preço de um produto vai recerber desconto.

        System.out.print("Digite o preço do produto: ");

        final double DESCONTO = 10.0;
        final double VALOR_MINIMO = 100.0;

        if (!input.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite apenas números.");
            input.close();
            return;
        }
        double precoDoProduto = input.nextDouble();

       if (precoDoProduto < 0){
           System.out.println("O preço não pode ser negativo");
       }else {
           aplicarDesconto(precoDoProduto,DESCONTO, VALOR_MINIMO);
       }

        input.close();
    }

    public static void aplicarDesconto(
            double precoDoProduto,
            final double DESCONTO,
            final double VALOR_MINIMO){

        if (precoDoProduto >= VALOR_MINIMO){
           double valorDesconto = precoDoProduto * DESCONTO / 100.0;
           double precoFinal = precoDoProduto - valorDesconto;

            System.out.println("O produto receberá um desconto de 10%.");
            System.out.printf("Preço original: R$ %.2f%n", precoDoProduto);
            System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
            System.out.printf("Preço final: R$ %.2f%n", precoFinal);
        }else {
            System.out.println("O produto não receberá desconto.");
            System.out.printf("Preço final: R$ %.2f%n", precoDoProduto);
        }

    }

}

