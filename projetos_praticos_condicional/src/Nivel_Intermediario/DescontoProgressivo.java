package Nivel_Intermediario;

import java.util.Locale;
import java.util.Scanner;

public class DescontoProgressivo {

    private static final String CUPOM = "BEMVINDO10";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\n======Informe as informações da sua compra=====\n");

        System.out.print("Digite o valor da sua compra R$ ");
        double valorDaCompra = input.nextDouble();

        System.out.print("A formar de Pagamento foi PIX, S/N? ");
        char opcaoPix = input.next().toUpperCase().charAt(0);

        System.out.print("É cliente novo, S/N? ");
        char opcaoClienteNovo = input.next().toUpperCase().charAt(0);


        input.nextLine();
        System.out.print("Digite o cupom de desconto: ");
        String cupom = input.nextLine().trim().toUpperCase();

        System.out.println("\n");
        calcularDesconto(valorDaCompra, opcaoPix, opcaoClienteNovo, cupom);
        System.out.println("\n");

        input.close();
    }

    public static void calcularDesconto(
            double valorDaCompra,
            char opcaoPix,
            char opcaoClienteNovo,
            String cupom){

        double valorFinal = valorDaCompra;

        // 1. Desconto progressivo: compras ACIMA de R$ 500 recebem 15%
        if (valorDaCompra > 500.0){
            valorFinal -= valorFinal * 0.15;
            System.out.printf("Desconto de 15%% aplicado (compra > R$ 500). "
                    + "Novo valor: R$ %.2f%n", valorFinal);
        }

        // 2. PIX adiciona 10% SOBRE O VALOR JÁ AJUSTADO
        if (opcaoPix == 'S'){
            valorFinal -= valorFinal * 0.10;
            System.out.printf("Desconto de 10%% (PIX) aplicado. "
                    + "Novo valor: R$ %.2f%n", valorFinal);
        }

        // 3. Cupom BEMVINDO10 + cliente novo adiciona mais 10%
        if (CUPOM.equals(cupom) && opcaoClienteNovo == 'S'){
            valorFinal -= valorFinal * 0.10;
            System.out.printf("Desconto de 10%% (cupom + cliente novo) "
                    + "aplicado. Novo valor: R$ %.2f%n", valorFinal);
        }

        // 4. Frete grátis depende do valor FINAL (ex.: acima de R$ 200)

        boolean freteGratis = valorFinal > 200.0;

        System.out.println("\n====== Resumo ======");
        System.out.printf("Valor da compra:    R$ %.2f%n", valorDaCompra);
        System.out.printf("Valor final:        R$ %.2f%n", valorFinal);
        System.out.printf("Frete:              %s%n",
                freteGratis ? "GRÁTIS" : "R$ 15.00");

    }
}
