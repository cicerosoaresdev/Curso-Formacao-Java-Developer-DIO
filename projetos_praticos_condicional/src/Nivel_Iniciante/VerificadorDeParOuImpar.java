package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class VerificadorDeParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //TODO: Verificando se o número é Par ou Impar.

        System.out.print("Digite um numero inteiro: ");
        if (!input.hasNextInt()){

            System.out.println("Entrada inválida! Digite apenas números inteiros.");
        }else {
            int numero = input.nextInt();

                if (numero % 2 == 0){

                    System.out.println("Número Par!");

                    }else {

                    System.out.println("Número Ímpar");
                }
        }

        input.close();
    }
}
