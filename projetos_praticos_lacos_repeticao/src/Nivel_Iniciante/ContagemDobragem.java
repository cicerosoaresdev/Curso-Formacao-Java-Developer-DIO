package Nivel_Iniciante;

import java.util.Scanner;

public class ContagemDobragem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        if (!input.hasNextInt()){
            System.out.println("Erro: Digite apenas números inteiros");
            input.close();
            return;
        }

        int numeroInteiro = input.nextInt();

        if (numeroInteiro < 1){
            System.out.println("Erro: Digite apenas números inteiros positivos");
        }else {

            System.out.println("\n--- Contagem ascendente ---");
            for (int i = 1; i <= numeroInteiro; i++){
                System.out.println(i);
            }

            System.out.println("\n--- Contagem ascendente dobrada ---");
            for (int i = 1; i <= numeroInteiro; i++){
                System.out.println(i * 2);
            }

        }


        input.close();
    }

}
