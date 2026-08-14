package Nivel_Basico;

import java.util.Locale;
import java.util.Scanner;

public class FolhaDePagamentoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        // TODO: Demonstrar uma folha simples de pagamento.

        System.out.print("Digite seu Salário Base: R$ ");
        double salarioBase = input.nextDouble();

        System.out.print("Digite o desconto do INSS (Previdência Social)(7.5% a 14%): ");
        double percentualINSS = input.nextDouble();

        System.out.print("Digite o desconto do IRRF (Imposto de Renda)(0% a 27,5%): ");
        double percentualIRRF = input.nextDouble();

        double valorDoINSS = salarioBase * (percentualINSS / 100.0);
        double valorDoIRRF = salarioBase * (percentualIRRF / 100.0);

        double descontoTotal = valorDoINSS + valorDoIRRF;
        double salarioLiquido = salarioBase - descontoTotal;


        System.out.println("\n === Recibo de Pagamento de Sálario ===");
        System.out.println("===============================================");
        System.out.println("Descrição\t\tProvento\t\tDescontos");
        System.out.printf("Salário-Base\tR$ %.2f%n",salarioBase);
        System.out.printf("INSS\t\t\t\t\t\t\tR$ %.2f%n", valorDoINSS);
        System.out.printf("IRRF\t\t\t\t\t\t\tR$ %.2f%n", valorDoIRRF);
        System.out.println("================================================");
        System.out.printf("\t\t\tTotal de Descontos R$ %.2f%n", descontoTotal);
        System.out.println("================================================");
        System.out.printf("Valor Líquido \t\tR$ %.2f%n",salarioLiquido);
        System.out.println("================================================\n");
        input.close();
    }
}
