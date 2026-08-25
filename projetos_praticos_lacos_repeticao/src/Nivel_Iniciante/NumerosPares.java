package Nivel_Iniciante;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        if (!input.hasNextInt()){
            System.out.println("Erro: Digite apenas número inteiros!");
            input.close();
            return;
        }
        int primeiroNumero = input.nextInt();


        System.out.print("Digite o segundo numero: ");
        if (!input.hasNextInt()){
            System.out.println("Erro: Digite apenas número inteiros!");
            input.close();
            return;
        }
        int segundoNumero = input.nextInt();

        // Ajusta o intervalo caso o usuário digite o maior número primeiro
        int inicio = Math.min(primeiroNumero, segundoNumero);
        int fim = Math.max(primeiroNumero, segundoNumero);

        int contador = 0;

        System.out.println("\n---Números pares na faixa de "
                + inicio +" até "+ fim +".---");

        for (int i = inicio; i <= fim; i++){
            if (i % 2 == 0){
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("\nTotal de números pares na faixa de "
                + inicio +" até "+ fim +" é igual a "+ contador);

            input.close();
    }

}


