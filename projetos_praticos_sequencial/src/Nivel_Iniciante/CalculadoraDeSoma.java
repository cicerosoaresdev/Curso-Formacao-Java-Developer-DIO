package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeSoma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //TODO: Receber dois valores e calcular a soma entre eles.

        System.out.print("Digite o primeiro valor: ");
        double numero1 = input.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double numero2 = input.nextDouble();

        // Variavel recebe o método do calculo
        double resultado = somarValores(numero1, numero2);

        System.out.printf("A soma entre o número %.2f e o número %.2f é igual a: %.2f%n",
                numero1,
                numero2,
                resultado);

        input.close();
    }



    public static double somarValores(double numero1, double numero2){
       return numero1 + numero2;

    }
}