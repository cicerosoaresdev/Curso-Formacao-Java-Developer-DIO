package Nivel_Intermediario;

import java.util.Scanner;

public class ClassificadorEtaria {
    //TODO: Sistema de classificação de categoria esportiva de faixa etária.

    private static final int IDADE_MINIMA = 1;
    private static final int IDADE_MAXIMA = 120;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade do atleta: ");
        if (!input.hasNextInt()) {
            System.out.println("Digite uma idade válida usando apenas números inteiros.");
            return;
        }
        int idade = input.nextInt();


        classificarCategoria(idade);


        input.close();
    }
     public static void classificarCategoria(int idade){

        if (idade < IDADE_MINIMA || idade >IDADE_MAXIMA){
            System.out.println("Idade Inválida!");

        } else if (idade > 39){
             System.out.println("Atleta Sênior");
         }else if (idade > 18){
            System.out.println("Atleta Adulto");
        }else  if (idade > 13){
            System.out.println("Atleta Juvenil");
        }else {
            System.out.println("Atleta Infantil");
        }
    }

}
