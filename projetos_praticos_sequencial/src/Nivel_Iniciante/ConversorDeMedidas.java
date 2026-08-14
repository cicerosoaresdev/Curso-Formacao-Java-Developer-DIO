package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeMedidas {
    public static void main(String[] args) {
        //TODO: Converta quilômetros em metros, centímetros e milímetros.

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite uma distância em quilômetros: ");
        double quilometros = input.nextDouble();

        double metros = quilometros * 1_000;
        double centimetros = quilometros * 100_000;
        double milimetros = quilometros * 1_000_000;

        System.out.printf("%nDistância em quilômetros:  %.2fkm%n",
                quilometros);

        System.out.printf("Distância em metro: %.2fm%n",
                metros);

        System.out.printf("Distancia em centímetro:  %.2fcm%n",
                centimetros);


        System.out.printf("Distancia em milímetro:  %.2fmm%n",
                milimetros);


        input.close();
    }
}
