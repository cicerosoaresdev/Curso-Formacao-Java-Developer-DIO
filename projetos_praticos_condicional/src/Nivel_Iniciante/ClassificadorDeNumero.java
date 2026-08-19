package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ClassificadorDeNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //TODO:Verifique se o numero é positivo, negativo ou zero.

        System.out.print("Digite um número: ");

        if (!input.hasNextInt()){

            System.out.println("Entrada inválida! Digite apenas números inteiros.");

        }else {
            int numero = input.nextInt();

            // Classificação 1: sinal

            if (numero > 0){
                System.out.println("Número positivo!");
            }else if (numero < 0){
                System.out.println("Número negativo");
            }else {
                System.out.println("É o Zero");
            }

            // Classificação 2: tamanho(magnitude)

            int modulo = Math.abs(numero);

            if (modulo < 100){
                System.out.println("Número pequeno!");
            } else if (modulo < 1000) {
                System.out.println("Número médio!");
            }else {
                System.out.println("Número grande!");
            }
        }

        input.close();
    }
}
