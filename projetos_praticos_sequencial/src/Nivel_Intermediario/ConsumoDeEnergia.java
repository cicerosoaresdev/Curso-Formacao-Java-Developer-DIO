package Nivel_Intermediario;

import java.util.Locale;
import java.util.Scanner;

public class ConsumoDeEnergia {
    public static void main(String[] args) {
        //TODO: Calculadora de consumo de energia.
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\n==== Simulador de Consumo de Energia ====\n");

        System.out.print("Digite o nome do aparelho: ");
        String nomeAparelho = input.nextLine();

        System.out.print("Digite a potência do aparelho (Watts): ");
        int potenciaDoAparelho = input.nextInt();

        System.out.print("Digite quantas horas de uso por dia: ");
        int horasPorDia = input.nextInt();

        System.out.print("Digite quantos dias de uso durante o mês: ");
        int diasNoMes = input.nextInt();

        System.out.print("Digite valor cobrado por cada quilowatt-hora: R$ ");
        double valorDoKWh = input.nextDouble();

        double consumoMensal = calcularConsumo(potenciaDoAparelho, horasPorDia, diasNoMes);
        double custoMensal = consumoMensal * valorDoKWh;

        System.out.println("\n================================================");
        System.out.println("Resumo do consumo");
        System.out.println("==================================================");

        System.out.printf(
                "Aparelho: %s%n",
                nomeAparelho
        );

        System.out.printf(
                "Potência: %d W%n",
                potenciaDoAparelho
        );

        System.out.printf(
                "Horas de uso por dia: %d h%n",
                horasPorDia
        );

        System.out.printf(
                "Dias de uso no mês: %d dias%n",
                diasNoMes
        );

        System.out.printf(
                "Valor do kWh: R$ %.2f%n",
                valorDoKWh
        );

        System.out.printf(
                "Consumo total mensal: %.2f kWh%n",
                consumoMensal
        );

        System.out.printf(
                "Custo mensal: R$ %.2f%n",
                custoMensal
        );

        System.out.println("================================================");


        input.close();
    }

    public static double calcularConsumo(
            int potenciaDoAparelho,
            int horasPoDia,
            int diasNoMes
    ){
        return (potenciaDoAparelho * horasPoDia * diasNoMes) / 1000.0;
    }


}



