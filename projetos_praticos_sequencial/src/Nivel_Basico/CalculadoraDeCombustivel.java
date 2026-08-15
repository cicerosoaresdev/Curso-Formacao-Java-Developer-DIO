package Nivel_Basico;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeCombustivel {
    public static void main(String[] args) {
        //TODO: Calcular o gasto total da viagem.
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\n====== Orçamento da Viagem: ======");

        System.out.print("Digite a distância da viagem:  ");
        double distanciaDaViagem = input.nextDouble();

        System.out.print("Digite o consumo do veículo por quilômetros: ");
        double consumoDoVeiculo = input.nextDouble();

        System.out.print("Digite o preço do combustivel: R$ ");
        double preçoDoCombustivel = input.nextDouble();

        double litrosNecessario = distanciaDaViagem / consumoDoVeiculo;
        double custoEstimado = preçoDoCombustivel * litrosNecessario;


        System.out.println("\n========== Informações da Viagem =========");
        System.out.println("=============================================");
        System.out.println("========= Combustível e Distância ===========");
        System.out.printf("Distância da viagem: %.2fkm%n",distanciaDaViagem);
        System.out.printf("Preço Atual: R$ %.2f%n",preçoDoCombustivel);
        System.out.printf("Consumo do Carro:  %.2fkm/l%n",consumoDoVeiculo);
        System.out.println("\n================================================");
        System.out.println("============ Despesas da Viagem =============");
        System.out.printf("Litros necessarios de combustivel: %.2fl%n",litrosNecessario);
        System.out.printf("Custo estimado: R$ %.2f%n",custoEstimado);


        input.close();


    }
}




