package Fase1_Entrada_e_Saída_de_Dados;

import java.util.Scanner;

public class FechaDeCadastroClientes {

    //TODO: Receba os dados do cliente e imprimar.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n====== Informe os dados da ficha abaixo.======\n");

        System.out.print("Nome completo: ");
        String nomeCompleto = input.nextLine();

        System.out.print("Idade: ");
        if (!input.hasNextInt()){
            System.out.println("Erro:Digite apenas números inteiros");
            input.close();
            return;
        }
        int idade = Integer.parseInt(input.nextLine());
        String idadeValidada;


            if (idade < 0 || idade > 150){
                idadeValidada = "Idade inválida!";
            }else{
                idadeValidada =String.valueOf(idade);
            }


        System.out.print("E-mail: ");
        String email = input.nextLine();

        System.out.print("Telefone: ");
        String telefone = input.nextLine();

        System.out.println("\n====== Ficha de Cadastro ======\n");
        System.out.println("===================================");
        System.out.printf("Nome: %s%n,", nomeCompleto);
        System.out.println("===================================");
        System.out.printf("Idade: %s%n,", idadeValidada);
        System.out.println("===================================");
        System.out.printf("Email: %s%n", email);
        System.out.println("===================================");
        System.out.printf("Telefone: %s%n", telefone);
        System.out.println("===================================");

        input.close();
    }

}
