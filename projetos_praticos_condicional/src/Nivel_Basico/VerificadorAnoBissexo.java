package Nivel_Basico;

import java.util.Locale;
import java.util.Scanner;

public class VerificadorAnoBissexo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um ano qualquer: ");
        if (!input.hasNextInt()){
            System.out.println("Entrada inválida. Digite apenas números.");
            input.close();
            return;
        }
        int ano = input.nextInt();

        if (ano <= 0){

            System.out.println("O ano não pode ser negativo nem zero ");

        }else {

            verificarAnoBissexto(ano);
        }




        input.close();
    }

    public static void verificarAnoBissexto(int ano){
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ){
            System.out.println(ano + " é um ano Bissexto!");
        }else {
            System.out.println(ano + " não é um ano Bissexto!");
        }
    }

}
