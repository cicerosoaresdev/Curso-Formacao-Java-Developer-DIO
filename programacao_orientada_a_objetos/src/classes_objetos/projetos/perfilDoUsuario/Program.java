package classes_objetos.projetos.perfilDoUsuario;

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

        administrador.apresentar();

        System.out.println("É maior de idade?: "+administrador.maiorDeIdade());
        System.out.println("Pode criar conta?: "+administrador.podeCriarConta());

        administrador.mostrarResumo();

        input.close();
    }
}
