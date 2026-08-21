package Nivel_Basico;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDoImc {

    // Constantes com os limites oficiais das faixas do IMC.
    // Todas private: nenhum outro código precisa acessá-las diretamente.

    private static final double OBESIDADE = 30.0;
    private static final double SOBREPESO = 29.9;
    private static final double PESO_NORMAL = 18.5;

    //TODO:Classifique o resultado do IMC em faixas .

    public static void main(String[] args) {

               Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu Peso em quilogramas: ");
        double peso = input.nextDouble();

        System.out.print("Digite a sua Altura em metros: ");
        double altura = input.nextDouble();

        if (peso <= 0 || altura <=0){

            System.out.println("O peso e a altura não podem ser negativos nem zero");

        }else {

            classificarIMC(peso,altura);
        }

        input.close();
    }

    // Classifica o IMC nas faixas oficiais, usando comparação de baixo para cima.
    public static void classificarIMC(double peso, double altura) {
        double imc = peso / Math.pow(altura, 2.0);

        if (imc < PESO_NORMAL) {
            System.out.printf("Seu IMC = %.2f. Você está com baixo peso.%n", imc);
        } else if (imc <= SOBREPESO) {
            System.out.printf("Seu IMC = %.2f. Você está com peso normal.%n", imc);
        } else if (imc < OBESIDADE) {
            System.out.printf("Seu IMC = %.2f. Você está com sobrepeso.%n", imc);
        } else {
            System.out.printf("Seu IMC = %.2f. Você está com obesidade.%n", imc);
        }
    }

}
