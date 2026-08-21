package Nivel_Basico;

import java.util.Locale;
import java.util.Scanner;

public class ClassificarTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\n===Informe os valores dos lados do triângulo===\n");

        System.out.print("Digite o primeiro lado: ");
        if (!input.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite apenas números.");
            input.close();
            return;
        }
        double lado1 = input.nextDouble();

        System.out.print("Digite o segundo lado: ");
        if (!input.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite apenas números.");
            input.close();
            return;
        }
        double lado2 = input.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        if (!input.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite apenas números.");
            input.close();
            return;
        }
        double lado3 = input.nextDouble();

        classificarTriangulo(lado1,lado2,lado3);



        input.close();
    }

    public static void classificarTriangulo(
            double lado1, double lado2, double lado3){

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Os lados devem ser maiores que zero.");
            return;
        }
        //Verificar se forma um triângulo
        if (lado1 < (lado2+lado3)
                && lado2 < (lado1+lado3)
                && lado3 < (lado1+lado2) ){

            //Classificação do Triângulo
            if (lado1 == lado2 && lado1 == lado3){
                System.out.println("Triângulo EQUILÁTERO");
            }else if (lado1 == lado2
                    || lado1 == lado3
                    || lado2 == lado3){
                System.out.println("Triângulo ISÓSCELES");
            }else{
                System.out.println("Triângulo ESCALENO");
            }

        }else {
            System.out.println("Atenção! Os valores não formam um triângulo");

        }
    }
}
