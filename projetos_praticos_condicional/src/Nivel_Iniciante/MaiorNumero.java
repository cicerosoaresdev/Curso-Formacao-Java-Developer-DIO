package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //TODO:Verificar qual o maior número.

        System.out.print("Digite o primeiro numero: ");
        int primeiroNumero = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        int segundoNumero = input.nextInt();

        System.out.println("\n===== Usando o IF/ELSE =====\n");
        compararMaior(primeiroNumero,segundoNumero);


        System.out.println("\n===== Usando o Operador Ternário =====\n");
        String resultado = primeiroNumero > segundoNumero
                ? "O primeiro número é maior."
                : segundoNumero > primeiroNumero
                ? "O segundo número é maior."
                : "Os dois números são iguais.";

        System.out.println(resultado);

        input.close();
    }

    public static void compararMaior(int primeiroNumero, int segundoNumero){
        if (primeiroNumero > segundoNumero){
            System.out.println("O primeiro número é maior: "+primeiroNumero);
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("O segundo número é maior: "+segundoNumero);
        }else {
            System.out.println("Os dois números são iguais.");
        }



    }
}
