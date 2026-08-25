package Nivel_Iniciante;

import java.util.Scanner;

public class SequenciaDeMultiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da base: ");
        if (!input.hasNextInt()){
            System.out.println("Erro: Digite apenas número inteiros: ");
            input.close();
            return;
        }
        int base = input.nextInt();

        System.out.print("Digite o número para o limite: ");
        if (!input.hasNextInt()){
            System.out.println("Erro: Digite apenas número inteiros: ");
            input.close();
            return;
        }
        int limite = input.nextInt();

        for (int i = 1; base * i <= limite; i++){
            if (i > 1){
                System.out.print(", ");
            }
            System.out.print(base * i);

        }
        System.out.println();

        input.close();
    }
}
