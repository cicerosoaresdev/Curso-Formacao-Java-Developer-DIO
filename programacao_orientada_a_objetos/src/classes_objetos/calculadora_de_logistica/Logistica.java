package classes_objetos.calculadora_de_logistica;

import java.util.Locale;
import java.util.Scanner;

public class Logistica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        CalculadoraDeEficiencia calculadora = new CalculadoraDeEficiencia();

        System.out.println("\n------- Informações da Rota ------\n");
        System.out.print("Digite a distância ao seu destino: km: ");
        calculadora.distancia = input.nextDouble();

        System.out.print("Digite o comsumo do veículo: l/km: ");
        calculadora.consumoDoVeiculo = input.nextDouble();

        System.out.print("Digite o preço do combústivel: R$ ");
        calculadora.precoDoCombustivel = input.nextDouble();

        System.out.println("Digite o valor total dos pedagios: R$ ");
        calculadora.valorPedagio = input.nextDouble();

        System.out.println("Digite peso total da carga kg: ");
        calculadora.pesoDaCarga = input.nextDouble();

        System.out.println("Digite a quantidade tota de unidade: ");
        calculadora.qtdeUnidadesTransportadas = input.nextInt();

        System.out.println("\n-------------------------------------------\n");

        System.out.println("------- Relatório da Rota -------");
        System.out.printf("Custo total da viagem foi R$ %.2f%n",calculadora.calcularCustoViagem());
        System.out.printf("Custo total por unidade R$ %.2f%n",calculadora.calcularCPU());
        System.out.printf("Custo por quilograma R$ %.4f%n",calculadora.calcularCPKg());





        input.close();
    }
}
