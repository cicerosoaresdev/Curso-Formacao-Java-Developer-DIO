package Nivel_Basico;

import java.util.Scanner;

public class MaiorEmenorSequencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores: ");

        if (!input.hasNextInt()){
            System.out.println("Erro: digite apenas números inteiros!");
            input.close();
            return;
        }

        int qtdeValores = input.nextInt();



        if (qtdeValores <= 0){
            System.out.println("Erro: a quantidade deve ser maior que zero!");
            input.close();
            return;
        }

        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = input.nextInt();

        int maior = primeiroValor;
        int menor = primeiroValor;

        for (int i = 2 ; i <= qtdeValores; i++){
            System.out.print("Digite outro valor: ");
            int outroValor = input.nextInt();

            maior = Math.max(maior, outroValor);
            menor = Math.min(menor, outroValor);

        }

        int amplitude = maior - menor;

        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        System.out.println("Amplitude: "+amplitude);

        input.close();
    }
}
