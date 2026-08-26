package Nivel_Basico;

import java.util.Scanner;

public class CalculadoraDeFatoral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        if (!input.hasNextInt()){
            System.out.println("Erro: Digite apenas números inteiros!");
            input.close();
            return;
        }
        int numero = input.nextInt();

        if (numero < 0){

            System.out.println("Erro: o número não pode ser negativo.");

        } else if (numero == 0){

            System.out.println("0! = 1");
            
        }else if (numero > 20) {

            System.out.println("Erro: o resultado ultrapassa o limite do tipo long.");
        }else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++){
                fatorial *= i;
            }
            System.out.println(numero + "!= "+ fatorial);
        }

        input.close();
    }
}
