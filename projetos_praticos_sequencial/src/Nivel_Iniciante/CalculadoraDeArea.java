package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        // TODO: Calcular a área de um triângulo, de um quadrado e um retângulo.

        System.out.println("=== Calculadora de Áreas ===\n");

        //Informações do Triângulo
        System.out.print("Digite a base do triângulo: ");
        double baseTriangulo = input.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double alturaTriangulo = input.nextDouble();

        //Informações do Retângulo
        System.out.print("Digite a base do retângulo: ");
        double baseRetangulo = input.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double alturaRetangulo = input.nextDouble();

        //Informações do Quadrado
        System.out.print("Digite a medida de um lado do quadrado: ");
        double medidaDoLado = input.nextDouble();

        double triangulo = calcularAreaDoTriangulo(baseTriangulo, alturaTriangulo);
        double retangulo = calcularAreaDoRetangulo(baseRetangulo,alturaRetangulo);
        double quadadro = calcularAreaDoQuadrado(medidaDoLado);

        System.out.println("\n=== Resultados ===");

        System.out.printf("Área do Triângulo: %.2f%n", triangulo);
        System.out.printf("Área do Retângulo: %.2f%n", retangulo);
        System.out.printf("Área do Quadrado: %.2f%n", quadadro);

        input.close();
    }

    public static double calcularAreaDoTriangulo(double baseTriangulo, double alturaTriangulo){
        return (baseTriangulo * alturaTriangulo) / 2.0;
    }

    public static double calcularAreaDoRetangulo(double baseRetangulo, double alturaRetangulo){
        return baseRetangulo * alturaRetangulo;
    }

    public static double calcularAreaDoQuadrado(double medidaDoLado){
        return Math.pow(medidaDoLado, 2.0);
    }
}
