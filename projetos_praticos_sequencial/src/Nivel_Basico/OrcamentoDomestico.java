package Nivel_Basico;

import java.util.Locale;
import java.util.Scanner;

public class OrcamentoDomestico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //TODO: Calcular quanto sobra no final do mês.

        System.out.println("\n====== Preencher as informações abaixo: ======");

        System.out.print("Digite a sua menda mensal: R$ ");
        double rendaMensal = input.nextDouble();

        System.out.print("Digite o valor da Renda Extra: R$ ");
        double rendaExtra = input.nextDouble();

        System.out.print("Digite o valor gasto no Supermercado: R$ ");
        double supermercado = input.nextDouble();

        System.out.print("Digite o valor gasto com Combustível: R$ ");
        double combustivel = input.nextDouble();

        System.out.print("Digite o valor gasto com Água/Luz: R$ ");
        double aguaELuz = input.nextDouble();

        System.out.print("Digite o valor gasto com Aluguel: R$ ");
        double aluguel = input.nextDouble();

        System.out.print("Digite o valor gasto com Internet: R$ ");
        double internet = input.nextDouble();

        double totalDasDespesas = somarDespesas(
                supermercado,
                combustivel ,
                aguaELuz   ,
                aluguel     ,
                internet

        );

        double saldoLiquido = rendaMensal + rendaExtra - totalDasDespesas;

        System.out.println("\n====== ORÇAMENTO DOMÉSTICO ======");
        System.out.println("===================================");
        System.out.println("============ Receitas =============");
        System.out.printf("Salário\t\t\t\t R$ %.2f%n",rendaMensal);
        System.out.printf("Extras\t\t\t\t R$ %.2f%n",rendaExtra);
        System.out.println("\n=================================");
        System.out.println("============ Despesas =============");
        System.out.printf("Supermercado\t\t\tR$ %.2f%n",supermercado);
        System.out.printf("Combustível\t\t\t\tR$ %.2f%n",combustivel);
        System.out.printf("Água/Luz\t\t\t\tR$ %.2f%n",aguaELuz);
        System.out.printf("Aluguel\t\t\t\t\tR$ %.2f%n",aluguel);
        System.out.printf("Internet\t\t\t\tR$ %.2f%n",internet);
        System.out.println("\n=================================");
        System.out.printf("Total das Despesas\tR$ %.2f%n",totalDasDespesas);
        System.out.println("\n=================================");
        System.out.printf("Saldo Líquido\t\tR$ %.2f%n",saldoLiquido);


        input.close();


    }
    public static double somarDespesas(
            double supermercado,
            double combustivel,
            double aguaELuz,
            double aluguel,
            double internet
    ){
        return  supermercado+
                combustivel +
                aguaELuz    +
                aluguel     +
                internet    ;

    }
}
