package classes_objetos.Exercicios.Perfio_do_Usuario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Usuario administrador = new Usuario();

        System.out.println("\n------------ Cadastra Usúario ------------");
        System.out.print("Nome: ");
        administrador.nome = input.nextLine();
        System.out.print("Email: ");
        administrador.email = input.nextLine();
        System.out.print("Idade: ");
        administrador.idade = input.nextInt();
        input.nextLine();
        System.out.print("Cidade: ");
        administrador.cidade = input.nextLine();
        System.out.print("Telefone: ");
        administrador.telefone = input.nextLine();
        System.out.println("-----------------------------------------------");

        administrador.aprensentar();
        System.out.println("O usúario é maior de idade?: "+administrador.maiorDeIdade());

        administrador.mostraResulmo();


        input.close();
    }
}
