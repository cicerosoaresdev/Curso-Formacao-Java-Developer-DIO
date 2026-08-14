package Nivel_Basico;

import java.util.Locale;
import java.util.Scanner;

public class ReciboDeCompra {
    public static void main(String[] args) {
        //TODO: Apresente as informações dos Produtos no recibo de compra.
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\n==== Recebendo as informações dos Produtos ====\n");

        final double PERCENTUAL_DESCONTO = 10.0;

        System.out.println(" Produto 1: ");
        System.out.print("Nome: ");
        String produto01 = input.nextLine();

        System.out.print("Preço: ");
        double preco01 = input.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade01 = input.nextInt();

        System.out.println(" \nProduto 2: ");
        input.nextLine();

        System.out.print("Nome: ");
        String produto02 = input.nextLine();

        System.out.print("Preço: ");
        double preco02 = input.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade02 = input.nextInt();

        System.out.println("\nProduto 3: ");
        input.nextLine();

        System.out.print("Nome: ");
        String produto03 = input.nextLine();

        System.out.print("Preço: ");
        double preco03 = input.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade03 = input.nextInt();

        double subtotal  = calcularSubtotal(preco01,preco02,preco03,
                                            quantidade01,quantidade02,quantidade03);

        double valorDesconto = subtotal * (PERCENTUAL_DESCONTO / 100.0);

        double totalApagar = subtotal - valorDesconto;
        int quantidadeTotal = quantidade01+quantidade02+quantidade03;


        System.out.println("\n====== Recibo da compra ======");
        System.out.println("========================================");
        System.out.printf("Produto\t\tPreço\t\tQuantidade\tTotal%n");
        System.out.println("----------------------------------------");

        System.out.printf("%s\t\tR$ %.2f\t\t%d\t\tR$ %.2f%n",
                produto01,
                preco01,
                quantidade01,
                preco01 * quantidade01
        );
        System.out.printf("%s\t\tR$ %.2f\t\t%d\t\tR$ %.2f%n",
                produto02,
                preco02,
                quantidade02,
                preco02 * quantidade02
        );
        System.out.printf("%s\t\tR$ %.2f\t\t%d\t\tR$ %.2f%n",
                produto03,
                preco03,                quantidade03,
                preco03 * quantidade03

        );
        System.out.println("========================================");

        System.out.printf("Quantidade total de itens: %d%n", quantidadeTotal);
        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.printf("Desconto aplicado: %.2f%% — R$ %.2f%n",
                PERCENTUAL_DESCONTO,
                valorDesconto
        );
        System.out.printf("Total a pagar: R$ %.2f%n",totalApagar
        );

        System.out.println("========================================");

        input.close();
    }

    public static double calcularSubtotal(
            double preco01, double preco02, double preco03,
            int quantidade01,int quantidade02,int quantidade03){
        return  (preco01 * quantidade01 ) +
                      (preco02 * quantidade02) +
                      (preco03 * quantidade03);
    }

}
