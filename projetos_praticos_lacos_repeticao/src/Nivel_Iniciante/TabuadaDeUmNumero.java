package Nivel_Iniciante;

import java.util.Scanner;

public class TabuadaDeUmNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        if (!input.hasNextInt()){
            System.out.println("Erro: Digite apenas números inteiros");
            input.close();
            return;
        }
        int multiplicando = input.nextInt();

        for(int i = 1; i <= 10; i++){
            int resultado = multiplicando * i;
            System.out.printf("%d x %2d = %3d%n",multiplicando,i,resultado);
        }

        input.close();
    }
}
