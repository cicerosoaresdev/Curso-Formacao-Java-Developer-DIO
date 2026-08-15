package Nivel_Intermediario;

import java.util.Locale;
import java.util.Scanner;

public class ComprovanteSalarial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        // TODO: Demonstrar uma folha detalhada de pagamento.


        // Proventos (Ganhos)
        System.out.print("Digite o salário base do funcionário: R$ ");
        double salarioBase = input.nextDouble();

        System.out.print("Digite a hora extra trabalhada:  ");
        int horasExtras = input.nextInt();

        System.out.print("Digite o valor da hora extra: R$ ");
        double valorDaHoraExtra = input.nextDouble();

        System.out.print("Digite o valor das comissões: R$ ");
        double valorDasComissoes = input.nextDouble();

        //Descontos (Deduções)
        System.out.print("Digite o vale-alimentação: R$ ");
        double valeAlimentacao = input.nextDouble();

        System.out.print("Digite o vale-transporte: R$ ");
        double valeTransporte = input.nextDouble();

        System.out.print("Digite o desconto do INSS (Previdência Social)(7.5% a 14%): ");
        double percentualINSS = input.nextDouble();

        System.out.print("Digite o desconto do IRRF (Imposto de Renda)(0% a 27,5%): ");
        double percentualIRRF = input.nextDouble();


        double valorDasHorasExtras = horasExtras * valorDaHoraExtra;
        double valorDoINSS = salarioBase * (percentualINSS / 100.0);
        double valorDoIRRF = salarioBase * (percentualIRRF / 100.0);

        double salarioBruto = somarProvetos(
                salarioBase,
                valorDasComissoes,
                valorDasHorasExtras
        );

        double totalDeDescontos = somarDescontos(
                valeAlimentacao,
                valeTransporte,
                valorDoINSS,
                valorDoIRRF
        );

        double salarioLiquido = salarioBruto - totalDeDescontos;

        System.out.println("\n === Recibo de Pagamento de Sálario ===");
        System.out.println("===============================================");
        System.out.println("Descrição\t\tProvento\t\tDescontos");
        System.out.printf("Salário-Base\tR$ %.2f%n",salarioBase);
        System.out.printf("Comissões\t\tR$ %.2f%n",valorDasComissoes);
        System.out.printf("Horas Extra\t\tR$ %.2f%n",valorDaHoraExtra);
        System.out.printf("Vale-Transporte\t\t\t\tR$ %.2f%n",valeTransporte);
        System.out.printf("Vale-Alimentação\t\t\tR$ %.2f%n",valeAlimentacao);
        System.out.printf("INSS\t\t\t\t\t\t\tR$ %.2f%n", valorDoINSS);
        System.out.printf("IRRF\t\t\t\t\t\t\tR$ %.2f%n", valorDoIRRF);

        System.out.println("================================================");
        System.out.printf("Salário Bruto \t\tR$ %.2f%n", salarioBruto);
        System.out.println("================================================");
        System.out.printf("\t\t\t\t\tTotal de Descontos R$ %.2f%n", totalDeDescontos);
        System.out.println("================================================");
        System.out.printf("Valor Líquido \t\tR$ %.2f%n",salarioLiquido);
        System.out.println("================================================\n");
        input.close();
    }

    public static double somarProvetos(
            double salarioBase,
            double valorDaComisoes,
            double valorHorasTrabalhada
    ){
        return salarioBase + valorDaComisoes + valorHorasTrabalhada;
    }

    public static double somarDescontos(
            double valeAlimentacao,
            double valeTransporte,
            double valorDoINSS,
            double valorDoIRRF
    ){
        return valeAlimentacao + valeTransporte + valorDoINSS + valorDoIRRF;
    }
}