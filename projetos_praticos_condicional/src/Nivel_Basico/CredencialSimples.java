package Nivel_Basico;


import java.util.Scanner;

public class CredencialSimples {

    private static final String USUARIO_CORRETO = "cicero";
    private static final String SENHA_CORRETA = "T94l25";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n======Informe suas credenciais abaixo=====\n");
        System.out.print("Usuário: ");
        String usuario = input.nextLine();

        System.out.print("Senha: ");
        String senha = input.nextLine();

        System.out.println("\n");
        verificarCredenciais(usuario, senha);
        System.out.println("\n");



        input.close();
    }
    public static void verificarCredenciais(String usuario, String senha){

        if (USUARIO_CORRETO.equals(usuario) && SENHA_CORRETA.equals(senha)){
            System.out.print("Bem-vindo! Welcome!");

        }else {
            System.out.println("Atenção!");
            System.out.print("Usuário e senha incorretos");
        }

    }
}







