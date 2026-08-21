package Nivel_Basico;

import java.util.Locale;
import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("\n===Informe três numero===\n");

        System.out.print("Digite o primeiro número: ");
        if (!input.hasNextInt()) {
            System.out.println("Entrada inválida. Digite apenas números.");
            input.close();
            return;
        }
        int primeiroNumero = input.nextInt();

        System.out.print("Digite o segundo número: ");
        if (!input.hasNextInt()) {
            System.out.println("Entrada inválida. Digite apenas números.");
            input.close();
            return;
        }
        int segundoNumero = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        if (!input.hasNextInt()) {
            System.out.println("Entrada inválida. Digite apenas números.");
            input.close();
            return;
        }
        int terceiroNumero = input.nextInt();


        System.out.println("\n===== Resultado =====\n");

        encontrarNumeroMaior(primeiroNumero,segundoNumero,terceiroNumero);




        input.close();
    }
    //Comprando em sequência
    public static void  encontrarNumeroMaior(
            int primeiroNumero, int segundoNumero, int terceiroNumero){

        int maior = primeiroNumero;
        if (segundoNumero > maior){
            maior = segundoNumero;
        }
        if (terceiroNumero > maior) {
            maior = terceiroNumero;
        }
        System.out.println("O maior numero "+maior+" é o maior");

    }

}
